import java.util.ArrayList;

public class JmpInstruction extends Processor{
    private ArrayList<Character> defValue;
    private ArrayList<Character> addressValue;
    private Operations operations;
 
    public JmpInstruction(){
       super.opcode.add('1');
        super.opcode.add('0');
        super.opcode.add('0');
        super.opcode.add('1');
        
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
        if(numbere <0){
            addressValue = operations.divideStringToArrayList(convertToBinary(numbere,10));
        }else{
            binaryString = String.format("%03d", Integer.parseInt(Integer.toBinaryString(numbere)));
            String formattedBinaryString = String.format("%10s", binaryString).replace(' ', '0');
            addressValue = operations.divideStringToArrayList(formattedBinaryString);
        }
        
        this.addressValue = addressValue;
    }   
    
    private static String convertToBinary(int decimal, int bits) {
        String binary = Integer.toBinaryString(-decimal).substring(0);
        
        if (binary.length() < bits) {
            binary = String.format("%" + bits + "s", binary).replace(' ', '0');
        } else if (binary.length() > bits) {
            binary = binary.substring(binary.length() - bits);
        }
        binary = binaryToNot(binary);
        binary = addOneToBinary(binary);

        return binary;
    }
    public static String binaryToNot(String binary) {
        StringBuilder notBinary = new StringBuilder();

        for (int i = 0; i < binary.length(); i++) {
            char bit = binary.charAt(i);
            if (bit == '0') {
                notBinary.append('1');
            } else if (bit == '1') {
                notBinary.append('0');
            } else {
                throw new IllegalArgumentException("Input is not a binary string");
            }
        }

        return notBinary.toString();
    }
    public static String addOneToBinary(String binary) {
        StringBuilder result = new StringBuilder();
        int carry = 1; 

        for (int i = binary.length() - 1; i >= 0; i--) {
            char bit = binary.charAt(i);
            
            if (bit == '1') {
                if (carry == 1) {
                    result.insert(0, '0'); // Continue carry
                } else {
                    result.insert(0, '1');
                }
            } else if (bit == '0') {
                if (carry == 1) {
                    result.insert(0, '1');
                    carry = 0; // Carry resolved
                } else {
                    result.insert(0, '0');
                }
            } else {
                throw new IllegalArgumentException("Input is not a binary string");
            }
        }

        if (carry == 1) {
            result.insert(0, '1');
        }

        return result.toString();
    }
}
