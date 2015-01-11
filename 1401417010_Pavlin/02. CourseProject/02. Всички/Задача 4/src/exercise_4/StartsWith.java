package exercise_4;

public class StartsWith extends Exercise_4 {
    
    protected static void startsWith() {
        
        boolean found = false;
        
        for(String elements : arr) {
            
            if(elements.startsWith("Долен")) {
                
                found = true;
                System.out.println(elements);
            }
        }
        
        if(found == false) {
            
            System.out.println("\nНяма намерени елементи.\n");
        }
    }
}
