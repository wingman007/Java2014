package exercise_4;

public class EndsWith extends Exercise_4 {
    
    protected static void endsWith() {
        
        for(String elements : arr) {
            
            if(elements.endsWith("ово")) {
                
                System.out.println(elements);
            }
        }
    }
}
