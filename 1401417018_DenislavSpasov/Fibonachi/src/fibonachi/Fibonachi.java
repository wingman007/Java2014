/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonachi;
import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Fibonachi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] FibonachiLine = Fibonachi();
        
        for(int value : FibonachiLine)
        {
            System.out.println(value + "\n");
        }
        
    }
    
    public static int[] Fibonachi()
    {
        int temp = 1;
        int nextValue;
        int nextSecondValue;
        int[] FibonachiNumbers = new int[50];
        
        for(int i = 0; i < 50; i++)
        {
             if(i == 0 || i == 1){
                 FibonachiNumbers[i] = 1;
             }
             else {
                 FibonachiNumbers[i] = FibonachiNumbers[i-1] + FibonachiNumbers[i-2];
             }
             
        }
        
        return FibonachiNumbers;
    }
    
}
