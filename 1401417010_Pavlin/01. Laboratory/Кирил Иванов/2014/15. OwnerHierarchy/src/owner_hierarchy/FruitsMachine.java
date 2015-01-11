package owner_hierarchy;

public class FruitsMachine extends Fruits {
    
    private String model;
    
    protected String getModel() {
        return model;
    }

    protected final void setModel(String model) {
        this.model = model;
    }
    
    protected FruitsMachine(String type, int price, String model) {
        super(type, price);
        setModel(model);
    }
    
    @Override
    public String toString() {
        
        return "Вида на машината е " + getType() + ". Моделът е " + getModel() + ", а цената е " + getPrice() + ".";
    }
}
