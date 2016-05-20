/**
 * Created by andrew on 4/20/16.
 */
public class Interpret {
    public static final int MEMORY_SIZE = 4096;
    int pc = 0;
    int acc = 0;
    public MemoryCell[] memory;

    public Interpret(){
        memory = new MemoryCell[MEMORY_SIZE];
        for (int i = 0; i < MEMORY_SIZE; i++){
            memory[i] = new MemoryCell((short)0);
        }
    }

    public Interpret(MemoryCell[] mem){
        memory = mem;
    }

    public static String Decompile(int operand){
        int operator = operand >> 12;
        int addr = operand & 0b0000_1111_1111_1111;

        switch (operator) {
            case 0b0000: //LDA
                return "LDA " + addr;
            case 0b0001: //STO
                return "STO " + addr;
            case 0b0010: //ADD
                return "ADD " + addr;
            case 0b0011: //SUB
                return "SUB " + addr;
            case 0b0100: //JMP
                return "JMP " + addr;
            case 0b0101: //JGE
                return "JGE " + addr;
            case 0b0110: //JNE
                return "JNE " + addr;
            case 0b0111: //STP
                return "STP";
            case 0b1111: //PRINT
                return "PRINT " + addr;
        }
        return "";
    }

    public void Run(){
        while (true) {
            int operator = memory[pc].Cell >> 12;
            int addr = memory[pc].Cell & 0b0000_1111_1111_1111;
            pc++;
            switch (operator) {
                case 0b0000: //LDA
                    acc = memory[addr].Cell;
                    break;
                case 0b0001: //STO
                    memory[addr].Cell = acc;
                    break;
                case 0b0010: //ADD
                    acc += memory[addr].Cell;
                    break;
                case 0b0011: //SUB
                    acc -= memory[addr].Cell;
                    break;
                case 0b0100: //JMP
                    pc = addr;
                    break;
                case 0b0101: //JGE
                    if (acc >= 0)
                        pc = addr;
                    break;
                case 0b0110: //JNE
                    if (acc != 0)
                        pc = addr;
                    break;
                case 0b0111: //STP
                    return;
                case 0b1111: //PRINT
                    System.out.println(memory[addr].Cell);
                    break;
            }
        }
    }
}
