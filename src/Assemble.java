import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by andrew on 4/20/16.
 */


public class Assemble {
    public static final int MEMORY_SIZE = 4096;
    public MemoryCell[] memory;
    public short END = MEMORY_SIZE-1;
    public short pc = 0;
    public Map<String, Short> LableMap;

    public Assemble(){
        memory = new MemoryCell[MEMORY_SIZE];
        for (int i = 0; i < MEMORY_SIZE; i++){
            memory[i] = new MemoryCell((short)0);
        }
        LableMap = new HashMap<>();
    }

    public void AssembleInstruction(Mu0Parser.InstructionContext ctx) throws ParseException{
        if (ctx.MEM() != null){
            int count = (ctx.getChildCount() - 4) / 2;
            int tmp = count - 1;
            for (int i = 4; i < ctx.getChildCount(); i+= 2){
                memory[END - tmp] = new MemoryCell(Short.parseShort(ctx.getChild(i).getText()));
                tmp--;
            }
            END -= count;
            LableMap.put("["+ctx.getChild(1).getText()+"]", (short)(END + 1));
            return;
        }

        int offset = 0;
        if (ctx.LABEL() != null){
            LableMap.put("[" + ctx.getChild(0).getText() + "]", pc);
            offset = 2;
        }

        if (ctx.STP() != null){
            memory[pc] = new MemoryCell((short)0b0111_0000_0000_0000);
            pc++;
            return;
        }

        short opnd = Evaluate((Mu0Parser.ExprContext)ctx.getChild(offset+1));

        short opcode = 0;
        if (ctx.LDA() != null){
            opcode = 0b0000_0000_0000_0000;
        } else if (ctx.STO() != null){
            opcode = 0b0001_0000_0000_0000;
        } else if (ctx.ADD() != null){
            opcode = 0b0010_0000_0000_0000;
        } else if (ctx.SUB() != null){
            opcode = 0b0011_0000_0000_0000;
        } else if (ctx.JMP() != null){
            opcode = 0b0100_0000_0000_0000;
        } else if (ctx.JGE() != null){
            opcode = 0b0101_0000_0000_0000;
        } else if (ctx.JNE() != null){
            opcode = 0b0110_0000_0000_0000;
        } else {
            throw new ParseException("Parse Error", 0);
        }
        memory[pc] = new MemoryCell((short)(opcode | opnd));
        pc++;
    }

    public short Evaluate(Mu0Parser.ExprContext ctx){
        if (ctx.NUMBER() != null) {
            return Short.parseShort(ctx.getChild(0).getText());
        } else if (ctx.LABLEVAR() != null){
            return LableMap.get(ctx.getChild(0).getText());
        }
        else if (ctx.PLUS() != null){
            return (short)(Evaluate((Mu0Parser.ExprContext) ctx.getChild(0)) + Evaluate((Mu0Parser.ExprContext) ctx.getChild(2)));
        } else if (ctx.MINUS() != null) {
            return (short)(Evaluate((Mu0Parser.ExprContext) ctx.getChild(0)) - Evaluate((Mu0Parser.ExprContext) ctx.getChild(2)));
        }
        return 0;
    }
}