package ex2;

import java.util.Arrays;

public class Ex2_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = Ex2_11.popIntArr(69, 10);
		System.out.println(Arrays.toString(arr));
		
		int sum = 0;
		for (int i = 0; i<arr.length; i++){
			
			if(arr[i]<0){
				sum += arr[i];
				continue;
			}
			System.out.printf("%-4d", arr[i]);
			
			
		}
		
		System.out.println("The sum of the negatives is " + sum);
	}

}
