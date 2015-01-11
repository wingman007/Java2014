package abstraction_interface;

public class OperatingSystem {
    
    public void setStorageDevice(String device) {
        
        switch (device) {
            
            case "HDD":
            HDD hdd = new HDD();
            System.out.println(hdd.read());
            hdd.write();
            break;
                
            case "SSD":
            SSD ssd = new SSD();
            System.out.println(ssd.read());
            ssd.write();
            break;
                
            case "FFD":
            FDD fdd = new FDD();
            System.out.println(fdd.read());
            fdd.write();
            break;
                
            default:
            System.out.println("Устройството " + device + " не съществува!");
            break;    
        }
    }
}
