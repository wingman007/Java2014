package real_estate;

public class RealEstateMain {

    public static void main(String[] args) {

        RealEstate realEstate = new RealEstate(23, 10);
        
        System.out.println("Цената само на земя е " + realEstate.getPrice());
        
        RealEstateBuildings realEstateBuildings = new RealEstateBuildings(23, 10);
        
        System.out.println("Цената само на земя с постройка е " + realEstateBuildings.getPrice());  
    }
}
