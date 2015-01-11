package batches;

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
    
    protected static int validationQuantity() { 
        
        int validInput;

        while (true) {

            System.out.print("Въведете количество на плодовете (кг.): ");

            String inputString = input.next();
            
            if(inputString.matches("[0-9]*")) {
                
                validInput = Integer.parseInt(inputString);

                System.out.println("\nКоличество " + validInput + " е записано.\n");
                break;
            }
            
            else {
                
                System.out.println("\nВъведете само цели числа.\n");
            }
        }
        
        return validInput;
    }
    
    protected static double validationPricePerKg() { 
        
        double validInput;

        while (true) {

            System.out.print("Въведете цената за килограм: ");

            String inputString = input.next();
            
            if(inputString.matches("[0-9]*")) {
                
                validInput = Double.parseDouble(inputString);

                System.out.println("\nЦената за килограм " + validInput + " е записана.\n");
                break;
            }
            
            else {
                
                System.out.println("\nВъведете само цели числа.\n");
            }
        }
        
        return validInput;
    }
}
