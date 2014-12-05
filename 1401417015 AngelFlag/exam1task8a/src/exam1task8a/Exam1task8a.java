/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam1task8a;

/**
 *
 * @author THE NET
 */
public class Exam1task8a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        short s1=5; 
        short s2=6;
        System.out.println(true && true);
        System.out.println((s2>=s1) && (s1+1 ==s2));
        System.out.println(true || false);
               System.out.println((s1<s2) || (s1 == s2));
        System.out.println(!true);
        System.out.println(!(s1<s2));
        System.out.println(!(s1>s2));              
        System.out.println(!(s1<s2) && false || true);
        System.out.println(!(s1<s2) && false || true);
        
    }
    
}
