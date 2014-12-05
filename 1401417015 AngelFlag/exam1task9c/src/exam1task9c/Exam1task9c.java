/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam1task9c;

/**
 *
 * @author THE NET
 */
public class Exam1task9c {

    /**
     * @param d1
     * @param d2
     */
    public static void m(double d1, double d2){
        if (d1+d2> 20)
        System.out.println((d1+d2)*(d1-d2));
        else
        System.out.println((d1+d2)/5));
        
    }
    public static void main(String[] args) {
        m(11,15);
        m(5,11);
        
    }
    public static void f(double a, double b){
        
        
        System.out.println(a*a + 2*(a-b*b)+7*b);
    }
}
