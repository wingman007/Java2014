package universal_driver;

public class Truck extends Vehicle {
    
    public Truck(String brand) {
        super(brand);
    }
    
    @Override
    public void vehicleSpecific() {
        
        System.out.println("Engine brake!");
    }
}
