package universal_driver;

public class Car extends Vehicle {
    
    public Car(String brand) {
        setBrand(brand);
    }
    
    @Override
    public void vehicleSpecific() {
        
        System.out.println("Nitrous!");
    }
}
