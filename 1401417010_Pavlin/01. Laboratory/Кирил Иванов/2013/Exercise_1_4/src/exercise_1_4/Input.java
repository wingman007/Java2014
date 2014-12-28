package exercise_1_4;

import java.util.Scanner;

public class Input {
        
    private static final Scanner input = new Scanner(System.in, "windows-1251");

    protected static String validationTitle() {
        
        String validInput;

        while (true) {

            System.out.print("Въведете името на филма: ");

            validInput = input.nextLine();
            
            if(validInput.matches("[А-Яа-яA-Za-z]*")) {
                
                System.out.println("\nФилмът " + validInput + " е записан.\n");
                break;
            }
            
            else {
                
                System.out.println("\nГрешно име.\n");
            }
        }
        
        return validInput;
    }
    
    protected static String validationTv() {
        
        String validInput;

        while (true) {

            System.out.print("Въведете името на програмата: ");

            validInput = input.nextLine();
            
            if(validInput.matches("[А-Яа-яA-Za-z]*")) {
                
                System.out.println("\nПрограмата " + validInput + " е записана.\n");
                break;
            }
            
            else {
                
                System.out.println("\nГрешно име.\n");
            }
        }
        
        return validInput;
    }
    
    protected static int validationStartHour() { 
        
        int validInput;

        while (true) {

            System.out.print("Въведете началният час (0-24): ");

            String inputString = input.next();
            
            if(inputString.matches("[0-9]*")) {
                
                validInput = Integer.parseInt(inputString);
                
                if (validInput >= 0 && validInput <= 24) {


                    System.out.println("\nНачалният час " + validInput + " е записан.\n");
                    break;
                } 

                else {

                    System.out.println("\nГрешен час.\n");
                } 
            }
            
            else {
                
                System.out.println("\nВъведете само числа.\n");
            }
        }
        
        return validInput;
    }
    
    protected static int validationEndHour() { 
        
        int validInput;

        while (true) {

            System.out.print("Въведете крайния час (0-24): ");

            String inputString = input.next();
            
            if(inputString.matches("[0-9]*")) {
                
                validInput = Integer.parseInt(inputString);
                
                if (validInput >= 0 && validInput <= 24) {


                    System.out.println("\nКрайният час " + validInput + " е записан.\n");
                    break;
                } 

                else {

                    System.out.println("\nГрешен час.\n");
                } 
            }
            
            else {
                
                System.out.println("\nВъведете само числа.\n");
            }
        }
        
        return validInput;
    }
}
