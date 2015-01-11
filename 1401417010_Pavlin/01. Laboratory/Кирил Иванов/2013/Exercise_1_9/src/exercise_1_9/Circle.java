package exercise_1_9;

public class Circle {
    
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
    
    protected void getParam() {
        
        System.out.printf("Радиусът на окръжността е %.3f.\n", getR());
    }
    
    protected void calculatePerimeter() {
        
        double perimeter = 2 * Math.PI * getR();
        
        System.out.printf("\nПериметърът на окръжността е %.3f.\n", perimeter);
    }
}
