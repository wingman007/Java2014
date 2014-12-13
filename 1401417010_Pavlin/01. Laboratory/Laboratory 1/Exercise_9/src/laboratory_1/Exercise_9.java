package laboratory_1;

public class Exercise_9 {

    public static void main(String[] args) {
        
        int i=1;

        поГолямоОт50( 40, 9 , i++);
        поГолямоОт50( 42, 9 , i++);
        поГолямоОт50( 43, 9 , i++);
        поГолямоОт50( 33, 9 , i++);
        поГолямоОт50( 53, 9 , i++);
    }
    
    public static void поГолямоОт50(double d1, double d2, int i) {
    
        if( (d1 + d2) > 50) {   
            System.out.println( "Ред " + i + " - " + (d1 + d2));
        }
        
        else {
            System.out.println("Ред " + i + " - По-малко от 50");
        } 
    }
}
