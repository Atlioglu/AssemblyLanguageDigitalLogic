import java.util.ArrayList;

public class AddIInstruction extends Processor{
    private ArrayList<Character> dest;
    private ArrayList<Character> src1;
    private ArrayList<Character> immediateValue;
    private Operations operations;
 
    public AddIInstruction(){
       super.opcode.add('0');
        super.opcode.add('1');
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

    public ArrayList<Character> getImmediateValue() {
        return immediateValue;
    }

    public void setImmediateValue(ArrayList<Character> immediateValue) {
        String binaryString = operations.concatenateArrayListToString(immediateValue);
        int numbere = Integer.parseInt(binaryString);
        if(numbere <0){
            immediateValue = operations.divideStringToArrayList(convertToBinary(numbere,6));
        }else{
            binaryString = String.format("%06d", Integer.parseInt(Integer.toBinaryString(numbere)));
            immediateValue = operations.divideStringToArrayList(binaryString);
        }
        this.immediateValue = immediateValue;
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
