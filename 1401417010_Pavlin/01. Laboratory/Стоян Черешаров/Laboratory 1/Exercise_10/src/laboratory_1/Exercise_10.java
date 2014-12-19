package laboratory_1;

public class Exercise_10 {

    public static void main(String[] args) {

        m(13, 27);
        m(7, 2);
    }
    
    public static void m(double d1, double d2) {
    
        if ((d1+d2) > 20) {
            System.out.println((d1+d2)*(d1-d2));
        }
        
        else {
            System.out.println((d1+d2)/5);
        }
    } 
}