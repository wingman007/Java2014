package array_figures;

public class Triangle implements Figures {

    private double a;
    private double h;
    
    protected double getA() {
        return a;
    }

    protected double getH() {
        return h;
    }
    
    protected final void setA(double a) {
        this.a = a;
    }

    protected final void setH(double h) {
        this.h = h;
    }

    protected Triangle(double a, double h) {
        setA(a);
        setH(h);
    }
    
    @Override
    public double calculateSurface() {
        
        double S = getA() * getH();
        return S;
    }
}
