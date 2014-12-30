package volume_to_mass;

public abstract class Figures {
    
    abstract void typeParameters();
    abstract double calculateMass();
    
    private double density;

    protected double getDensity() {
        return density;
    }

    protected void setDensity(double density) {
        this.density = density;
    }
}
