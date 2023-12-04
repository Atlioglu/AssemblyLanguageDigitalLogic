import java.util.ArrayList;

public class CheckInstructionType {
    private String instructionName;
    private ArrayList<String> inputList;
    private Operations operations;
    private AddInstruction addInstruction;
    private AndInstruction andInstruction;
    private NorInstruction norInstruction;
    private NandInstruction nandInstruction;
    private AddIInstruction addIInstruction;
    private AndIInstruction andIInstruction;
    private LdInstruction ldInstruction;
    private StInstruction stInstruction;
    private JmpInstruction jmpInstruction;
    private JeInstruction jeInstruction;
    private JaInstruction jaInstruction;
    private JbInstruction jbInstruction;
    private JaeInstruction jaeInstruction;
    private JbeInstruction jbeInstruction;
    private CmpInstruction cmpInstruction;

    public CheckInstructionType(){
        operations = new Operations();
        addInstruction = new AddInstruction();
        andInstruction = new AndInstruction();
        norInstruction = new NorInstruction();
        nandInstruction = new NandInstruction();
        addIInstruction = new AddIInstruction();
        andIInstruction = new AndIInstruction();
        ldInstruction = new LdInstruction();
        stInstruction = new StInstruction();
        jmpInstruction = new JmpInstruction();
        jeInstruction = new JeInstruction();
        jaInstruction = new JaInstruction();
        jbInstruction = new JbInstruction();
        jaeInstruction = new JaeInstruction();
        jbeInstruction = new JbeInstruction();
        cmpInstruction = new CmpInstruction();
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
            andInstruction.setDest(operations.divideStringToArrayList(getInputList().get(1)));
            andInstruction.setSrc1(operations.divideStringToArrayList(getInputList().get(2)));
            andInstruction.setSrc2(operations.divideStringToArrayList(getInputList().get(3)));
            andInstruction.setGap(operations.divideStringToArrayList(getInputList().get(3)));
            ArrayList<Character> arrayListChar = operations.combineArrayLists(andInstruction.opcode, andInstruction.getDest());
            arrayListChar = operations.combineArrayLists(arrayListChar, andInstruction.getSrc1());
            arrayListChar = operations.combineArrayLists(arrayListChar, andInstruction.getGap());
            arrayListChar = operations.combineArrayLists(arrayListChar, andInstruction.getSrc2());
            return arrayListChar;
        }
        else if(instructionName.equals("NOR")){
            norInstruction.setDest(operations.divideStringToArrayList(getInputList().get(1)));
            norInstruction.setSrc1(operations.divideStringToArrayList(getInputList().get(2)));
            norInstruction.setSrc2(operations.divideStringToArrayList(getInputList().get(3)));
            norInstruction.setGap(operations.divideStringToArrayList(getInputList().get(3)));
            ArrayList<Character> arrayListChar = operations.combineArrayLists(norInstruction.opcode, norInstruction.getDest());
            arrayListChar = operations.combineArrayLists(arrayListChar, norInstruction.getSrc1());
            arrayListChar = operations.combineArrayLists(arrayListChar, norInstruction.getGap());
            arrayListChar = operations.combineArrayLists(arrayListChar, norInstruction.getSrc2());
            return arrayListChar;
        }
        else if(instructionName.equals("NAND")){
            nandInstruction.setDest(operations.divideStringToArrayList(getInputList().get(1)));
            nandInstruction.setSrc1(operations.divideStringToArrayList(getInputList().get(2)));
            nandInstruction.setSrc2(operations.divideStringToArrayList(getInputList().get(3)));
            nandInstruction.setGap(operations.divideStringToArrayList(getInputList().get(3)));
            ArrayList<Character> arrayListChar = operations.combineArrayLists(nandInstruction.opcode, nandInstruction.getDest());
            arrayListChar = operations.combineArrayLists(arrayListChar, nandInstruction.getSrc1());
            arrayListChar = operations.combineArrayLists(arrayListChar, nandInstruction.getGap());
            arrayListChar = operations.combineArrayLists(arrayListChar, nandInstruction.getSrc2());
            return arrayListChar;
        }
        else if(instructionName.equals("ADDI")){
            addIInstruction.setDest(operations.divideStringToArrayList(getInputList().get(1)));
            addIInstruction.setSrc1(operations.divideStringToArrayList(getInputList().get(2)));
            addIInstruction.setImmediateValue((operations.divideStringToArrayList(getInputList().get(3))));
            ArrayList<Character> arrayListChar = operations.combineArrayLists(addIInstruction.opcode, addIInstruction.getDest());
            arrayListChar = operations.combineArrayLists(arrayListChar, addIInstruction.getSrc1());
            arrayListChar = operations.combineArrayLists(arrayListChar, addIInstruction.getImmediateValue());
            return arrayListChar;
        }
        else if(instructionName.equals("ANDI")){
            andIInstruction.setDest(operations.divideStringToArrayList(getInputList().get(1)));
            andIInstruction.setSrc1(operations.divideStringToArrayList(getInputList().get(2)));
            andIInstruction.setImmediateValue((operations.divideStringToArrayList(getInputList().get(3))));
            ArrayList<Character> arrayListChar = operations.combineArrayLists(andIInstruction.opcode, andIInstruction.getDest());
            arrayListChar = operations.combineArrayLists(arrayListChar, andIInstruction.getSrc1());
            arrayListChar = operations.combineArrayLists(arrayListChar, andIInstruction.getImmediateValue());
            return arrayListChar;

        }
        else if(instructionName.equals("LD")){
            ldInstruction.setDest(operations.divideStringToArrayList(getInputList().get(1)));
            ldInstruction.setAddressValue((operations.divideStringToArrayList(getInputList().get(2))));
            ArrayList<Character> arrayListChar = new ArrayList<>();
            arrayListChar = operations.combineArrayLists(ldInstruction.opcode, ldInstruction.getDest());
            arrayListChar = operations.combineArrayLists(arrayListChar, ldInstruction.getAddressValue());
            return arrayListChar;

        }
        else if(instructionName.equals("ST")){
            stInstruction.setRsc(operations.divideStringToArrayList(getInputList().get(1)));
            stInstruction.setAddressValue((operations.divideStringToArrayList(getInputList().get(2))));
            ArrayList<Character> arrayListChar = operations.combineArrayLists(stInstruction.opcode, stInstruction.getRsc());
            arrayListChar = operations.combineArrayLists(arrayListChar, stInstruction.getAddressValue());
            return arrayListChar;
        }
        else if(instructionName.equals("JUMP")){
            ArrayList<String> arrayDef = new ArrayList<String>();
            arrayDef.add("0");
            jmpInstruction.setDefValue(operations.divideStringToArrayList(arrayDef.get(0)));
            jmpInstruction.setAddressValue((operations.divideStringToArrayList(getInputList().get(1))));
            ArrayList<Character> arrayListChar = operations.combineArrayLists(jmpInstruction.opcode, jmpInstruction.getDefValue());
            arrayListChar = operations.combineArrayLists(arrayListChar, jmpInstruction.getAddressValue());
            return arrayListChar;
        }
        else if(instructionName.equals("JE")){
            ArrayList<String> arrayDef = new ArrayList<String>();
            arrayDef.add("8");
            jeInstruction.setDefValue(operations.divideStringToArrayList(arrayDef.get(0)));
            jeInstruction.setAddressValue((operations.divideStringToArrayList(getInputList().get(1))));
            ArrayList<Character> arrayListChar = operations.combineArrayLists(jeInstruction.opcode, jeInstruction.getDefValue());
            arrayListChar = operations.combineArrayLists(arrayListChar, jeInstruction.getAddressValue());
            return arrayListChar;
        }
        else if(instructionName.equals("JA")){
            ArrayList<String> arrayDef = new ArrayList<String>();
            arrayDef.add("0");
            jaInstruction.setDefValue(operations.divideStringToArrayList(arrayDef.get(0)));
            jaInstruction.setAddressValue((operations.divideStringToArrayList(getInputList().get(1))));
            ArrayList<Character> arrayListChar = operations.combineArrayLists(jaInstruction.opcode, jaInstruction.getDefValue());
            arrayListChar = operations.combineArrayLists(arrayListChar, jaInstruction.getAddressValue());
            return arrayListChar;
        }
        else if(instructionName.equals("JB")){
            ArrayList<String> arrayDef = new ArrayList<String>();
            arrayDef.add("0");
            jbInstruction.setDefValue(operations.divideStringToArrayList(arrayDef.get(0)));
            jbInstruction.setAddressValue((operations.divideStringToArrayList(getInputList().get(1))));
            ArrayList<Character> arrayListChar = operations.combineArrayLists(jbInstruction.opcode, jbInstruction.getDefValue());
            arrayListChar = operations.combineArrayLists(arrayListChar, jbInstruction.getAddressValue());
            return arrayListChar;
        }
         else if(instructionName.equals("JAE")){
            ArrayList<String> arrayDef = new ArrayList<String>();
            arrayDef.add("0");
            jaeInstruction.setDefValue(operations.divideStringToArrayList(arrayDef.get(0)));
            jaeInstruction.setAddressValue((operations.divideStringToArrayList(getInputList().get(1))));
            ArrayList<Character> arrayListChar = operations.combineArrayLists(jaeInstruction.opcode, jaeInstruction.getDefValue());
            arrayListChar = operations.combineArrayLists(arrayListChar, jaeInstruction.getAddressValue());
            return arrayListChar;
        }
         else if(instructionName.equals("JBE")){
            ArrayList<String> arrayDef = new ArrayList<String>();
            arrayDef.add("0");
            jbeInstruction.setDefValue(operations.divideStringToArrayList(arrayDef.get(0)));
            jbeInstruction.setAddressValue((operations.divideStringToArrayList(getInputList().get(1))));
            ArrayList<Character> arrayListChar = operations.combineArrayLists(jbeInstruction.opcode, jbeInstruction.getDefValue());
            arrayListChar = operations.combineArrayLists(arrayListChar, jbeInstruction.getAddressValue());
            return arrayListChar;
        } 
        else if(instructionName.equals("CMP")){
            cmpInstruction.setOp1(operations.divideStringToArrayList(getInputList().get(1)));
            cmpInstruction.setOp2(operations.divideStringToArrayList(getInputList().get(2)));
            ArrayList<String> arrayDef = new ArrayList<String>();
            arrayDef.add("0");
            cmpInstruction.setDefValue(operations.divideStringToArrayList(arrayDef.get(0)));
            ArrayList<Character> arrayListChar = operations.combineArrayLists(cmpInstruction.opcode, cmpInstruction.getOp1());
            arrayListChar = operations.combineArrayLists(arrayListChar, cmpInstruction.getDefValue());
            arrayListChar = operations.combineArrayLists(arrayListChar, cmpInstruction.getOp2());
            return arrayListChar;
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
    

    
    public ArrayList<String> getInputList() {
        return inputList;
    }
    public void setInputList(ArrayList<String> inputList) {
        this.inputList = inputList;
    }
}
