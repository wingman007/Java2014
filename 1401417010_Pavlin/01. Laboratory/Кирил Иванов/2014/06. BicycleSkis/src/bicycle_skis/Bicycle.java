package bicycle_skis;

public class Bicycle extends Products {
    
    private String model;
    
    protected String getModel() {
        return model;
    }

    protected final void setModel(String model) {
        this.model = model;
    }
    
    protected Bicycle(String model, double price) {
        
        super(price);
        setModel(model);
    }

    @Override
    public String toString() {
        return "Велосипедът е модел \"" + getModel() + "\" с цена = " + getPrice();
    }   
}
