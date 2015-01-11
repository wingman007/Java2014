package trapezium_circle;

import java.util.Scanner;

public class Input {
        
    private static final Scanner input = new Scanner(System.in, "windows-1251");
    
    protected static int validationChoice() { 
        
        int validInput;

        while (true) {

            System.out.print("Въведете 1 за правоъгълен трапец или 2 за кръг: ");

            String inputString = input.next();
            
            if(inputString.matches("[1-2]")) {
                
                validInput = Integer.parseInt(inputString);

                System.out.println("\nИзборът " + validInput + " е валиден.\n");
                break;
            }
            
            else {
                
                System.out.println("\nВъведете само 1 или 2.\n");
            }
        }
        
        return validInput;
    }
    
    protected static double validationDouble() { 
        
        double validInput;

        while (true) {

            String inputString = input.next();
            
            if(inputString.matches("[0-9.]*")) {
                
                validInput = Double.parseDouble(inputString);

                System.out.println("\nЧислото " + validInput + " е валидно.\n");
                break;
            }
            
            else {
                
                System.out.print("\nГрешно число. Въведете отново: ");
            }
        }
        
        return validInput;
    }
}
