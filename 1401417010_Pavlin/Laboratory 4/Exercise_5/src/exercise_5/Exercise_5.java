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
            
            return factorialRecursion(n-1)*n;
            
        }
    }
    
    public static int factorialCycle(int n) {

        int result = 1;

        for (int i = 2; i <= n; i++) {
            
            result *= i;

        }

        return result;

    } 
}
