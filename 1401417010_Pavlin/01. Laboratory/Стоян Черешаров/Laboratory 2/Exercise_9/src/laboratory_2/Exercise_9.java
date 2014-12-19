package laboratory_2;

import java.util.Scanner;

public class Exercise_9 {


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Въведи число от 1 до 12: ");
        
        int inputNumber = input.nextInt();
        String month;
        
        switch(inputNumber) {
        
            case 1 : month = "Януари";
            break;
            case 2 : month = "Февруари";
            break;
            case 3 : month = "Март";
            break;
            case 4 : month = "Април";
            break;
            case 5 : month = "Май";
            break;
            case 6 : month = "Юни";
            break;
            case 7 : month = "Юли";
            break;
            case 8 : month = "Август";
            break;
            case 9 : month = "Септември";
            break;
            case 10 : month = "Октомври";
            break;
            case 11 : month = "Ноемеври";
            break;    
            case 12 : month = "Декември";
            break;
            default : month = "Няма такъв месец";
            break;
        }
        System.out.println(month);
    } 
}
