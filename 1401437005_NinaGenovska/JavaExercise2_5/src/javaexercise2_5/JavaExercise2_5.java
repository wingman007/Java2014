/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexercise2_5;

import java.util.Scanner;

/**
 *
 * @author Nina
 */
public class JavaExercise2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner scanner = new Scanner(System.in);
     System.out.println("Въведете x =");
     int x = scanner.nextInt();
     System.out.println("Въведете y =");
     int y = scanner.nextInt();
     System.out.println("Въведете z =");
     int z = scanner.nextInt();
     int d = x >y? x: y;
     System.out.println("Максималното число е " + Math.max(d, z));
    }
    
}
