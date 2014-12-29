package figures;

public class Circle implements Figures {

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
    
    @Override
    public void getParam() {
        
        System.out.println("Радиусът на кръга е " + getR() + "\n");
    }

    @Override
    public double calculateSurfice() {
        
        double S = Math.PI * Math.pow(getR(), 2);
        
        return S;
    }   
}
