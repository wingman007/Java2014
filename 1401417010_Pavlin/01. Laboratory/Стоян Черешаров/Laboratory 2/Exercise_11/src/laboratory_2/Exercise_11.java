package laboratory_2;

import java.util.Scanner;

public class Exercise_11 {

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

        m1(arr);
    }
    
    public static void m1(int arr[]) {
        
        System.out.println("Обхождане във възходящ ред");
        
        int var = 0;
        
        for(int elements:arr) {

            System.out.println("arr[" + var +"] - " + elements);
            var++;
        }
        
        System.out.println("Обхождане в низходящ ред");
        
        for(int i = arr.length - 1; i >= 0; i--) {
        
            System.out.println("arr[" + i +"] - " + arr[i]);
        }
    }   
}
