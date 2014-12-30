package trapezium_circle;

public class Circle implements Figure{

    private double r;
    
    protected double getR() {
        return r;
    }
    
    protected void setR(double r) {
        this.r = r;
    }
    
    @Override
    public void typeParameters() {
        System.out.print("Въведете радиус: ");
        setR(Input.validationDouble());
    }

    @Override
    public double calculateSurface() {
       return Math.PI * Math.pow(getR(), 2);
    }
}
