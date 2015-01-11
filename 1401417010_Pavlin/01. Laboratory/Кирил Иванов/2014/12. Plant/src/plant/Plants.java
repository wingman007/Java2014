package plant;

public class Plants {
    
    private String name;
    private double height;
    private double price;
    private String firstFloweringMonth;
    private String lastFloweringMonth;

    protected String getName() {
        return name;
    }

    protected double getHeight() {
        return height;
    }

    protected double getPrice() {
        return price;
    }

    protected String getFirstFloweringMonth() {
        return firstFloweringMonth;
    }

    protected String getLastFloweringMonth() {
        return lastFloweringMonth;
    }

    protected final void setName(String name) {
        this.name = name;
    }

    protected final void setHeight(double height) {
        this.height = height;
    }

    protected final void setPrice(double price) {
        this.price = price;
    }

    protected final void setFirstFloweringMonth(String firstFloweringMonth) {
        this.firstFloweringMonth = firstFloweringMonth;
    }

    protected final void setLastFloweringMonth(String lastFloweringMonth) {
        this.lastFloweringMonth = lastFloweringMonth;
    }

    protected Plants(String name, double height, double price) {
        
        setName(name);
        setHeight(height);
        setPrice(price);
        
        readParamLite();
    }
    
    protected Plants(String name, double height, double price, String firstFloweringMonth, String lastFloweringMonth) {
        
        setName(name);
        setHeight(height);
        setPrice(price);
        setFirstFloweringMonth(firstFloweringMonth);
        setLastFloweringMonth(lastFloweringMonth);
        
        readParamFull();
    }
    
    protected final void readParamLite() {
        
        System.out.println("Названието на растението е " + getName() + ", с височина " + getHeight() + " и цена " + getPrice());
    }
    
    protected final void readParamFull() {
        
        readParamLite();
        System.out.println("Първи месец на цъфтене е " + getFirstFloweringMonth() + ", а последен е " + getLastFloweringMonth() + ".\n");
    }
}
