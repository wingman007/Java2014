package rhombus_triangle;

public class Rhombus implements Figures {
    
    private int diagonalA;
    private int diagonalB;

    protected int getDiagonalA() {
        return diagonalA;
    }

    protected int getDiagonalB() {
        return diagonalB;
    }

    protected final void setDiagonalA(int diagonalA) {
        this.diagonalA = diagonalA;
    }

    protected final void setDiagonalB(int diagonalB) {
        this.diagonalB = diagonalB;
    }

    protected Rhombus(int diagonalA, int diagonalB) {
        setDiagonalA(diagonalA);
        setDiagonalB(diagonalB);
    }
    
    @Override
    public void readParam() {
        System.out.println("Параметрите на ромба са : диагонали - " + getDiagonalA() + " и " + getDiagonalB());
    }
    
    @Override
    public double calculateSurfice() {
        
        double surfice = getDiagonalA() * getDiagonalB() / 2.0; 
        return surfice;
    } 
}
