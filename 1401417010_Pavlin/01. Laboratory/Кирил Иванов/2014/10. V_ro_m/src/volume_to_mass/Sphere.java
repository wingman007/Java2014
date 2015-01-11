package volume_to_mass;

public class Sphere extends Figures{

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
        
        System.out.print("Въведете плътност: ");
        setDensity(Input.validationDouble());
    }

    @Override
    public double calculateMass() {
        
       double V = (4.0 / 3.0) * Math.PI * Math.pow(getR(), 3);
       
       return V * getDensity();
    }
}
