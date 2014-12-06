package ex2;

public class Ex2_06 {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter two numbers: ");
		int a = Ex2_05.listener.nextInt();
		int b = Ex2_05.listener.nextInt();
		allIntsBetween(a,b);

	}
	
	public static void allIntsBetween(int a, int b){
		int max = Ex2_04.max(a, b);
		int min = a<b?a:b; 
		for  (int i = min; i<=max; i++){ 
			System.out.println(i);
		}
		
	}

}
