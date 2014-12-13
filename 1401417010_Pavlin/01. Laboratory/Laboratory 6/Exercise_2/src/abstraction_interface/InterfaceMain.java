package abstraction_interface;

public class InterfaceMain {

    public static void main(String[] args) {
        
        OperatingSystem device = new OperatingSystem();
        
        device.setStorageDevice("HDD");
        device.setStorageDevice("SSD");
        device.setStorageDevice("FFD");
        
        device.setStorageDevice("CD");
    }
}
