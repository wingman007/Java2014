package laboratory_3;

import java.util.Scanner;

public class Exercise_10 {
    
    public static void main(String[] args) {
        
        int decimal, partition, remainder;
        
        String binary = "";
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Въведи позитивно десетично число: ");
        
        decimal = input.nextInt();
        
        do {
            
            partition = decimal / 2;
            
            remainder = decimal % 2;
            
            decimal = partition;
            
            binary = remainder + binary;
        }

        while (decimal != 0);
        
        System.out.println("Конвертирано в двоично число е: " + binary);
    }
}