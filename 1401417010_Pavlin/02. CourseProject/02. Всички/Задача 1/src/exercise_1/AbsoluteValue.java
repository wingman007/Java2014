package exercise_1;

// подточка а)

public class AbsoluteValue extends Exercise_1 {
    
    protected static void absoluteValue() {
        
        int sum = 0;
        
        for(int elements : arr) {
            
            if(Math.abs(elements) > 30) {

                sum += elements;
            }
        }
        System.out.print("\nСумата на тези елементи, чиято абсолютна стойност надхвърля 30 е: " + sum);
    }
}
