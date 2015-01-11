package laboratory_4;

public class Exercise_5 {

    public static void main(String[] args) {
        
        System.out.println(factorialRecursion(10));
        System.out.println(factorialCycle(10));
    }
    
    public static int factorialRecursion(int n) {
        
        // 0! = 1 
        // 1! = 1
        if(n <= 1) {
            return 1;
        }
        
        // n! = n*(n-1)!
        else {
            return n*factorialRecursion(n-1);
        }
    }
    
    public static int factorialCycle(int n) {
        
        // 0! = 1 
        // 1! = 1
        int factorial = 1;
        
        // n! = (n-1)! * n
        for (int i = n; i > 1; i--) {
            
            factorial *= i;
        }
        return factorial;
    } 
}
