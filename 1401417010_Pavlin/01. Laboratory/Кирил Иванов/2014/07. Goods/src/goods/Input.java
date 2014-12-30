package goods;

import java.util.Scanner;

public class Input {
        
    private static final Scanner input = new Scanner(System.in, "windows-1251");
    
    protected static int validationChoice() { 
        
        int validInput;

        while (true) {

            System.out.print("Въведете 1 за стоп и 2 за телевизор: ");

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
    
    protected static String validationModel() {
        
        String validInput;

        while (true) {

            System.out.print("Въведете название на модела: ");

            validInput = input.next();
            
            if(validInput.matches("[А-Яа-яA-Za-z]*")) {
                
                System.out.println("\nМоделът " + validInput + " е записан.\n");
                break;
            }
            
            else {
                
                System.out.println("\nГрешно название.\n");
            }
        }
        
        return validInput;
    }
    
    protected static int validationPrice() { 
        
        int validInput;

        while (true) {

            System.out.print("Въведете цена на стоката: ");

            String inputString = input.next();
            
            if(inputString.matches("[0-9]*")) {
                
                validInput = Integer.parseInt(inputString);

                System.out.println("\nЦената " + validInput + " е записана.\n");
                break;
            }
            
            else {
                
                System.out.println("\nВъведете само цели числа.\n");
            }
        }
        
        return validInput;
    }
    
    protected static int validationScreenSize() { 
        
        int validInput;

        while (true) {

            System.out.print("Въведете размер на екрана: ");

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
    
    protected static int validationDesiredNumber() { 
        
        int validInput;

        while (true) {

            System.out.print("Въведете желан брой стоки еднакви с въведената: ");

            String inputString = input.next();
            
            if(inputString.matches("[0-9]*")) {
                
                validInput = Integer.parseInt(inputString);

                System.out.println("\nБроят " + validInput + " е записан.\n");
                break;
            }
            
            else {
                
                System.out.println("\nВъведете само цели числа.\n");
            }
        }
        
        return validInput;
    }
}
