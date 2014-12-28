package exercise_1_6;

public class Parallelepiped {
    
    private double a;
    private double b;
    private double h;

    protected double getA() {
        return a;
    }

    protected double getB() {
        return b;
    }

    protected double getH() {
        return h;
    }

    protected final void setA(double a) {
        this.a = a;
    }

    protected final void setB(double b) {
        this.b = b;
    }

    protected final void setH(double h) {
        this.h = h;
    }

    protected Parallelepiped(double a, double b, double h) {
        
        setA(a);
        setB(b);
        setH(h);
    }
    
    protected void printParam() {
        
        System.out.println("Ширината на кашона е " + getA() + ", дължината е " + getB() + " и височината е " + getH() + ".\n");
    }
    
    protected double calculateVolume() {
        
        double V = getA() * getB() * getH();
        
        return V;
    }
}
