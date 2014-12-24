package exercise_4;

public class RegEx extends Exercise_4 {
    
    protected static void regEx() {
        
        for(String elements : arr) {
            
            if (elements.matches("^([^реЕ]*[еЕ][^реЕ]*){2,4}$")) {

                System.out.println(elements);
            }
        }
    }
}
