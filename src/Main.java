import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {    
        
        CheckInstructionType checkInstructionType = new CheckInstructionType();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split("[ ,]+");
        ArrayList<String> inputList = new ArrayList<>(Arrays.asList(parts));
        for(int i=0; i<inputList.size(); i++){
            String currentString = inputList.get(i);
            if (currentString.startsWith("R")) {
                inputList.set(i, currentString.substring(1));
            }
        }
        System.out.println(inputList);
        checkInstructionType.setInstructionName(inputList.get(0));
        checkInstructionType.setInputList(inputList);
        
        Operations operations = new Operations();
        System.out.println(operations.convertBinaryToHex(checkInstructionType.decideInstructionName()));
                
    }

    public static void toString(ArrayList<Character> arrayList){
        for(int i =0; i<arrayList.size(); i++){
            System.out.print(arrayList.get(i));
        }
    }
    
}