package array_figures;

public class Circle implements Figures {

    private double r;

    protected double getR() {
        return r;
    }

    protected final void setR(double r) {
        this.r = r;
    }

    protected Circle(double r) {
        setR(r);
    }
    
    @Override
    public double calculateSurface() {
        
        double S = Math.PI * Math.pow(getR(),2);
        return S;
    }
}
