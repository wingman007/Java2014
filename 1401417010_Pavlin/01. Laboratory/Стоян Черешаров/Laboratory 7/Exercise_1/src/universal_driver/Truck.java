package universal_driver;

public class Truck extends Vehicle {
    
    public Truck(String brand) {
        setBrand(brand);
    }
    
    @Override
    public void vehicleSpecific() {
        
        System.out.println("Engine brake!");
    }
}
