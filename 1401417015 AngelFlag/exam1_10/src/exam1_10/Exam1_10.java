/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam1_10;

/**
 *
 * @author THE NET
 */
import java.util.Scanner;
public class Exam1_10 { 
    /**
     */
    public static void f(double a, double b){
       
        System.out.println((a*a + (2*a-(b*b)) + 7*b));
  
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Въведете а=");
        Double a = scanner.nextDouble();
        
        System.out.print("Въведете b=");
        Double b = scanner.nextDouble();
        
        System.out.print("Въведете c=");
        Double c = scanner.nextDouble();
        
        System.out.print("Въведете d=");
        Double d = scanner.nextDouble();
        
        scanner.close();
        
        System.out.println(a + b + c +d);
        f(a,b);
        f(a,d);
        f(b,c);
        
    }   
    }