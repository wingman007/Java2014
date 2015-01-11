package abstraction_interface;

public abstract class CommonStorageDevice implements IDrive {
    
    @Override
    public String read() {
        return "Това е прочетено!";
    }
    
    @Override
    public void write() {
        System.out.println("Това е записано! \n");
    }
}
