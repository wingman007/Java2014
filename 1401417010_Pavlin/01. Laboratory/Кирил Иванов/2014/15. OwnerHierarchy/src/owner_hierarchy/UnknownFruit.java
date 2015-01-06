package owner_hierarchy;

public class UnknownFruit extends Fruits {
    
    private int quantity;
    
    protected int getQuantity() {
        return quantity;
    }
    
    protected final void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    protected UnknownFruit(String type, int price, int quantity) {
        super(type, price);
        setQuantity(quantity);
    }
    
    @Override
    public String toString() {
        
        return "Типа на плодовете е " + getType() + ". Количеството на стоката е " + getQuantity() + ", а цената е " + getPrice() + ".\n";
    }
}
