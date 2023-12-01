import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {    
        
        CheckInstructionType checkInstructionType = new CheckInstructionType();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        //InputFormat inputFormat = new InputFormat();
        String[] parts = input.split("[ ,]+");
        //inputFormat.setParts(parts);
        ArrayList<String> inputList = new ArrayList<>(Arrays.asList(parts));
        //inputFormat.setInputList(inputList);

        checkInstructionType.setInstructionName(inputList.get(0));
        checkInstructionType.setInputList(inputList);

        System.out.println(checkInstructionType.decideInstructionName());

        //System.out.println(inputList);



        /*
        ArrayList<Character> arrayListTrying = new ArrayList<Character>();
        arrayListTrying.add('1');
        arrayListTrying.add('0');
        arrayListTrying.add('1');

        ArrayList<Character> arrayListTrying2 = new ArrayList<Character>();
        arrayListTrying2.add('1');
        arrayListTrying2.add('0');
        arrayListTrying2.add('0');
        toString(arrayListTrying);
        System.out.println("\n-----");


        ArrayList<Character> arrayListTrying3 = new ArrayList<Character>();
        arrayListTrying3.add('3');


        Operations op = new Operations();
        arrayListTrying= op.combineArrayLists(arrayListTrying, arrayListTrying2);
        toString(arrayListTrying);
        System.out.println("\n-----");

        arrayListTrying=op.convertBinaryToHex(arrayListTrying);
        toString(arrayListTrying);
        System.out.println("\n-----");

        AddInstruction addInstruction = new AddInstruction();
        addInstruction.setDest(arrayListTrying3);
        toString(addInstruction.getDest());
        System.out.println("\n -----------------------------");

        addInstruction.setGap(arrayListTrying3);
        toString(addInstruction.getGap());
        System.out.println("\n -----------------------------");

        toString(op.combineArrayLists(addInstruction.getDest(), addInstruction.getGap()));


        */
        
    }

    public static void toString(ArrayList<Character> arrayList){
        for(int i =0; i<arrayList.size(); i++){
            System.out.print(arrayList.get(i));
        }
    }
    
}