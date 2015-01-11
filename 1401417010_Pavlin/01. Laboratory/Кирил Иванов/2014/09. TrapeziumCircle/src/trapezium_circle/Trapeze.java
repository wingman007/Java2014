package trapezium_circle;

public class Trapeze implements Figure {
    
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

    protected void setA(double a) {
        this.a = a;
    }

    protected void setB(double b) {
        this.b = b;
    }

    protected void setH(double h) {
        this.h = h;
    }
    
    @Override
    public void typeParameters() {
        System.out.print("Въведете a: ");
        setA(Input.validationDouble());

        System.out.print("Въведете b: ");
        setB(Input.validationDouble());
        
        System.out.print("Въведете h: ");
        setH(Input.validationDouble());
    }

    @Override
    public double calculateSurface() {
        return ((getA() + getB()) / 2) * getH();
    }
}
