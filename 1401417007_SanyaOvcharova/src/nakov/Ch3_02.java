package nakov;



public class Ch3_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		int a = 35; //Random.nextInt();
		System.out.println(a%5);
		System.out.println(a%7);
		
		if(a%5 == 0 && a%7==0){
			
			System.out.println("Success");
		}else{
			System.out.println("Not so much");
		}

	}

}
