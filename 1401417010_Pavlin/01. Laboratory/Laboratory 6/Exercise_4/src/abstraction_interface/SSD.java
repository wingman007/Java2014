package abstraction_interface;

public class SSD extends CommonStorageDevice {
    
    @Override
    public String read() {
        return "Това е прочетено от SSD!";
    }
    
    @Override
    public void write() {
        System.out.println("Това е записано на SSD! \n");
    }
}
