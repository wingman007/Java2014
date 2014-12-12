/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package values.fibonacci;



import java.util.Scanner;

/**
 *
 * @author Nina
 */
public class ValuesFibonacci {
  
    public static void main(String[] args) {
        // TODO code application logic here
     System.out.print("Enter number upto which Fibonacci series to print: ");
     int number = new Scanner(System.in).nextInt();
     System.out.println("\n\nFibonacci series upto " + number +" numbers : ");
     for(int i=1; i<=number; i++){
     System.out.print(fibonacciRecusion(i) +" ");   
    }
    }
     public static int fibonacciRecusion(int number){
     if(number == 1 || number == 2){
        return 1;
     }
 
    return fibonacciRecusion(number-1) + fibonacciRecusion(number -2); 
    }
}
    
    

