package exercise_5;

public class Exercise_5 {

    public static void main(String[] args) {
        
        System.out.println(factorialRecursion(10));
        System.out.println(factorialCycle(10));
    }
    
    public static int factorialRecursion(int n) {
        
        if(n == 0) {
            return 1;
        }
        
        else {
            return n*factorialRecursion(n-1);
        }
    }
    
    public static int factorialCycle(int n) {

        int result = 1;
        
        // factorial 2! = 2*1
        for (int i = 2; i <= n; i++) {
            
            // n! = n*(n-1)
            result *= i;
        }

        return result;
    } 
}
