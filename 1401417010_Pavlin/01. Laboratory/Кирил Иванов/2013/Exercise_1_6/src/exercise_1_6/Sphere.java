package exercise_1_6;

public class Sphere {
    
    private String material;
    private double diameter;

    protected String getMaterial() {
        return material;
    }

    protected double getDiameter() {
        return diameter;
    }

    protected final void setMaterial(String material) {
        this.material = material;
    }

    protected final void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    protected Sphere(String material, double diameter) {
        
        setMaterial(material);
        setDiameter(diameter);
    }
    
    protected void printParam() {
        
        System.out.println("Диаметърът на топката е " + getDiameter() + " и нейният материал е " + getMaterial() + ".\n");
    }
    
    protected double calculateVolume() {
        
        double r = getDiameter() / 2;
        
        double V = 4/3 * Math.PI * r * r * r;
        
        return V;
    }
}
