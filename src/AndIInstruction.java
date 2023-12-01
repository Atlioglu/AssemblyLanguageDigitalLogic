import java.util.ArrayList;

public class AndIInstruction extends Processor{
    private ArrayList<Character> dest;
    private ArrayList<Character> src1;
    private ArrayList<Character> immediateValue;
    private Operations operations;
 
    public AndIInstruction(){
       super.opcode.add('1');
        super.opcode.add('0');
        super.opcode.add('1');
        super.opcode.add('1');
        operations = new Operations();
        //dest = new ArrayList<>(6);
        //String binaryString = String.format("%06d", Integer.parseInt(Integer.toBinaryString(number)));
    }
        
    public ArrayList<Character> getDest() {
        return dest;
    }

    public void setDest(ArrayList<Character> dest) {
        String binaryString = operations.concatenateArrayListToString(dest);
        int numbere = Integer.parseInt(binaryString);
        binaryString = String.format("%03d", Integer.parseInt(Integer.toBinaryString(numbere)));
        dest = operations.divideStringToArrayList(binaryString);
        this.dest = dest;
    }

    
    public ArrayList<Character> getSrc1() {
        return src1;
    }

    public void setSrc1(ArrayList<Character> src1) {
        String binaryString = operations.concatenateArrayListToString(src1);
        int numbere = Integer.parseInt(binaryString);
        binaryString = String.format("%03d", Integer.parseInt(Integer.toBinaryString(numbere)));
        src1 = operations.divideStringToArrayList(binaryString);
        this.src1 = src1;
    }

    public ArrayList<Character> getImmediateValue() {
        return immediateValue;
    }

    public void setImmediateValue(ArrayList<Character> immediateValue) {
        String binaryString = operations.concatenateArrayListToString(immediateValue);
        int numbere = Integer.parseInt(binaryString);
        binaryString = String.format("%09d", Integer.parseInt(Integer.toBinaryString(numbere)));
        immediateValue = operations.divideStringToArrayList(binaryString);
        this.immediateValue = immediateValue;
    }   
    
}