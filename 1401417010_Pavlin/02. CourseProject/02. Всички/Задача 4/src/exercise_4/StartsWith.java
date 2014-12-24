package exercise_4;

public class StartsWith extends Exercise_4 {
    
    protected static void startsWith() {
        
        for(String elements : arr) {
            
            if(elements.startsWith("Долен")) {
                
                System.out.println(elements);
            }
        }
    }
}
