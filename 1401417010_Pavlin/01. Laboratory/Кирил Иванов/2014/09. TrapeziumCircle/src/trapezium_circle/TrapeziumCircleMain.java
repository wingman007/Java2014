package trapezium_circle;

public class TrapeziumCircleMain {

    public static void main(String[] args) {

        Figure figure;
        
        if (Input.validationChoice() == 1) {
            
            figure = new Trapeze();
        }
        
        else {
            
            figure = new Circle();
        }
        
        figure.typeParameters();
        System.out.println("Лицето на фигурата е " + figure.calculateSurface());
    }
}
