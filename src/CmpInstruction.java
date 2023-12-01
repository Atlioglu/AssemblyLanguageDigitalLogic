import java.util.ArrayList;

public class CmpInstruction extends Processor {
    private ArrayList<Character> op1;
    private ArrayList<Character> defValue;
    private ArrayList<Character> op2;
    private Operations operations;
 
    public CmpInstruction(){
       super.opcode.add('1');
        super.opcode.add('0');
        super.opcode.add('0');
        super.opcode.add('0');
        operations = new Operations();       
   }
        
    public ArrayList<Character> getOp1() {
        return op1;
    }

    public void setOp1(ArrayList<Character> op1) {
        String binaryString = operations.concatenateArrayListToString(op1);
        int numbere = Integer.parseInt(binaryString);
        binaryString = String.format("%04d", Integer.parseInt(Integer.toBinaryString(numbere)));
        op1 = operations.divideStringToArrayList(binaryString);
        this.op1 = op1;
    }

    
    public ArrayList<Character> getOp2() {
        return op2;
    }

    public void setOp2(ArrayList<Character> op2) {
        String binaryString = operations.concatenateArrayListToString(op2);
        int numbere = Integer.parseInt(binaryString);
        binaryString = String.format("%04d", Integer.parseInt(Integer.toBinaryString(numbere)));
        op2 = operations.divideStringToArrayList(binaryString);
        this.op2 = op2;
    }
   
    public ArrayList<Character> getDefValue() {
        return defValue;
    }

    public void setDefValue(ArrayList<Character> defValue) {
        String binaryString = String.format("%06d", 0);
        defValue = operations.divideStringToArrayList(binaryString);
        this.defValue = defValue;
    }
}
