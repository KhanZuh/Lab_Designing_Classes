public class Computer {

    // properties
    private int storage;
    private String printer;
//    private boolean isComputerOn;

    // constructor
    public Computer(int storage){
        this.storage = storage;
        this.printer = "";
//        this.isComputerOn = false;
    }

    // getter for storage
    public int getStorage(){
        return this.storage;
    }

    // setter for storage
    public void addStorage(int storageToAdd){
        this.storage = this.storage + storageToAdd;
    }

    // setter for printer name
    public void addPrinter(String printerName){
        this.printer = printerName;
    }

    //    getter for printer name
    public String getPrinter() {
        return this.printer;
    }

    public void printMessage(String messageToPrint){
        if(this.printer == ""){
            System.out.println("No printer connected");
        }else{
            System.out.println(messageToPrint);
        }
    }

//    setter for computer on
//    public void turnComputerOn(){
//        this.isComputerOn = true;
//    }
}
