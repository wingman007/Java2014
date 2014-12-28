package exercise_1_9;

public class Rectangle {
    
    private int a;
    private int b;

    protected int getA() {
        return a;
    }

    protected int getB() {
        return b;
    }

    protected final void setA(int a) {
        this.a = a;
    }

    protected final void setB(int b) {
        this.b = b;
    }

    protected Rectangle(int a, int b) {
        setA(a);
        setB(b);
    }
    
    protected void getParam() {
        
        System.out.println("Страните на правоъгълника са А - " + getA() + " и B - " + getB() + ".\n");
    }
    
    protected double calculateCircleRadius() {
        
        double rectangleDiagonal = Math.sqrt(Math.pow(getA(), 2) + Math.pow(getB(), 2));
        
        double circleRadius = rectangleDiagonal / 2; // диаметърът на окръжността е равен на диагонала на правоъгълника
        
        return circleRadius;
    }
}
