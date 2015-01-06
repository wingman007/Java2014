package owner_hierarchy;

public class Fruits {
    
    private String type;
    private int price;
    
    protected String getType() {
        return type;
    }
    
    protected int getPrice() {
        return price;
    }

    protected final void setType(String type) {
        this.type = type;
    }

    protected final void setPrice(int price) {
        this.price = price;
    }

    protected Fruits(String type, int price) {
        setType(type);
        setPrice(price);
    }
}
