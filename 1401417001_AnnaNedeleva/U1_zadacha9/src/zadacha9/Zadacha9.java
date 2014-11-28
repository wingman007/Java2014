/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadacha9;

/**
 *
 * @author User
 */
public class Zadacha9 {
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
        double c1=5.8,c2=6.0;
        poGolyamoOt50(c1,c2);
        poGolyamoOt50(c1,10);
        poGolyamoOt50(9.66,20.234);    
        // TODO code application logic here
    }
    
}
