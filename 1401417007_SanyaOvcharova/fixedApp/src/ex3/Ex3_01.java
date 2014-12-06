package ex3;
import java.util.Scanner;
public class Ex3_01 {
	static Scanner listener = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myArgs = getTwoNumbers();
		System.out.println(max(myArgs));
		
		

	}
	
	public static int[] getTwoNumbers(){
		int[] arr = new int[2];
		System.out.println("Enter an integer: ");
		arr[0] = listener.nextInt();
		System.out.println("Enter another: ");
		arr[1] = listener.nextInt();
		return arr;
		
		
	}
	
	public static int max (int[] arr){
		
		int max = arr[0]>arr[1]?arr[0]:arr[1];
		
		return max;
		
		
	}
}
