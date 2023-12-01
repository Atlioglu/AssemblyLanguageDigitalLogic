import java.util.ArrayList;

public class StInstruction extends Processor{
    private ArrayList<Character> src;
    private ArrayList<Character> addressValue;
    private Operations operations;
 
    public StInstruction(){
       super.opcode.add('0');
        super.opcode.add('1');
        super.opcode.add('1');
        super.opcode.add('1');
        operations = new Operations();
    }
        
    public ArrayList<Character> getRsc() {
        return src;
    }

    public void setRsc(ArrayList<Character> src) {
        String binaryString = operations.concatenateArrayListToString(src);
        int numbere = Integer.parseInt(binaryString);
        binaryString = String.format("%04d", Integer.parseInt(Integer.toBinaryString(numbere)));
        src = operations.divideStringToArrayList(binaryString);
        this.src = src;
    }

    public ArrayList<Character> getAddressValue() {
        return addressValue;
    }

    public void setAddressValue(ArrayList<Character> addressValue) {
        String binaryString = operations.concatenateArrayListToString(addressValue);
        int numbere = Integer.parseInt(binaryString);
        binaryString = String.format("%03d", Integer.parseInt(Integer.toBinaryString(numbere)));
        String formattedBinaryString = String.format("%10s", binaryString).replace(' ', '0');
        addressValue = operations.divideStringToArrayList(formattedBinaryString);
        this.addressValue = addressValue;
    }   
    

    
}
