package exercise_1_8;

public class Sphere {

    private double diameter;

    protected double getDiameter() {
        return diameter;
    }

    protected final void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    protected Sphere(double r) {
        setDiameter(r);
    }

    protected void getParam() {
        
        System.out.println("Диаметърът на сферата е " + getDiameter() + ".\n");
    }
    
    protected double getCubeSide() {
        
        double cubeSide = getDiameter() / Math.sqrt(3); // диаметърът на сферата е диагонала на куба, който се побира в нея
        
        return cubeSide;
    }
}
