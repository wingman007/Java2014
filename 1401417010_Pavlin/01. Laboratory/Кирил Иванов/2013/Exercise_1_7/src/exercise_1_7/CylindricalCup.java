package exercise_1_7;

public class CylindricalCup {
    
    private String model;
    private double diameter;
    private double height;

    protected String getModel() {
        return model;
    }

    protected double getDiameter() {
        return diameter;
    }

    protected double getHeight() {
        return height;
    }

    protected final void setModel(String model) {
        this.model = model;
    }

    protected final void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    protected final void setHeight(double height) {
        this.height = height;
    }

    protected CylindricalCup(String model, double diameter, double height) {
        
        setModel(model);
        setDiameter(diameter);
        setHeight(height);
    }
    
    protected void getParam() {
        
        System.out.println("Чашата е модел " + getModel() + " с диаметър " + getDiameter() + " и височина " + getHeight() + ".\n");
    }
    
    protected double calculateVolume() {
        
        double r = getDiameter() / 2;
        
        double V = Math.PI * Math.pow(r, 2) * getHeight();
                
        return V;
    }
}
