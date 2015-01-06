package owner_interface;

public class UnknownFruit implements IFruits {
    
    private String type;
    private int price;
    private int quantity;

    protected String getType() {
        return type;
    }
    
    protected int getPrice() {
        return price;
    }
    
    protected int getQuantity() {
        return quantity;
    }
    
    protected final void setType(String type) {
        this.type = type;
    }

    protected final void setPrice(int price) {
        this.price = price;
    }

    protected final void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    protected UnknownFruit(String type, int price, int quantity) {
        setType(type);
        setPrice(price);
        setQuantity(quantity);
    }
    
    @Override
    public String toString() {
        
        return "Типа на плодовете е " + getType() + ". Количеството на стоката е " + getQuantity() + ", а цената е " + getPrice() + ".\n";
    }
    
    @Override
    public void printParam() { 
        
        System.out.println(this); 
    }
}
