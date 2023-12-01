import java.util.ArrayList;

public class CheckInstructionType {
    private String instructionName;
    private ArrayList<String> inputList;
    private String dest;
    private String src1;
    private String src2;
    private String immediateValue;
    private String address;
    private Operations operations;
    private AddInstruction addInstruction;

    public CheckInstructionType(){
        operations = new Operations();
        addInstruction = new AddInstruction();
    }



    public ArrayList<Character> decideInstructionName(){
        if(instructionName.equals("ADD")){
            addInstruction.setDest(operations.divideStringToArrayList(getInputList().get(1)));
            addInstruction.setSrc1(operations.divideStringToArrayList(getInputList().get(2)));
            addInstruction.setSrc2(operations.divideStringToArrayList(getInputList().get(3)));
            addInstruction.setGap(operations.divideStringToArrayList(getInputList().get(3)));
            ArrayList<Character> arrayListChar = operations.combineArrayLists(addInstruction.opcode, addInstruction.getDest());
            arrayListChar = operations.combineArrayLists(arrayListChar, addInstruction.getSrc1());
            arrayListChar = operations.combineArrayLists(arrayListChar, addInstruction.getGap());
            arrayListChar = operations.combineArrayLists(arrayListChar, addInstruction.getSrc2());
            return arrayListChar;
        }
        else if(instructionName.equals("AND")){
            
            return null;

        }
        else if(instructionName.equals("NOR")){
            return null;

        }
        else if(instructionName.equals("NAND")){
            return null;

        }
        else if(instructionName.equals("ADDI")){
            return null;

        }
        else if(instructionName.equals("ANDI")){
            return null;

        }
        else{
            return null;
        }

    }
    public String getInstructionName() {
        return instructionName;
    }
    public void setInstructionName(String instructionName) {
        this.instructionName = instructionName;
    }
    

    public String getDest() {
        return dest;
    }
    public void setDest(String dest) {
        this.dest = dest;
    }


    public String getSrc1() {
        return src1;
    }
    public void setSrc1(String src1) {
        this.src1 = src1;
    }
    

    public String getSrc2() {
        return src2;
    }
    public void setSrc2(String src2) {
        this.src2 = src2;
    }
    

    public String getImmediateValue() {
        return immediateValue;
    }
    public void setImmediateValue(String immediateValue) {
        this.immediateValue = immediateValue;
    }


    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }



    
    public ArrayList<String> getInputList() {
        return inputList;
    }
    public void setInputList(ArrayList<String> inputList) {
        this.inputList = inputList;
    }
}
