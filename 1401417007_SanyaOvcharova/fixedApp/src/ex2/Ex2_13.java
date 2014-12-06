package ex2;

import java.util.Arrays;

public class Ex2_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = Ex2_11.popIntArr(69, 10);
		System.out.println(Arrays.toString(arr));
		stopIfGreater(30, arr);
		
	}
	
	//TODO Console-generated array
	
	public static void stopIfGreater(int greaterThan, int[] arr){
		
		for(int i = 0; i<arr.length; i++){
			if(arr[i]>30){
			System.out.printf("the index is %d", i);
			break;
			}
		}
		
	}

}
