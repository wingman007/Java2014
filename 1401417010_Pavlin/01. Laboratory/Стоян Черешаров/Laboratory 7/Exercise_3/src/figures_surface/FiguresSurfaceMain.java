package figures_surface;

public class FiguresSurfaceMain {

    public static void main(String[] args) {
        
        Surface triangle = new Triangle(4, 5);
        Surface rectangle = new Rectangle(2, 4);
        Surface circle = new Circle(5);
        
        Surface user = new Surface();
        
        user.setFigures(triangle);
  
        user.setFigures(rectangle);
        
        user.setFigures(circle);
    }
}