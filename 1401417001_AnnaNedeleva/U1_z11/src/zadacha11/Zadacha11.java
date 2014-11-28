/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadacha11;

import java.util.Scanner;
/**
 *
 * @author User
 */
public class Zadacha11 {
    public static void f(double a, double b){
        double r=a*a + 2*(a-b*b)+7*b;
       // r=a*a + 2*(a-b*b)+7*b;
        System.out.printf("%.3f\n",r);
        
    /**
     * @param args the command line arguments
     */
    }   
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); // ??????????????????????????
        System.out.print("Въведи а="); // ДА ВЪВЕЖДАМЕ ДРОБИ С "," , А НЕ "." ?????
        double a=sc.nextDouble();
        System.out.print("Въведи b=");
        double b=sc.nextDouble();
        System.out.print("Въведи c=");
        double c=sc.nextDouble();
        System.out.print("Въведи d=");
        double d=sc.nextDouble();    
        sc.close();
        f(a,d);
        f(b,c);
        // TODO code application logic here6
    }
    
}
