

import java.util.ArrayList;

public class AddInstruction extends Processor {
    private ArrayList<Character> dest;
    private ArrayList<Character> src1;
    private ArrayList<Character> src2;
    private ArrayList<Character> gap;
    private Operations operations;
 
    public AddInstruction(){
       super.opcode.add('0');
        super.opcode.add('0');
        super.opcode.add('0');
        super.opcode.add('0');
        operations = new Operations();       
   }
        
    public ArrayList<Character> getDest() {
        return dest;
    }

    public void setDest(ArrayList<Character> dest) {
        String binaryString = operations.concatenateArrayListToString(dest);
        int numbere = Integer.parseInt(binaryString);
        binaryString = String.format("%04d", Integer.parseInt(Integer.toBinaryString(numbere)));
        dest = operations.divideStringToArrayList(binaryString);
        this.dest = dest;
    }

    
    public ArrayList<Character> getSrc1() {
        return src1;
    }

    public void setSrc1(ArrayList<Character> src1) {
        String binaryString = operations.concatenateArrayListToString(src1);
        int numbere = Integer.parseInt(binaryString);
        binaryString = String.format("%04d", Integer.parseInt(Integer.toBinaryString(numbere)));
        src1 = operations.divideStringToArrayList(binaryString);
        this.src1 = src1;
    }

    public ArrayList<Character> getSrc2() {
        return src2;
    }

    public void setSrc2(ArrayList<Character> src2) {
        String binaryString = operations.concatenateArrayListToString(src2);
        int numbere = Integer.parseInt(binaryString);
        binaryString = String.format("%04d", Integer.parseInt(Integer.toBinaryString(numbere)));
        src2 = operations.divideStringToArrayList(binaryString);
        this.src2 = src2;
    }
 
   
    public ArrayList<Character> getGap() {
        return gap;
    }

    public void setGap(ArrayList<Character> gap) {
        String binaryString = String.format("%02d", 0);
        gap = operations.divideStringToArrayList(binaryString);
        this.gap = gap;
    }
}
