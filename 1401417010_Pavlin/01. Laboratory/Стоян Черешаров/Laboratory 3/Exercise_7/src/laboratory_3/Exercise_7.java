package laboratory_3;

public class Exercise_7 {


    public static void main(String[] args) {
        
        int arr[] = {1, 21, 95, 23, 2, 75};
        
        int max = arr[0]; // or just 0;
        
        for(int elements:arr){
            
            if(max < elements) {
                
                max = elements;
            }
        }
        System.out.println(max);
    } 
}
