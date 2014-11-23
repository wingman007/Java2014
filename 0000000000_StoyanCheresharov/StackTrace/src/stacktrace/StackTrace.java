/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stacktrace;

/**
 *
 * @author fmi
 */
public class StackTrace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Start main");
        m1();
        System.out.println("End main");
    }
    
    public static void m1() {
       System.out.println("second method m1");
       m2();
    }
    
     public static void m2() {
       System.out.println("last method m2"); 
        try {
            // start with this
            // int x = 10;
            // int y = 0;
            // int z = x / y;

            // second step change the code to double
            double x = 10.0;
            double y = 0.0;
            double z = x / y;
            System.out.println( z );
        }
        // catch ( Exception err ) { // "catch all"
        catch ( ArithmeticException err) { // narrowing down the type of error you expect
                System.out.println( err.getMessage( ) ); // / by zero,  second Infinity
        }
    }   
}
