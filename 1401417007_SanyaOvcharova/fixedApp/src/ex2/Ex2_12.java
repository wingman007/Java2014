package ex2;

import java.util.Arrays;

public class Ex2_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = Ex2_11.popIntArr(69, 10);
		System.out.println(Arrays.toString(arr));
		
		printIfGreater(30, arr);

	}

	public static void printIfGreater(int greaterThan, int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]<greaterThan){
				continue;
			}
			/*
			sysout here
			if(arr[i]<30){
				break;
			}
			 */
			System.out.printf("%-4d", arr[i]);

		}

	}

}
