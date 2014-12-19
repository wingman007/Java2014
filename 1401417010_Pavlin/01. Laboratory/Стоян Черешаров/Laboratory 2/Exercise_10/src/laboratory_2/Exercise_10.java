package laboratory_2;

public class Exercise_10 {

    public static void main(String[] args) {
        
        /*
        int arr[] = new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        */
        
        int arr[] = {1, 2, 3, 4, 5};
        
        System.out.println("Итератор върху масив (foreach)");
        
        for(int elements : arr){
            
            System.out.println(elements);
        }
        
        System.out.println("for цикъл");
        
        for(int i = 0; i < arr.length; i++) {
        
            System.out.println(arr[i]);
        }
    }
}
