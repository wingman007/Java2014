package figures;

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
    public void getParam() {
        
        System.out.println("Страните на правоъгълника са " + getA() + " и " + getB() + "\n");
    }

    @Override
    public double calculateSurfice() {
        
        double S = getA() * getB();
        
        return S;
    }   
}
