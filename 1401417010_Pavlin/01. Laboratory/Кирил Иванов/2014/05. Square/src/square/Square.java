package square;

public class Square {
    
    private int a;

    protected int getA() {
        return a;
    }

    protected final void setA(int a) {
        this.a = a;
    }

    protected Square(int a) {
        setA(a);
    }
    
    protected void getParam() {
        
        System.out.println("Всяка от страните на квадрата е : " + getA());
    }
    
    protected double calculateSurfice() {
        
        double S = Math.pow(getA(), 2);
        return S;
    }
}
