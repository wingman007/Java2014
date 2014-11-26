package fibonacci_sequence;

public class Fibonacci_Sequence {

    public static void main(String[] args) {
        
        for(int i = 0; i <=20; i++) {
            System.out.println("Fibonacci " + i + " = " + fibonacciRecursion(i) + "(Recursion)");
            System.out.println("Fibonacci " + i + " = " + fibonacciIterative(i) + "(Iterative) \n");
        }
    }
    
    public static int fibonacciRecursion(int n) {
        
        // Fibonacci 0      = 0
        // Fibonacci 1      = 1
        // Fibonacci n > 1  = F(n - 1) + F(n - 2)
        if(n < 2) {
            return n;
        }
        
        else {
            return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
        }
    }
    
    public static int fibonacciIterative(int n) {
        
        int par1=0, par2=1, par3;
        
        for(int i=0; i < n; i++) {
            
            par3 = par1;
            par1 = par2;
            par2 += par3;
        }
        return par1;
    }
}
