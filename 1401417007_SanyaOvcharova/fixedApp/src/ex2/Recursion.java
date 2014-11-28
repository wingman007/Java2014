package ex2;
//import javaSpace.*;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// factoial

		/*
		 * n = (n-1)! * n 0! = 1 1! = 1
		 */
		// fibonachi n = (n-2) + (n-1)

		 //primes();
		//primes();
		/*for (int i = 0; i < 30; i++) {
			if (isPrime(i)) System.out.println(i);
		}*/
		//System.out.println(fact(5));
		for(int i = 1; i<=10; i++){
			System.out.println(fibRec(i));
		}
	}
	/**
	 * Fibonacci with recursion
	 * 
	 * @param n
	 * @return
	 */
	
	public static int fibRec(int n){
		
		if(n <= 2){
			return 1;
		}
		
		n = fibRec(n-2) + fibRec(n-1);
		
		return n;
		
	}

	/**
	 * Calculate factorial of [0 - 10]
	 */

	public static void factorial() {

		for (int j = 0; j < 20; j++) {
			int result = 1;

			for (int i = 1; i <= j; i++) {
				result *= i;
			}

			System.out.println("The factorial of " + j + " is " + result);
		}

	}
	
	/**
	 * Recursive factorial! Mucho importando ^_^
	 * 
	 * @param FactOf
	 * @return
	 */

	public static int fact(int FactOf) {
		//Stack  overflow is possible if not done correctly
		if(FactOf <= 1){
			return 1;
		}
		int factFactOf = fact(FactOf-1)*FactOf;
		return factFactOf;
		

	}
	
	

	public static void fibonacci() {
		int x = 0, y = 1, z = 1;
		System.out.println(y);
		for (int i = 0; i < 10; i++) {

			System.out.println(z);
			x = y;
			y = z;
			z = x + y;
		}

	}

	public static void primes() {
		for (int j = 1; j < 30; j++) {
			int prime = j;
			
			for (int i = 2; i < j; i++) {
				if (j % i == 0) {
					prime = 0;
					break;
				} else {

				

				}
			}
			if (prime != 0) {
				System.out.println(prime);
			}
		}
	}
	
	public static boolean isPrime(int num)
	{
		boolean flag = true;
		for(int i = 2; i < num; i++ )
		{
			if (num % i == 0) { 
				flag = false;
				break;
			}
		}
		return flag;
	}

}
