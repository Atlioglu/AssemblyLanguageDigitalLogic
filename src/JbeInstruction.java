import java.util.ArrayList;

public class JbeInstruction extends Processor{
    private ArrayList<Character> defValue;
    private ArrayList<Character> addressValue;
    private Operations operations;
 
    public JbeInstruction(){
       super.opcode.add('1');
        super.opcode.add('1');
        super.opcode.add('1');
        super.opcode.add('0');
        
        operations = new Operations();
    }
        
    public ArrayList<Character> getDefValue() {
        return defValue;
    }

    public void setDefValue(ArrayList<Character> defValue) {
        String binaryString = operations.concatenateArrayListToString(defValue);
        int numbere = Integer.parseInt(binaryString);
        binaryString = String.format("%04d", Integer.parseInt(Integer.toBinaryString(numbere)));
        defValue = operations.divideStringToArrayList(binaryString);
        this.defValue = defValue;
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
