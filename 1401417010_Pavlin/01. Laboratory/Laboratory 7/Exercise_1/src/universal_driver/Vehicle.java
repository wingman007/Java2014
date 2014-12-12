package universal_driver;

public abstract class Vehicle implements IDrivable {

    public abstract void vehicleSpecific();
    
    private String brand;
    
    public String getBrand() {
        return brand;
    }
    
    public final void setBrand(String brand) {
        this.brand = brand;
    }
    
    public Vehicle(String brand) {
        setBrand(brand);
    }
    
    @Override
    public void igniteEngine() {
        
        System.out.println("Ignite the engine!");
    }
    
    @Override
    public void turnOffEngine() {
        System.out.println("Turn off the engine!\n");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerate!");
    }

    @Override
    public void pushBreak() {
        System.out.println("Break!");
    }

    @Override
    public void pushClutch() {
        System.out.println("Clutch!");
    }

    @Override
    public void shiftGear() {
        System.out.println("Shifting Gears!");
    }

    @Override
    public void deClutch() {
        System.out.println("Declutch!");
    }

    @Override
    public void turnRight() {
        System.out.println("Turn Right!");
    }

    @Override
    public void turnLeft() {
        System.out.println("Turn Left!");
    }
}
