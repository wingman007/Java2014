package exercise_4;

public class AlphabeticSort extends Exercise_4 {
    
    protected static void alphabeticSort() {
        
        java.util.Arrays.sort(arr);
        
        for(String elements : arr) {
   
            System.out.println(elements);
        }
    }
}
