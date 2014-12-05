package factorial;

import java.text.NumberFormat;
import java.util.Locale;

public class Factorial {

    public static void main(String[] args) {
        
        for(int i = 0; i <=20 ; i++) {
            System.out.println(NumberFormat.getNumberInstance(Locale.US).format(factorialRecursion(i)) + " Recursion");
            System.out.println(NumberFormat.getNumberInstance(Locale.US).format(factorialRecursion(i)) + " Iterative \n");
        }
        
    }
    
    public static long factorialRecursion(int n) {
        
        // 0! = 1
        // 1! = 1
        if (n <= 1) {
            return 1;
        }
        
        else {
            return n*factorialRecursion(n-1);
        }
    
    }
    
    public static long factorialIterative(int n) {

        // 0! = 1 
        // 1! = 1
        long factorial = 1;
        
        for (int i = n; i > 1; i--) {
            
            factorial *= i;
        }

        return factorial;
    }
}
