import java.util.ArrayList;

public class LdInstruction extends Processor{
    private ArrayList<Character> dest;
    private ArrayList<Character> addressValue;
    private Operations operations;
 
    public LdInstruction(){
       super.opcode.add('0');
        super.opcode.add('1');
        super.opcode.add('1');
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

    public ArrayList<Character> getAddressValue() {
        return addressValue;
    }

    public void setAddressValue(ArrayList<Character> addressValue) {
        String binaryString = operations.concatenateArrayListToString(addressValue);
        int numbere = Integer.parseInt(binaryString);
        binaryString = String.format("%04d", Integer.parseInt(Integer.toBinaryString(numbere)));
        String formattedBinaryString = String.format("%10s", binaryString).replace(' ', '0');

        addressValue = operations.divideStringToArrayList(formattedBinaryString);
        this.addressValue = addressValue;
    }   
    

    
}
