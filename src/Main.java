import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {    
        CheckInstructionType checkInstructionType = new CheckInstructionType();
        Operations operations = new Operations();

        String fileName = "input.txt"; 
        ArrayList<ArrayList<String>> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] wordsArray = line.split("[ ,]+");
                ArrayList<String> words = new ArrayList<>();
      
                for (String word : wordsArray) {
                     if (word.startsWith("R")) {
                        word = word.substring(1); 
                        }
                        words.add(word);
                    }
                checkInstructionType.setInstructionName(words.get(0));
                checkInstructionType.setInputList(words);
                ArrayList<Character> arrayListForOutput = new ArrayList<Character>();
                arrayListForOutput = operations.convertBinaryToHex(checkInstructionType.decideInstructionName());

                writeFile("output.txt",arrayListForOutput,true);

                lines.add(words);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            
    }


    public static void writeFile(String filePath, ArrayList<Character> data, boolean append) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, append))) {
            for (Character ch : data) {
                writer.write(ch);
            }
            writer.write(32);
        } catch (IOException e) {
            e.printStackTrace();
        } 
    }
}