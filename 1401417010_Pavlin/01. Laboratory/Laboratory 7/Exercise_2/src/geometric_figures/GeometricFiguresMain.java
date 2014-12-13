package geometric_figures;

public class GeometricFiguresMain {

    public static void main(String[] args) {
        
        Perimeter triangle = new Triangle(1, 2, 3);
        Perimeter rectangle = new Rectangle(2, 4);
        Perimeter circle = new Circle(3);
        
        Perimeter user = new Perimeter();
        
        user.setFigures(triangle);
  
        user.setFigures(rectangle);
        
        user.setFigures(circle);
    }
}
