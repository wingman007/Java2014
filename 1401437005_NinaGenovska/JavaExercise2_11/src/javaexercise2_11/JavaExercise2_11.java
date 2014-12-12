/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexercise2_11;

import java.util.Scanner;

/**
 *
 * @author Nina
 */
public class JavaExercise2_11 {
public static void m(int[]massiv){
    for(int i=0; i< massiv.length; i++)
      System.out.println(massiv[i]);
}
public static void m1(int[]massiv){
    for(int i= massiv.length - 1; i<0; i--)
    System.out.println(massiv[i]);
       
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner imput = new Scanner(System.in);
    System.out.println("Enter the lenght of array");
    int lenght = imput.nextInt();
    int[] myArray = new int[lenght];
    for (int i = 0; i < myArray.length; i++){
        System.out.println("Please enter element myArray[\" + i + \"]\"");
     myArray[i] = imput.nextInt(); 
    }
    m(myArray);
    m1(myArray);
    System.out.println();
        
    }
    
}
