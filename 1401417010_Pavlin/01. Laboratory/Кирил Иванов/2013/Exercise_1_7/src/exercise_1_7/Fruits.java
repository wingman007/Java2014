package exercise_1_7;

public class Fruits {

    private String name;
    private double weight;
    private double volume100g;

    protected String getName() {
        return name;
    }

    protected double getWeight() {
        return weight;
    }

    protected double getVolume100g() {
        return volume100g;
    }

    protected final void setName(String name) {
        this.name = name;
    }

    protected final void setWeight(double weight) {
        this.weight = weight;
    }

    protected final void setVolume100g(double volume100g) {
        this.volume100g = volume100g;
    }

    public Fruits(String name, double weight, double volume100g) {
        
        setName(name);
        setWeight(weight);
        setVolume100g(volume100g);
    }
    
    protected double calculateVolume() {
        
        double V = (getWeight() / 100) * getVolume100g();
        
        return V;
    }
}
