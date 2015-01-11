package laboratory_3;

public class Exercise_8 {

    public static void main(String[] args) {
        
        int arr[] = {32, 234, 543, 2, 34, 5};
        
        int min = arr[0];
        
        for(int elements:arr) {
        
            if(min > elements) {
                
                min = elements; 
            } 
        }
        System.out.println(min);
    }
}
