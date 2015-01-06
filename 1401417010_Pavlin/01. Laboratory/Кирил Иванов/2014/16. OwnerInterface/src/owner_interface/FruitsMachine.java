package owner_interface;

public class FruitsMachine implements IFruits {
    
    private String type;
    private int price;
    private String model;
    
    protected String getType() {
        return type;
    }
    
    protected int getPrice() {
        return price;
    }
    
    protected String getModel() {
        return model;
    }
    
    protected final void setType(String type) {
        this.type = type;
    }

    protected final void setPrice(int price) {
        this.price = price;
    }

    protected final void setModel(String model) {
        this.model = model;
    }
    
    protected FruitsMachine(String type, int price, String model) {
        setType(type);
        setPrice(price);
        setModel(model);
    }
    
    @Override
    public String toString() {
        
        return "Вида на машината е " + getType() + ". Моделът е " + getModel() + ", а цената е " + getPrice() + ".";
    }
    
    @Override
    public void printParam() { 
        
        System.out.println(this); 
    }
}
