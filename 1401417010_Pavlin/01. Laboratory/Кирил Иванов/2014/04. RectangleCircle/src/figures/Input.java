package figures;

import java.util.Scanner;

public class Input {
        
    private static final Scanner input = new Scanner(System.in, "windows-1251");

    protected static double validationNumber() { 
        
        double validInput;

        while (true) {

            System.out.print("Въведете радиуса на кръга: ");

            String inputString = input.next();
            
            if(inputString.matches("[0-9.]*")) {
                
                validInput = Double.parseDouble(inputString);

                System.out.println("\nРадиусът " + validInput + " е записан.\n");
                break;
            }
            
            else {
                
                System.out.println("\nВъведете само числа.\n");
            }
        }
        
        return validInput;
    }
}
