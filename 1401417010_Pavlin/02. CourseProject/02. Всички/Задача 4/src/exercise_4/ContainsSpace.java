package exercise_4;

public class ContainsSpace extends Exercise_4 {
    
    protected static void containsSpace() {
        
        for(String elements : arr) {
            
            if(elements.contains(" ")) {
                
                System.out.println(elements);
            }
        }
    }
}
