package exercise_4;

public class Contains extends Exercise_4 {
    
    protected static void contains() {
        
        for(String elements : arr) {
            
            if(elements.contains("град") || elements.contains("Град")) {
                
                System.out.println(elements);
            }
        }
    }
}
