
package ex4;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author SanyaNo
 */
public class Ex4_07_Updated {
    public static void main(String[] args) {
        
        for(int i = 0; i<3; i++){
            int[] arr = randArr(100, 20);
            double sum = sqrtArr(arr);
            System.out.printf("The quadratic average of the names in the array\n" +Arrays.toString(arr) +"\nis %.4f \n", sum);
            
        }
        
    }
    
    public static int[] randArr(int module, int arrNumber) {

		// random numbers [-mudule, module]

		Random rand = new Random();
		int[] randArr = new int[arrNumber];
		for (int i = 0; i < randArr.length; i++) {

			randArr[i] = (rand.nextInt() % module + 1);
		}
		return randArr;

	}

	public static double sqrtArr(int[] arr) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= -20 && arr[i] <= 20) {
				sum += Math.pow((double) arr[i], 2);
			}
		}
                sum = Math.sqrt(sum/(double)arr.length);
		return sum;

	}

}
