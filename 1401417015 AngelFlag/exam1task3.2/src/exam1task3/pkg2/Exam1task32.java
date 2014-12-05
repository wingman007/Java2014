/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam1task3.pkg2;

/**
 *
 * @author THE NET
 */
public class Exam1task32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double d1=5.2; double d2=2.3;
        
        m(d1,d2);
        m(d2 , d1);
        m(2.0,1.2);
        
    }
    public static void m(double d1, double d2){
    
        System.out.println(d1 + "+" + d2 +"=" + (d1+d2));//l
        System.out.println(d1 + "-" + d2 + "=" + (d1-d2));
        System.out.println(d1 + "*" + d2 + "=" + (d1 * d2));
        System.out.println(d1 + "/" + d2 + "=" + (d1 / d2));
       
}
}
