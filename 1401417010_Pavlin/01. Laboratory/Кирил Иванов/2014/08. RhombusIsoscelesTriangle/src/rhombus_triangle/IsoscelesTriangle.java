package rhombus_triangle;

public class IsoscelesTriangle implements Figures {
    
    private int cathetus;
    private int hypotenuse;

    protected int getCathetus() {
        return cathetus;
    }

    protected int getHypotenuse() {
        return hypotenuse;
    }

    protected final void setCathetus(int cathetus) {
        this.cathetus = cathetus;
    }

    protected final void setHypotenuse(int hypotenuse) {
        this.hypotenuse = hypotenuse;
    }

    protected IsoscelesTriangle(int cathetus, int hypotenuse) {
        setCathetus(cathetus);
        setHypotenuse(hypotenuse);
    }
    
    @Override
    public void readParam() {
        System.out.println("Параметрите на триъгълника са : катети - " + getCathetus() + " и хипотенуза - " + getHypotenuse());
    }
    
    @Override
    public double calculateSurfice() {
        
        int perimeter = getCathetus() + getCathetus() + getHypotenuse();
        int semiPerimeter = perimeter / 2;
        double heronSurfice = (semiPerimeter - getCathetus()) * Math.sqrt(semiPerimeter * (semiPerimeter - getHypotenuse()));
        return heronSurfice;
    } 
}
