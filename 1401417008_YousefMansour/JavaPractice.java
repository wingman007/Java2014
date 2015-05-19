package javapractice;
import java.util.*;

public class JavaPractice {
    static int choice;
    static List result = new ArrayList();
    static int[] arr = {
        10,20,30,-40,-10
    };
    
    public static void main(String[] args) {
        /*
        int[] arr = new int[5];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            System.out.println("Input int:");
            arr[i] = input.nextInt();
        } */
        System.out.println(fact(5));
    }
    
    public static void zad15(){
        for(int i = 1; i < 6; i++){
            for(int j = i; j > 0; j--){
                System.out.print("A");
            }
            System.out.println("");
        }
    }
    
    public static void zad14(int[] arr){
        int suma = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                System.out.println(arr[i]);
            } else if(arr[i] < 0){
                suma += arr[i];
            }
        }
        System.out.println("Suma: " + suma);
    }
    
    public static int zad13(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 30){
                return arr[i];
            }
        }
        return 0;
    }
    
    public static void zad12(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i]>30){
                break;
            }
            System.out.println(arr[i]);
        }
    }
    
    public static void zad11_b(int[] arr) {
        for(int i = arr.length-1; i >= 0; i--){
            System.out.println(arr[i]);
        }
    }

    public static void zad11_a(int[] arr) {
        for(int number: arr){
            System.out.println(number);
        }
    }
    
    public static void zad10() {
       double[] arr = new double[5];
       arr[0] = 0.2;
       arr[1] = 0.1;
       arr[2] = 0.4;
       arr[3] = 0.6;
       arr[4] = 0.314;
       
       for(int i = 0; i < arr.length; i++){
           System.out.println(arr[i]);
       }
    }
    
    public static void zad9() {
        String[] months = {
            "January",
            "February",
            "March",
            "April",
            "May",
            "June",
            "July",
            "August",
            "September",
            "October",
            "November",
            "December"
        };
        Scanner input = new Scanner(System.in);
        System.out.println("Input month:");
        int month = input.nextInt();
        System.out.println(months[month-1]);   
    }
    
    public static void zad7_zad8() {
        Scanner scan = new Scanner(System.in);
        String[] options = {
            "1. Теглене на сума.",
            "2. Промяна на PIN.",
            "3. Проверка на наличност.",
            "4. Настройки.",
            "5. Изход."
        };
        do {
            System.out.println("Изберете опция:");
            for(String option : options){
                System.out.println(option);
            }
            choice = scan.nextInt()-1;

            System.out.print("Вие избрахте ");
            System.out.println(options[choice].substring(options[choice].indexOf(".")+2 ,options[choice].length()));
        } while (choice != 4);
    }

    public static void zad6() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert min:");
        int min = scan.nextInt();
        System.out.println("Insert max:");
        int max = scan.nextInt();
        for (int i = min; i <= max; i++) {
            System.out.println(i);
        }
    }

    public static int zad5(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Type 3 numbers:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        int i = a > b ? a : b;
     
        i = i > c ? i : c;
        return i;
    }
    
    public static int zad4(int a, int b){
        int i = a > b ? a : b;
        return i;
    }
    
    public static void zad3(){
        for(int i = 0; i < 5; i++){
            System.out.print("а");
        }
        System.out.println("");
        for(int i = 0; i < 10; i++){
            System.out.print("б");
        }
    }
    
    public static void zad2(){
        for(int i = 20; i > 0; i--){
            System.out.println(i);
        }
    }
    
    public static void zad1(){
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }
    }
    
    public static void prostiChisla(int min, int max){
        if(min < 2){
            min = 2;
        }
        outerLoop:
        for(int i = min; i <= max; i++){
            for(int j = i-1; j > 1; j--){
                if(((i % j) == 0)){
                    continue outerLoop;                    
                }  
            }
            result.add(i);
        }
        for(int k = 0; k < result.size(); k++){
            System.out.println(result.get(k));
        }
    }
    
    public static void fibonacci(int count) {
        int a = 0;
        int b = 1;
        int c = a;
      
        for (int i = 0; i < count; i++) {         
            b = b + c;
            c = a;
            a = b;
            System.out.println(a);
        }
    }
    
    public static void factorial(int a) {
        int result = a;
        for (int i = a - 1; i > 0; i--) {
            result *= i;
        }
        if (a == 0) {
            result = 1;
        }
        System.out.println(result);
    }
    
    public static int fact(int n){
        if(n <= 1){
            return 1;
        }
        return fact(n-1) * n;      
    }
    
  
  
    
    
    public static void opr(int... elements){
        for(int number: elements){
            System.out.println(number);
        }
    }
}
