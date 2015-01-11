package exercise_1_9;

public class Exercise_1_9 {

    public static void main(String[] args) {
        
        Rectangle rectangle = new Rectangle(2, 5);
        
        rectangle.getParam();
        
        Circle circle = new Circle(rectangle.calculateCircleRadius());
        
        circle.getParam();
        circle.calculatePerimeter();
        
    }
}
