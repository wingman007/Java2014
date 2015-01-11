package exercise_4;

public class MaxLength extends Exercise_4 {
    
    protected static void maxLength() {
        
        int maxLength = 0;
        
        for(String elements : arr) {
            
            if(maxLength < elements.length()) {
                
                maxLength = elements.length();
            }
        }
        
        for(String elements : arr) {
            
            if(maxLength == elements.length()) {
                
                System.out.println(elements);
            }
        }
    }
}
