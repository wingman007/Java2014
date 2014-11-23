/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplenumbers;

/**
 *
 * @author dev
 */
public class SimpleNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] SimpleNumbersArray = CalcSimpleNumbers(32, 259);
        
        for(int value : SimpleNumbersArray){
            System.out.println(value + "\n");
        }
        
    }
    
    public static boolean IsSimpleNumber(int number)
    {
        
        for(int counter = 2; counter < number; counter++)
        {
            if(number % counter == 0)
            {
                return false;
            }
        }
        
        return true;
    }
    
    public static int[] CalcSimpleNumbers(int start, int end)
    {
        int length = end - start;
        int[] SimpleNumbers = new int[length];
        
        int arrayCounter = 0;
        for(int counter = start; counter < end; counter++)
        {
            if(IsSimpleNumber(counter))
            {
                SimpleNumbers[arrayCounter] = counter;
            }
            arrayCounter++;
        }
        
        return SimpleNumbers;
    }
}
