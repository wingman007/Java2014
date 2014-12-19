package casting;

public class CastingMain {

    public static void main(String[] args) {
        
        Machine machine = new Machine();
        
        machine.start();
        
        Camera camera = new Camera();
        camera.start();
        camera.snap();
        
        // Polymorphism
        Machine machinePoly = new Camera();
        
        
        // Upcasting
        Machine machineUp = camera;
        
        machineUp.start();
        //machineUp.snap(); Error
        
        System.out.println("");
        
                
        // Downcasting
        Camera cameraDown = (Camera)machinePoly;
        
        cameraDown.start();
        cameraDown.snap();
        
        
        // Doesn't work --- runtime error
        try {
            
            Camera cameraErr = (Camera)machine;
            
            cameraErr.start();
            cameraErr.snap();
        }
        
        catch (Exception err) {
            
            System.out.println(err.getMessage());       
        }
    }
}
