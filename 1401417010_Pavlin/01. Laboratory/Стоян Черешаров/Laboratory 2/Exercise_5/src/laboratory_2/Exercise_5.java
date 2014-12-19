package laboratory_2;

import java.util.Scanner;

public class Exercise_5 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Number 1: ");
        int number1 = input.nextInt();
        
        System.out.print("Enter Number 2: "); 
        int number2 = input.nextInt();
        
        System.out.print("Enter Number 3: ");
        int number3 = input.nextInt();
        
        System.out.println("Max number is " + maxNumber(number1, number2, number3));   
    }
    
    public static int maxNumber(int par1, int par2, int par3) {
        
        int var = par1 > par2 ? par1 : par2;
        int max = var > par3 ? var : par3;
        return max;
    }
}
