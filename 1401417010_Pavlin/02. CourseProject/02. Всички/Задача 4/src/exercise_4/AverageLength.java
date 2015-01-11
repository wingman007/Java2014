package exercise_4;

public class AverageLength extends Exercise_4 {
    
    protected static void averageLength() {
        
        int maxLength = 0;
        
        for(String elements : arr) {
            
            if(maxLength < elements.length()) {
                
                maxLength = elements.length();
            }
        }
        
        int averageLength = maxLength / 2;
        
        for(String elements : arr) {
            
            if(elements.length() <= averageLength) {
                
                System.out.println(elements);
            }
        }
    }
}
