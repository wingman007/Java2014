package bicycle_skis;

public class Ski extends Products {
    
    private double lenght;
    private double width;
    
    protected double getLenght() {
        return lenght;
    }
    
    protected double getWidth() {
        return width;
    }

    protected final void setLenght(double lenght) {
        this.lenght = lenght;
    }
    
    protected final void setWidth(double width) {
        this.width = width;
    }

    protected Ski(double lenght, double width, double price) {
        super(price);
        setWidth(width);
        setLenght(lenght);
    }

    @Override
    public String toString() {
        return "Ските са с дължина " + getLenght() + ", широчина " + getWidth() + " и цена = " + getPrice();
    }   
}
