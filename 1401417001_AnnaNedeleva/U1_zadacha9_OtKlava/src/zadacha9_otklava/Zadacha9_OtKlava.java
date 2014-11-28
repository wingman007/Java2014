/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadacha9_otklava;

import java.util.Scanner;
 /*
 * @author User
 */
public class Zadacha9_OtKlava {
        public static void poGolyamoOt50(double d1, double d2) {
        double d3 = d1*d2; // временна променлива
        if(d3>50) {
            System.out.println(d1 + "*" + d2 + " = " + d3);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Въведете c1 = ");
        int c1 = sc.nextInt();
        System.out.print("Въведете c2 = ");
        int c2 = sc.nextInt();
        sc.close();
        poGolyamoOt50(c1,c2);
        poGolyamoOt50(c1,10);
        poGolyamoOt50(9.66,20.234);    
        // TODO code application logic here
    }
    
}
