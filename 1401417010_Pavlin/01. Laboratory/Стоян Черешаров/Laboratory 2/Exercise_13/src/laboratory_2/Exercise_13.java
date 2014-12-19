package laboratory_2;

import java.util.Scanner;

public class Exercise_13 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Въведете броя на елементите на масива: ");
        
        int a = input.nextInt();
        
        int arr[] = new int[a];
        
        int val = 0;
        
        do {
            System.out.print("Въведете елементите на масива: ");
            arr[val] = input.nextInt();
            val++;
        }
        
        while(val < a);
        
        m(arr);
    }
    
    public static void m(int arr[]) {

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] > 30) {
                System.out.println("Индекса на първия срещнат елемент със стойност над 30 е " + "\"" + i + "\"");
                System.exit(0);
            }
        }
        System.out.println("Няма елемент със стойност > 30");
    }
}
