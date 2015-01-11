package exercise_1_7;

import java.util.Scanner;

public class Input {
        
    private static final Scanner input = new Scanner(System.in, "windows-1251");

    protected static String validationName() {
        
        String validInput;

        while (true) {

            System.out.print("Въведете название на плодовете: ");

            validInput = input.next();
            
            if(validInput.matches("[А-Яа-яA-Za-z]*")) {
                
                System.out.println("\nНазванието " + validInput + " е записано.\n");
                break;
            }
            
            else {
                
                System.out.println("\nГрешно название.\n");
            }
        }
        
        return validInput;
    }
    
    protected static int validationWeight() { 
        
        int validInput;

        while (true) {

            System.out.print("Въведете теглото им (в грамове): ");

            String inputString = input.next();
            
            if(inputString.matches("[0-9]*")) {
                
                validInput = Integer.parseInt(inputString);

                System.out.println("\nТеглото " + validInput + " е записано.\n");
                break;

            }
            
            else {
                
                System.out.println("\nВъведете само цели числа.\n");
            }
        }
        
        return validInput;
    }
    
    protected static int validationVolume100g() { 
        
        int validInput;

        while (true) {

            System.out.print("Въведете обема на сока, получен от 100 грама плод: ");

            String inputString = input.next();
            
            if(inputString.matches("[0-9]*")) {
                
                validInput = Integer.parseInt(inputString);

                System.out.println("\nОбемът " + validInput + " е записан.\n");
                break;

            }
            
            else {
                
                System.out.println("\nВъведете само цели числа.\n");
            }
        }
        
        return validInput;
    }
}
