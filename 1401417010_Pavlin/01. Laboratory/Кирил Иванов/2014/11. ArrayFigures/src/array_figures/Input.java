package array_figures;

import java.util.Scanner;

public class Input {
        
    private static final Scanner input = new Scanner(System.in, "windows-1251");
    
    protected static int validationNumber() { 
        
        int validInput;

        while (true) {

            System.out.print("Въведете брой на фигури: ");

            String inputString = input.next();
            
            if(inputString.matches("[1-9]")) {
                
                validInput = Integer.parseInt(inputString);

                System.out.println("\nБроят " + validInput + " е валиден.\n");
                break;
            }
            
            else {
                
                System.out.println("\nВъведете само цели числа от 1 до 9.\n");
            }
        }
        
        return validInput;
    }
    
    protected static String validationName() {
        
        String validInput;

        while (true) {
            
            System.out.println("Всяка фигура може да бъде \"кръг\", \"правоъгълник\" или \"триъгълник\".");
            System.out.print("Въведете вида на фигурата: ");

            validInput = input.next();
            
            if(validInput.equals("кръг") || validInput.equals("правоъгълник") || validInput.equals("триъгълник")) {
                
                System.out.println("\nФигурата " + validInput + " е валидна.\n");
                break;
            }
            
            else {
                
                System.out.println("\nГрешно название.\n");
            }
        }
        
        return validInput;
    }
    
    protected static String validationDouble() { 
        
        String validInput;

        while (true) {
            
            System.out.print("Въведете размер: ");
            validInput = input.next();
            
            if(validInput.matches("[0-9.]*")) {

                System.out.println("\nРазмерът " + validInput + " е валиден.\n");
                break;
            }
            
            else {
                
                System.out.println("\nВъведете само числа.\n");
            }
        }
        
        return validInput;
    }
}
