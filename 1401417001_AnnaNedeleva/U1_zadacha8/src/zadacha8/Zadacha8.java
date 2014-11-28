/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadacha8;

/**
 *
 * @author User
 */
public class Zadacha8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        short s1=5, s2 = 6;

        System.out.println(true && true); // true
        System.out.println(false && false); // false
        System.out.println(true && false); // false
        System.out.println(); 

        System.out.println((s1<s2) && (s1+1==s2)); // true
        System.out.println();

        System.out.println(true || false); // true
        System.out.println(s1<s2 || s1==s2); // true
        System.out.println();

        System.out.println(!true); // false
        System.out.println(!(s1<s2)); // false
        System.out.println(!(s1>s2)); // true
        System.out.println();

        System.out.println(!(s1<s2) && false || true); // true - няколко оператора

        System.out.println(!(s1<s2) || false && true); // false - няколко оператора
        // TODO code application logic here
    }
    
}
