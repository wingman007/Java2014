/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u3;

/**
 *
 * @author User
 */
public class U3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No Command Line arguments");
        } 
        else {
            System.out.println("You provided " + args.length+ " arguments");
            for (int i = 0; i < args.length; i++) {
                System.out.println("args[" + i + "]: "+ args[i]);
            }
  }
        // TODO code application logic here
    }
    
}
