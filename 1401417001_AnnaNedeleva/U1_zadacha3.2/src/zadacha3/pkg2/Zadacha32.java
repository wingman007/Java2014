/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadacha3.pkg2;

/**
 *
 * @author User
 */
public class Zadacha32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double d1=10.2525, d2=2.252555;
        method3(d1,d2);
        method3(99.99999,3.33333);
    // TODO code application logic here
    }
        public static void method3(double a, double b){
            System.out.printf("%.3f+%.3f=%.3f\n",a,b,a+b);
            System.out.printf("%.3f-%.3f=%.1f\n",a,b,a-b);
            System.out.printf("%.3f*%.3f=%.1f\n",a,b,a*b);
            System.out.printf("%.3f/%.3f=%.1f\n",a,b,a/b);  
            System.out.println();
        }
}
