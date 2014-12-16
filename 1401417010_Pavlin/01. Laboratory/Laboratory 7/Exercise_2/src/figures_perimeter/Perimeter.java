package figures_perimeter;

import static java.lang.Math.PI;

public class Perimeter {
    
    private Perimeter figures;

    public Perimeter getFigures() {
        return figures;
    }

    public final void setFigures(Perimeter figures) {
        this.figures = figures;
    }
       
    public void calculateTriangle(int a, int b, int c) {
        
        System.out.println("P = a + b + c => " + (a + b + c)); 
    }
    
    public void calculateRectangle(int a, int b) {
        
        System.out.println("P = 2a + 2b => " + (2*a + 2*b));
    }
    
    public void calculateCircle(int r) {
        
        System.out.println("P = 2 * PI * r => " + (2 * PI * r));
    }
}