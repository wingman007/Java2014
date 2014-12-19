package encapsulation;

public class Fibonacci_Sequence {

    public int getSequence(int i) {
        return fibonacci(i);
    }
    
    private static int fibonacci(int n) {
        
        if(n < 2) {
            return n;
        }
        
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
