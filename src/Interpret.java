/**
 * Created by andrew on 4/20/16.
 */
public class Interpret {
    public static final int MEMORY_SIZE = 4096;
    short pc = 0;
    short acc = 0;
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

    public void Run(){
        short operator = (short)(memory[pc].Cell >> 12);
        short addr = (short)(memory[pc].Cell & 0b0000_1111_1111_1111);
        switch (operator){
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
        }
    }
}
