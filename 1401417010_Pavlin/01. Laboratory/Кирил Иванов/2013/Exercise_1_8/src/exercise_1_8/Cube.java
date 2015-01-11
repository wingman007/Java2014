package exercise_1_8;

public class Cube {
    
    private double a;

    protected double getA() {
        return a;
    }

    protected final void setA(double a) {
        this.a = a;
    }

    protected Cube(double a) {
        setA(a);
    }
    
    protected void getParam() {
        
        System.out.printf("Страните на куба са равни на %.3f.\n", getA());
    }
    
    protected void calculateVolume() {
        
        double V = Math.pow(getA(), 3);
        
        System.out.printf("\nОбемът на куба е %.3f.\n", V);
    }
}
