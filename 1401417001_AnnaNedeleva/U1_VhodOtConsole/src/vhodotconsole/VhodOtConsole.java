/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vhodotconsole;

/**
 *
 * @author User
 */
import java.util.Scanner; //  !!! Трябва ли???

public class VhodOtConsole {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    
        System.out.print("Въведете i = ");
        int i = scanner.nextInt();
        System.out.print("Въведете j = ");
        int j = scanner.nextInt();
        scanner.close();
        System.out.println("i+j=" + (i + j));
        // TODO code application logic here
    }
}
