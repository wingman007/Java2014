package laboratory_2;

import java.util.Scanner;

public class Exercise_7 {

    public static void main(String[] args) {
        
        System.out.println("1. Теглене на сума;");
        System.out.println("2. Промяна на PIN;");
        System.out.println("3. Проверка на наличност;");
        System.out.println("4. Настройки;");
        System.out.println("5. Изход.");
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Въведете число от 1 до 5: ");
        int inputNumber = input.nextInt();
        
        String choice;
        
        switch(inputNumber) {
            
            case 1: choice = "Избрахте - 1. Теглене на сума;";
            break;
            case 2: choice = "Избрахте - 2. Промяна на PIN;";
            break; 
            case 3: choice = "Избрахте - 3. Проверка на наличност;";
            break;          
            case 4: choice = "Избрахте - 4. Настройки;";
            break;           
            case 5: choice = "Избрахте - 5. Изход.";
            break;
            default: choice = "Само от 1 до 5!";
            break; 
        }
        
        System.out.println(choice);
    }  
}
