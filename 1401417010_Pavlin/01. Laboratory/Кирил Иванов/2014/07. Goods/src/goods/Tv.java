package goods;

public class Tv extends Products {
    
    private int screenSize;

    protected int getScreenSize() {
        return screenSize;
    }
    
    protected final void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    protected Tv(String model, int price, int screenSize) {
        super(model, price);
        setScreenSize(price);
    }
}
