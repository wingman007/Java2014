package nakov;

public class Ch3_03 {
	
	/**
	 * Check whether the third digit of a number is 7
	 * @param 
	 */
	
	public static void main(String[] args) {
		int a = 347456;
		String j = String.valueOf(a);
		String check = "";
		check +=a;
		System.out.println(check.substring(2,3));//min, max-1
		boolean abs = check.substring(2,3).equals("7");
		System.out.println(abs);
		int b = Character.digit(j.charAt(2),10); //10 is the radix(the base of the number system)
		System.out.println(b);
		
	}

}
