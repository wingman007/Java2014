package rhombus_triangle;

public class RhombusTriangleMain {

    public static void main(String[] args) {
        
        Figures rhombus = new Rhombus(8, 3);
        
        Figures isoscelesTriangle = new IsoscelesTriangle(5, 6);
        
        rhombus.readParam();
        System.out.println("Лицето на ромба е " + rhombus.calculateSurfice());
        
        isoscelesTriangle.readParam();
        System.out.println("Лицето на равнобедрения триъгълник е " + isoscelesTriangle.calculateSurfice());
        
        calculateSurficeSum(rhombus, isoscelesTriangle);
    }
    
    protected static void calculateSurficeSum(Figures figure1, Figures figure2) {
        
        System.out.println("Сумата от лицата на две дадени фигури е " + (figure1.calculateSurfice() + figure2.calculateSurfice()));
    }
}
