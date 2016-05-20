/**
 * Created by andrew on 4/20/16.
 */
public class MemoryCell {
    int Cell = 0b0000_0000_0000_0000;

    public MemoryCell(int data){ Cell = data;}
    public MemoryCell(int opCode, int operand){
        Cell = (short)((opCode << 12) | operand);
    }

    @Override
    public String toString(){
        int c = 0x0000ffff & Cell;
        return String.format("%16s", Integer.toBinaryString(c)).replace(' ', '0');
    }

}
