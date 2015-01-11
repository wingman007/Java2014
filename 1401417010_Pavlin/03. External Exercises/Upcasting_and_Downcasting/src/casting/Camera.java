package casting;

public class Camera extends Machine {
    
    @Override
    public void start() {
        System.out.println("Camera started.");
    }
    
    public void snap() {
        System.out.println("Photo taken.\n");
    }
}
