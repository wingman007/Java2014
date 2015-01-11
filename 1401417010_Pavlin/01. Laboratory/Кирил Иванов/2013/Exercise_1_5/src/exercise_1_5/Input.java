package exercise_1_5;

import java.util.Scanner;

public class Input {
        
    private static final Scanner input = new Scanner(System.in, "windows-1251");

    protected static String validationМodel() {
        
        String validInput;

        while (true) {

            System.out.print("Въведете моделът на стола: ");

            validInput = input.nextLine();
            
            if(validInput.matches("[А-Яа-яA-Za-z]*")) {
                
                System.out.println("\nМоделът " + validInput + " е записан.\n");
                break;
            }
            
            else {
                
                System.out.println("\nГрешен модел.\n");
            }
        }
        
        return validInput;
    }
    
    protected static int validationMinHeight() { 
        
        int validInput;

        while (true) {

            System.out.print("Въведете минималната височина: ");

            String inputString = input.next();
            
            if(inputString.matches("[0-9]*")) {
                
                validInput = Integer.parseInt(inputString);
                
                if (validInput >= 0 && validInput <= 24) {


                    System.out.println("\nМинималната височина " + validInput + " е записана.\n");
                    break;
                } 

                else {

                    System.out.println("\nГрешна височина.\n");
                } 
            }
            
            else {
                
                System.out.println("\nВъведете само цели числа.\n");
            }
        }
        
        return validInput;
    }
    
    protected static int validationMaxHeight() { 
        
        int validInput;
        
        while (true) {

            System.out.print("Въведете максималната височина: ");

            
            String inputString = input.next();
            
            if(inputString.matches("[0-9]*")) {
                
                validInput = Integer.parseInt(inputString);
                
                if (validInput >= 0 && validInput <= 24) {


                    System.out.println("\nМаксималната височина " + validInput + " е записана.\n");
                    break;
                } 

                else {

                    System.out.println("\nГрешна височина.\n");
                } 
            }
            
            else {
                
                System.out.println("\nВъведете само цели числа.\n");
            }
        }
        
        return validInput;
    }
}
