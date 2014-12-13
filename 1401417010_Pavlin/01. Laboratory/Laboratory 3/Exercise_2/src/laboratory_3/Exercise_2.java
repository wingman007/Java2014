package laboratory_3;

public class Exercise_2 {

    public static void main(String[] args) {
        
        int arr[] = {1, 2, 3, 4, 5};
        
        int sum = 0, result = 0;
        
        for(int elements:arr) {
            
            sum += elements;
            result = sum / arr.length;
        }

        System.out.println(result);
    } 
}
