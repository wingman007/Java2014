package real_estate;

public class RealEstate {
    
    private int price;
    
    public RealEstate(int a, int b) {
        
        setPrice(a, b);
    }
    
    public final void setPrice(int a, int b) {
        
        price = (a * b) * 17;
    }
    
    public int getPrice() {
        
        return price;
    }
}
