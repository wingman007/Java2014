package bicycle_skis;

public class Products {
    
    private double price;
    
    protected double getPrice() {
        return price;
    }  

    protected final void setPrice(double price) {
        this.price = price;
    }
    
    protected Products(double price) {
        setPrice(price);
    }
}
