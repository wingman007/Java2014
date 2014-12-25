package exercise_4;

public class RepeatO extends Exercise_4 {
    
    protected static void repeatO() {
                
        boolean found = false;
        
        for(String elements : arr) {
            
            if(elements == null) {
                
                break;
            }
            
            int count = 0;
            
            for(int i = 0; i < elements.length(); i++) {
            
                char index = elements.charAt(i);

                if(index == 'о' || index == 'О') {
                    
                    count++;
                }
            }
            
            if(count > 3) {
                
                found = true;
                System.out.println(elements);
            }
        }
        
        if(found == false) {
            
            System.out.println("\nНяма намерени елементи.\n");
        }
    }
}
