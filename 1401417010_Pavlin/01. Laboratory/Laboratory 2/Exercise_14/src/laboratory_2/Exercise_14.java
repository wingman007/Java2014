package laboratory_2;

public class Exercise_14 {

    public static void main(String[] args) {
        
        int arr[] = {1, -5, -4, 20, 0, 5, -4, 7};
        int sum = 0;
        
        for(int elements:arr) {
            
            if(elements > 0) {
                System.out.println(elements);
            }
            
            else {
                sum += elements;
            }
        }
        
        System.out.println("Сумата на отрицателните числа е: " + sum);
    }
}
