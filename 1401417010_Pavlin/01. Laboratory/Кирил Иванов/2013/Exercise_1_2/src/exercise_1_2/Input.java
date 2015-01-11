package exercise_1_2;

import java.util.Scanner;

public class Input {
    
    protected static String validation() {
        
        String validInput;
        
        Scanner input = new Scanner(System.in, "windows-1251");
        
        while (true) {
            
            System.out.print("\nВъведете позицията на черния кон: ");

            validInput = input.next();

            if(validInput.length() == 2 && validInput.substring(0, 1).matches("[a-h]") && validInput.substring(1, 2).matches("[1-8]") ) {

                System.out.println("\nПозицията " + validInput + " е валидна.\n");
                break;
            }

            else {

                System.out.println("\nГрешна позиция.");
            }
        }
        
        return validInput;
    }
}