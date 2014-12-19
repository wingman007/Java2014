package real_estate;

public class RealEstateBuildings {

    private int price;
    
    public RealEstateBuildings(int a, int b) {
        
        setPrice(a, b);
    }
    
    public final void setPrice(int a, int b) {
        
        price = (a * b) * 38;
    }
    
    public int getPrice() {
        
        return price;
    }
}
