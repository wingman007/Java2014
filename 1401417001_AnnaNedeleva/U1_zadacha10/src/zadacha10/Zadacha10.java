/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadacha10;

/**
 *
 * @author User
 */
public class Zadacha10 {

    public static void method2(double d1, double d2){ // !!! bez public i static??
        if (d1+d2>20)
            System.out.println((d1+d2)*(d1-d2));
        else
            System.out.println((d1+d2)/5);
    };
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a,b;
        a=17.77; b=23.11;
        method2(a,b);
        method2(.666,10.444);
        // TODO code application logic here
    }
    
}
