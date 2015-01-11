package figures_surface;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Surface {
    
    private Surface figures;

    public Surface getFigures() {
        return figures;
    }

    public final void setFigures(Surface figures) {
        this.figures = figures;
    }
       
    public void calculateTriangle(int a, int h) {
        
        System.out.println("S = (a.h)/2 => " + ((a * h)/2)); 
    }
    
    public void calculateRectangle(int a, int b) {
        
        System.out.println("S = a.b => " + (a * b));
    }
    
    public void calculateCircle(int r) {
        
        System.out.printf("S = πr2 => %.3f\n", (PI * pow(r, 2)));
    }
}