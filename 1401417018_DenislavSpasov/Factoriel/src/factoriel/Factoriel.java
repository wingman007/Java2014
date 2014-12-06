/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoriel;

import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Factoriel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        
        System.out.print(number + " factorial = " + FactorielCalc(number));
        
    }
    
    public static int FactorielCalc(int number) 
    {
        if(number == 0 || number == 1) 
        {
            return 1;
        }
        
        
        int temp = number;
        int factorial = 1;
        
        for(int counter = number; counter > 1; counter--)
        {
            factorial *= counter;
        }
        
        return factorial;
    }
    
}
