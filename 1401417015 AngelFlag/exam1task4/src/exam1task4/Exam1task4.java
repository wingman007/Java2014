/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam1task4;

/**
 *
 * @author THE NET
 */
public class Exam1task4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, j;
        i=10; j = i++;
        System.out.println(j);   // 10
        i=10; j = ++i;
        System.out.println(j);   // 11
        i=10; j = i--;
        System.out.println(j);   // 10
        i=10; j = --i;
        System.out.println(j);   // 9

    }    
}
