package exercise_1_3;

import java.util.Scanner;

public class Input {

    protected static int validation() {
        
        int validInput;
        
        Scanner input = new Scanner(System.in, "windows-1251");

        while (true) {

            System.out.print("Въведете номерата на второто домино: ");

            String inputString = input.next();
            
            if(inputString.matches("[0-9]*")) {
                
                validInput = Integer.parseInt(inputString);
                
                if (validInput > 0 && validInput <= 6) {


                    System.out.println("\nНомерът " + validInput + " е записан.\n");
                    break;
                } 

                else {

                    System.out.println("\nГрешен номер.\n");
                } 
            }
            
            else {
                
                System.out.println("\nВъведете само числа.\n");
            }
        }
        
        return validInput;
    }
}
