package exercise_1_1;

import java.util.Scanner;

public class InputValidation {
    
    private static String figurePosition;
    
    private static final Scanner input = new Scanner(System.in, "windows-1251");
    
    protected static String inputValidation() {
            
        System.out.print("\nВъведете позицията на черния офицер: ");
        
        String validInput = input.next();

        if(validInput.length() == 2 && validInput.substring(0, 1).matches("[a-h]") && validInput.substring(1, 2).matches("[1-8]") ) {
            
            figurePosition = validInput;
            
            System.out.println("Позицията " + figurePosition + " е валидна.\n");   
        }

        else {
            
            System.out.println("Грешна позиция.");
            inputValidation();
        }
        
        return figurePosition;
    }
}
