/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam2_5task5;

/**
 *
 * @author THE NET
 */
import java.util.*;

public class Exam2_5task5 {
    //Зад. 5 - СР
//Като използвате функцията max от зад. 4.2. 
//създайте основна програма s три цели числа от конзолата и намирате, максималното от тях.

    public static void max1(int a, int b, int c){
                               
        int max = (a > b && a > c) ? a : ((b > a && b > c) ? b : c);
            System.out.println(max);
    }
       
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Въведете a= ");
        int a = scanner.nextInt();
    
        System.out.print("Въведете b = ");
        int b = scanner.nextInt();
       
        System.out.print("Вуведете c = ");
        int c = scanner.nextInt();
        
        scanner.close();
        
        max1(a,b,c);
          
    }
}
