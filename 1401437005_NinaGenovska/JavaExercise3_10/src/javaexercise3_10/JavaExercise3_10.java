/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexercise3_10;
import java.util.Scanner;
/**
 *
 * @author Nina
 */
public class JavaExercise3_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter an integer: ");
        int number = scanner.nextInt();
        System.out.println(" Bits : " + Integer.toBinaryString(number));
    }
    
}
