package abstraction_interface;

public class SSD implements IDrive {
    
    @Override
    public String read() {
        return "Това е прочетено от SSD!";
    }
    
    @Override
    public void write() {
        System.out.println("Това е записано на SSD! \n");
    }
}
