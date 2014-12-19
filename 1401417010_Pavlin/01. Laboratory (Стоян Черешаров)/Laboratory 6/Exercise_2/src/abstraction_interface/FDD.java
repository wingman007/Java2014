package abstraction_interface;

public class FDD implements IDrive {
    
    @Override
    public String read() {
        return "Това е прочетено от FDD!";
    }
    
    @Override
    public void write() {
        System.out.println("Това е записано на FDD! \n");
    } 
}
