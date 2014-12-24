package exercise_1;

// подточка г)

public class ArithmeticMean extends Exercise_1 {

    public static void arithmeticMean() {
        
        int sum = 0;
        int number = 0;
        
        for(int i = 0; i < arr.length; i++) {
            
            if(arr[i] % 5 == 0) {
                sum += arr[i];
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
