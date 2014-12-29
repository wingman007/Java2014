package figures;

public class FiguresMain {

    public static void main(String[] args) {
        
        Figures rectangle = new Rectangle(2, 5.5);
        
        rectangle.getParam();
        
        Figures circle = new Circle(Input.validationNumber());
        
        circle.getParam();
        
        System.out.println("Лицето на правоъгълника е " + rectangle.calculateSurfice());
        System.out.println("Лицето на кръга е " + circle.calculateSurfice());
        
        // начин 1
        FiguresMain figures = new FiguresMain();
        figures.calculateSurficeSum(rectangle, circle);
        
        // начин 2
        System.out.println("Сумата от лицата на двете фигури е " + (rectangle.calculateSurfice() + circle.calculateSurfice()));
    }
    
    protected void calculateSurficeSum(Figures figure1, Figures figure2) {
        
        double calculateSurficeSum = figure1.calculateSurfice() + figure2.calculateSurfice();
        
        System.out.println("\nСумата от лицата на двете фигури е " + calculateSurficeSum);
    }
}
