package laboratory_3;

public class Exercise_9 {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //25
        
        int sum = 0;
        
        int i = 0;
        
        for(int elements: arr) {
            
            if( i%2 == 0) {
                sum +=elements;
            }
            
            i++;   
        } 
        System.out.println(sum);
    }
}
