package laboratory_3;

public class Exercise_5 {

    public static void main(String[] args) {
        
        int arr[] = {1, 2, 3, 4, 5};
        
        double sum = 0;
        
        for(int elements:arr) {
            
            if(elements>3) {
                
                sum += Math.pow(elements, 2);
            }
        }
        
        System.out.println(sum);   
    }  
}
