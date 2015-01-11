package exercise_1;

// подточка г)

public class ArithmeticMean extends Exercise_1 {

    protected static void arithmeticMean() {
        
        int sum = 0;
        int number = 0;
        
        for(int elements : arr) {
            
            if(elements % 5 == 0) {
                
                sum += elements;
                number++;
            }
        }
        
        if(number == 0) {
            
            System.out.print("\nНяма такива елементи.");
        }
        
        else {
            System.out.print("\nСредно аритметично на елементите, които се делят на 5 без остатък е: " + (sum/number));
        }
    }
}
