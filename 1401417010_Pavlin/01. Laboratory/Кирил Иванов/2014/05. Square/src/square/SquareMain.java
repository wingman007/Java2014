package square;

public class SquareMain {

    public static void main(String[] args) {
        
        Square square1 = new Square(4);
        Square square2 = new Square(1);
        
        square1.getParam();
        System.out.println("Лицето на квадрата е " + square1.calculateSurfice() + "\n");
        
        square2.getParam();
        System.out.println("Лицето на квадрата е " + square2.calculateSurfice() + "\n");
        
        SquareMain figures = new SquareMain();
        figures.calculateSurficeSum(square1, square2);
    }

    protected void calculateSurficeSum(Square square1, Square square2) {
        
        double calculateSurficeSum = square1.calculateSurfice() + square2.calculateSurfice();
        
        System.out.println("Сумата от лицата на двата квадрата е " + calculateSurficeSum);
    }
}
