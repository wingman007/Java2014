package exercise_11;

public class Exercise_11 {

    public static void main(String[] args) {
        
        for (int i = 0; i <= 20; i++) {
            System.out.println("Number: " + i + " -- " + "Fibonacci: " + fibonacci(i));
        }
        
    }
    
    public static int fibonacci(int n) {
        
        if(n == 0) {
            return 0;
        }
        
        else if(n == 1 || n == 2) { 
            return 1;
        }
        
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
