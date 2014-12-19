package laboratory_2;

import java.util.Scanner;

public class Exercise_6 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Type Number 1: ");
        int number1 = input.nextInt();
        
        System.out.print("Type Number 2: ");
        int number2 = input.nextInt();
        
        m(number1, number2); 
    }
    
    public static void m(int i1, int i2) {
        
        if(i1 > i2) {
            System.out.println("Първото число трябва да е по-малко!");
        }
        
        else {
            
            do {
                System.out.println(i1);
                i1++;
            }
            
            while(i1 <= i2);
        }
    }
}
