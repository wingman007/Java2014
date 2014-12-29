package batches;

public class Batch {
    
    private String fruitType;
    private int fruitQuantity;
    private double pricePerKg;
    private double overallPrice;

    protected String getFruitType() {
        return fruitType;
    }

    protected int getFruitQuantity() {
        return fruitQuantity;
    }

    protected double getPricePerKg() {
        return pricePerKg;
    }

    protected double getOverallPrice() {
        return overallPrice;
    }

    protected final void setFruitType(String fruitType) {
        this.fruitType = fruitType;
    }

    protected final void setFruitQuantity(int fruitQuantity) {
        this.fruitQuantity = fruitQuantity;
    }

    protected final void setPricePerKg(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    protected final void setOverallPrice(int fruitQuantity, double pricePerKg) {
        this.overallPrice = fruitQuantity * pricePerKg;
    }

    protected Batch(String fruitType, int fruitQuantity, double pricePerKg) {
        
        setFruitType(fruitType);
        setFruitQuantity(fruitQuantity);
        setPricePerKg(pricePerKg);
        
        setOverallPrice(fruitQuantity, pricePerKg);
    }
}
