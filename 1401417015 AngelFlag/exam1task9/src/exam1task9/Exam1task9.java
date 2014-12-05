/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam1task9;

/**
 *
 * @author THE NET
 */
import java.util.Scanner;
public class Exam1task9 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); 

	       System.out.print("Въведете две цели числа и низ: i1 i2 s1 = ");
	       int i1, i2;
	       String s;
	       i1 = scanner.nextInt();
	       i2 = scanner.nextInt();
	       s = scanner.next();
	       
	       System.out.println(i1+i2);	       
 	       System.out.println(s);	       
      
	       scanner.close();  

       
    }
    
}
