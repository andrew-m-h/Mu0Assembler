/**
 * Created by andrew on 4/20/16.
 */
public class MemoryCell {
    short Cell = 0b0000_0000_0000_0000;

    public MemoryCell(short data){ Cell = data;}
    public MemoryCell(short opCode, short operand){
        Cell = (short)((opCode << 12) | operand);
    }

    @Override
    public String toString(){
        return String.format("%16s", Integer.toBinaryString(Cell)).replace(' ', '0');
    }

}
