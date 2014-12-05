package laboratory_3;

public class Exercise_11 {

    public static void main(String[] args) {
        
        for (int i = 0; i <= 20; i++) {
            System.out.println("Number: " + i + " -- " + "Fibonacci: " + fibonacci(i));
        }  
    }
    
    public static int fibonacci(int n) {
        
        // Fibonacci 0      = 0
        // Fibonacci 1      = 1
        // Fibonacci n > 1  = F(n - 1) + F(n - 2)
        
        if(n < 2) {
            return n;
        }
        
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
