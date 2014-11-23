/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package errorhandling;

/**
 *
 * @author fmi
 */
public class ErrorHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {          
           // int a = 10;
           // int b = 0;
           // int z = a/b;
            
           double a = 10;
           double b = 0;
           double z = a/b;

           System.out.println(z);       
        }
        // catch (Exception err) { // catch all
        catch ( ArithmeticException err) { // narrowing down the type of error you expect
            System.out.println(err.getMessage());
        }
    }
    
}
