/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam2_6;

import java.util.Scanner;

/**
 *
 * @author THE NET
 */
public class Exam2_6 {
    
    public static void m1(int a, int b){
        
            int m = a;
            if (m < b);
            m = a;
            //
            
        System.out.println(m);
            //m=m+1;
    }
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
            System.out.println("Въведете стойност за a:");
            int a = scanner.nextInt();
        
            System.out.println("Въведете стойност за b:");
            int b = scanner.nextInt();
        
            scanner.close();
           
            m1(a,b);
    }
    
}
