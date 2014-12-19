package laboratory_3;

public class Exercise_4 {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};
        
        int sum = 0;
        double result = 0;
        
        for(int elements:arr) {
        
            sum += Math.pow(elements, 2);
            
            result = Math.sqrt(sum);
        }
        System.out.println(result);
    }  
}
