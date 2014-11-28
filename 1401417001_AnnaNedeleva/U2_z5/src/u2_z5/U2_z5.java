/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u2_z5;

import java.util.Scanner;
/**
 *
 * @author User
 */
public class U2_z5 {
    
    public static int max(int i1,int i2){
        int max=i1>i2?i1:i2;
        return max;
        // return max=i1>i2?i1:i2;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Въведи 1-во число за сравнение: ");
        int a=sc.nextInt();
        System.out.println("Въведи 2-во число за сравнение: ");
        int b=sc.nextInt();
        System.out.println("Въведи 3-то число за сравнение: ");
        int c=sc.nextInt();
        int max=max(a,b);
        System.out.println("Найголямо от 3-те числа е "+ max(max,c));
        sc.close();
        // TODO code application logic here
    }
    
}
