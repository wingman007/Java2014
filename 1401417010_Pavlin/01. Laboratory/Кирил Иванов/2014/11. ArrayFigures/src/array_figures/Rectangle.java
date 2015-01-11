package array_figures;

public class Rectangle implements Figures {

    private double a;
    private double b;
    
    protected double getA() {
        return a;
    }

    protected double getB() {
        return b;
    }
    
    protected final void setA(double a) {
        this.a = a;
    }

    protected final void setB(double b) {
        this.b = b;
    }

    protected Rectangle(double a, double b) {
        setA(a);
        setB(b);
    }
    
    @Override
    public double calculateSurface() {
        
        double S = getA() * getB();
        return S;
    }
}
