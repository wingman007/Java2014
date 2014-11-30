package laboratory_2;

public class Exercise_12 {

    public static void main(String[] args) {
        int arr[] = {1, 5, 23, 21, 7, 34, 6};
        int i = 0;
        
        for(int elements:arr) {

            if(elements>30){
                break;
            }

            System.out.println("m[" + i + "] = " + elements);
            
            i++;
        }
    }
}
