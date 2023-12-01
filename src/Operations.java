import java.util.ArrayList;
import java.util.List;

public class Operations {

    public ArrayList<Character> convertDecimalToBinary(int decimalValue){
        decimalValue = Integer.parseInt(Integer.toBinaryString(decimalValue));
        return null;
    }
    
    public ArrayList<Character> convertBinaryToHex(ArrayList<Character> binaryArrayList){
        String combinedNumbersString= concatenateArrayListToString(binaryArrayList);
        int combinedNumbersInteger = Integer.parseInt(String.valueOf(combinedNumbersString), 2);
        combinedNumbersString= Integer.toHexString(combinedNumbersInteger);
        return divideStringToArrayList(combinedNumbersString);
    }


    public ArrayList<Character> combineArrayLists(ArrayList<Character> previousArrayListPart, ArrayList<Character> addedArrayListPart){
        previousArrayListPart.addAll(addedArrayListPart);
        return previousArrayListPart;
    }   


    public String concatenateArrayListToString(ArrayList<Character> charArrayList){
        String combineNumbers =""; // Change it with processor.opcode
        for(int i=0; i<charArrayList.size(); i++){
            combineNumbers +=charArrayList.get(i);
        }
        return combineNumbers;
    }
    

    public ArrayList<Integer> divideIntegerToArrayList(int number) {
        String numberString = String.valueOf(number);
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < numberString.length(); i++) {
            char digitChar = numberString.charAt(i);
            arrayList.add(Character.getNumericValue(digitChar));
        }
        return arrayList;
    }
    
    public ArrayList<Character> divideStringToArrayList(String string) {
        ArrayList<Character> characterList = new ArrayList<>();
        for (char c : string.toCharArray()) {
            characterList.add(c);
        }
        return characterList;
    }
}
