package goods;

public class Products {

    private String model;
    private int price;

    protected String getModel() {
        return model;
    }
    
    protected int getPrice() {
        return price;
    }
    
    protected final void setModel(String model) {
        this.model = model;
    }

    protected final void setPrice(int price) {
        this.price = price;
    }

    protected Products(String model, int price) {
        setModel(model);
        setPrice(price);
    }  
}
