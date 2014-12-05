package laboratory_3;

public class Exercise_3 {

    public static void main(String[] args) {
        
        int arr[] = { -1, 3, -14, 4, 7, 12, -34};
        
        int sum = 0;
        
        for(int elements:arr) {
            
            if(elements>0){
            
                sum += elements;   
            }   
        }
        System.out.println(sum);
    }
}
