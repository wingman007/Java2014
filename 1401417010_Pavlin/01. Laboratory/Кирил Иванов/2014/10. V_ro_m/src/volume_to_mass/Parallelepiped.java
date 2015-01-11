package volume_to_mass;

public class Parallelepiped extends Figures {
    
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
        
        System.out.print("Въведете плътност: ");
        setDensity(Input.validationDouble());
    }

    @Override
    public double calculateMass() {
        
        double V = getA() * getB() * getH();
        return V * getDensity();
    }
}
