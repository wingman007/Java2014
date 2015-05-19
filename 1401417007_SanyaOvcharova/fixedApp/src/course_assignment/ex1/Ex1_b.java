
package course_assignment.ex1;

import java.util.Random;

/**
 *
 * @author SanyaNo
 */
public class Ex1_b {
    
    /*
     * Да се генерира по случаен начин едномерен 
     * масив от цели числа принадлежащи на интервала 
     * [–100,100]. Да се намери произведението на ненулевите нечетни елементи.
     */
    
    
    /**
     * 
     * @param module
     * @param numElements
     * @return 
     */
    
    public static int[] randArr(int module, int numElements){
        Random rand = new Random();
        int[] arr = new int[numElements];
        for(int i = 0; i<arr.length; i++){
            
            arr[i] = (rand.nextInt()%module + 1);
            
        }
        
        return arr;
        
    }
    
    /**
     * The product of the odd array values
     *  
     * @param arr
     * @return 
     */
    
    public static int mulPosOdd(int[] arr){
        int sum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2 !=0 && arr[i] != 0){
                System.out.println(arr[i]);
                sum *= arr[i];
            }
        }
        return sum;
     
    }

}
