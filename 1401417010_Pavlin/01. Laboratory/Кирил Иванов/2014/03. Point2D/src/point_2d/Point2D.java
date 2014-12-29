package point_2d;

public class Point2D {
    
    private int x;
    private int y;

    protected int getX() {
        return x;
    }

    protected int getY() {
        return y;
    }

    protected final void setX(int x) {
        this.x = x;
    }

    protected final void setY(int y) {
        this.y = y;
    }

    protected Point2D(int x, int y) {
        
        setX(x);
        setY(y);
    }
    
    protected void getParam() {
        
        System.out.println("Абцисна на точка X е " + getX());
        System.out.println("Апликатна на точка Y e " + getY() + "\n");
    }
    
    protected double pointCoordinate() {

        double pointCoordinate =  Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2));
                
        return pointCoordinate;
    }
}
