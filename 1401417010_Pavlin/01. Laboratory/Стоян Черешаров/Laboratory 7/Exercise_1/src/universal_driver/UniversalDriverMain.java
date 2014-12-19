package universal_driver;

public class UniversalDriverMain {

    public static void main(String[] args) {
        
        Vehicle ferrari = new Car("Ferrari");
        Vehicle volvo = new Truck("Volvo");
        
        Driver enzo_ferrari = new Driver(ferrari);
        enzo_ferrari.drive();
        
        enzo_ferrari.setVehicle(volvo);
        enzo_ferrari.drive();  
    }
}
