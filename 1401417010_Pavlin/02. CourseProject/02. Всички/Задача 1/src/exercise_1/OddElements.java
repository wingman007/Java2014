package exercise_1;

// подточка б)

public class OddElements extends Exercise_1 {

    protected static void oddElements() {
        
        int multiplied = 1;
        
        for(int elements : arr) {
            
            if(elements % 2 != 0 && elements != 0) {

                multiplied *= elements;
            }
        }
        System.out.print("\nПроизведението на ненулевите нечетни елементи: " + multiplied);
    }
}
