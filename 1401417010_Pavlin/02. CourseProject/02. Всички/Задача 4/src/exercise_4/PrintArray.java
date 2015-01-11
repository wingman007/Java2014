package exercise_4;

public class PrintArray extends Exercise_4 {
    
    protected static void printArray() {
        
        if(arr[0] == null) {
            
            System.out.println("\nМасивът е празен.\n");   
        }
        
        else {
            System.out.println("\nВъведените стойности в масива са:");

            for (String elements : arr) {

                if (elements == null) {
                    break;
                }

                System.out.println("|" + elements + "|");
            }
        }
    }
}