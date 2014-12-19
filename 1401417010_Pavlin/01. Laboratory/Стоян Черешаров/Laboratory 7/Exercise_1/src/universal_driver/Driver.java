package universal_driver;

public class Driver {
    
    private Vehicle vehicle;
    
    public Vehicle getVehicle() {
        return vehicle;
    }
    
    public final void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
    public Driver(Vehicle vehicle) {
        
        setVehicle(vehicle);
    }
    
    public void drive() {
        
        System.out.println("I am driving vehicle type \"" + getVehicle().getClass().getSimpleName() + "\" with brand \"" + getVehicle().getBrand() + "\".\n");
        
        getVehicle().igniteEngine();
        
        getVehicle().pushClutch();

        getVehicle().shiftGear();

        getVehicle().deClutch();
        
        getVehicle().accelerate();
    
        getVehicle().pushBreak();
    
        getVehicle().turnRight();
    
        getVehicle().turnLeft();
        
        getVehicle().vehicleSpecific();
        
        getVehicle().turnOffEngine();
    }
}
