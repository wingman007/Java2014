package laboratory_3;

public class Exercise_6 {

    public static void main(String[] args) {
        
        int arr[] = {-1, 23, -12, 4, -5, 16};
        
        int sum = 0;
        
        for(int elements:arr) {
            
            sum +=Math.abs(elements);
        }
        System.out.println(sum);
    }  
}
