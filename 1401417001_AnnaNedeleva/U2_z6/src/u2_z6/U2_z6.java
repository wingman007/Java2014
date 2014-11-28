/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u2_z6;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class U2_z6 {
    
    public static void m(int i1, int i2){
        for (int i=i1;i<=i2;i++)
            System.out.print(i+" ");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Въведи 1-во число: ");
        int a=sc.nextInt();
        System.out.println("Въведи 2-во число: ");
        int b=sc.nextInt();
        m(a,b);
        sc.close();
        // TODO code application logic here
    }
    
}
