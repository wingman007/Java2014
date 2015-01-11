package exercise_1_6;

import java.util.Scanner;

public class Input {

    protected static int validationInt() { 
        
        int validInput;
        
        Scanner input = new Scanner(System.in, "windows-1251");
        
        while (true) {

            System.out.print("Въведете размерът: ");

            String inputString = input.next();
            
            if(inputString.matches("[0-9]*")) {
                
                validInput = Integer.parseInt(inputString);

                System.out.println("\nРазмерът " + validInput + " е записан.\n");
                break;
            }
            
            else {
                
                System.out.println("\nВъведете само цели числа.\n");
            }
        }
        
        return validInput;
    }
}
