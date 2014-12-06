package ex2;
import java.util.Scanner;
public class Ex2_05 {
	
	static Scanner listener = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		max3();

		
	}

	public static void max3(){
		
		System.out.println("Please enter 3 numbers!");
		
		int a = listener.nextInt();
		int b = listener.nextInt();
		int c = listener.nextInt();
		
		int max = a > b? a: b > c? b : c; //first checks b>c
		
		System.out.println(max);
		
	}
}
