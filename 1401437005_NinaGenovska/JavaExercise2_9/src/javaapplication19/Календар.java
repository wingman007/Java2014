/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.util.Scanner;

/**
 *
 * @author Nina
 */
public class Календар{
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("Въведете число от 1 до 12");
    Scanner s = new Scanner(System.in);
    int месец = s.nextInt();
    String текст;
    switch(месец){
        case 1: текст = "Януари";
            break;
        case 2: текст = "Февруари"; 
            break;
        case 3: текст = "Март";;
            break;
        case 4: текст = "Април";
            break;
        case 5: текст = "Май";
            break;
        case 6: текст = "Юни";
            break;
        case 7: текст = "Юли";
            break;
        case 8: текст = "Август";
            break;
        case 9: текст = "Септември";
            break;
        case 10: текст = "Октомври";
            break;
        case 11: текст = "Ноември";
            break;
        case 12: текст = "Декември";
            break;
        default: текст = "Грешен месец";
                
    }
    System.out.println(текст);
    s.close();
    
                
    }
    
}
