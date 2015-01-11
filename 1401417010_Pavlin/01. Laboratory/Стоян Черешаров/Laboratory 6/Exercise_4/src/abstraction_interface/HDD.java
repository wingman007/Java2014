package abstraction_interface;

public class HDD extends CommonStorageDevice {
    
    @Override
    public String read() {
        return "Това е прочетено от HDD!";
    }
    
    @Override
    public void write() {
        System.out.println("Това е записано на HDD! \n");
    }  
}
