package random;


import java.util.Scanner;

public class Names {
	
	private String firstName;
	private String familyName;
	
	private static String[] nameRegister;

	static Scanner names = new Scanner(System.in);

	public static void main(String[] args) {
		Names name = new Names("John", "Charls");
		String john = "john";
		String check = name.nameFormat(john);
		System.out.println(check);
		

	}

	public Names(String firstName, String familyName) {
		
		
		//conduct operations for name set
		
		
		

	}

	public void setFirstName(String firstName) {
		
		

		//evaluate the name
		//output success message 
		//set object variable 

	}
	public void setFamilyName(String familyName) {
		
		boolean eval = nameEval(familyName);
		if(eval){
			
			this.familyName = familyName;
			
		}
		

		//evaluate the name
		//output success message 
		//set object variable 

	}



	public boolean nameEval(String name) {

		boolean eval = true;

		if (name.length() > 20 || name.length() < 2) {
			System.out
					.println("Invalid name. The name you have chosen is either too long or too short!");
			eval = false;

		}else{
			System.out.println("Successful entry!");
		}
		return eval;

	}
	
	public String nameFormat(String name){
		String formatedName = name.toLowerCase();
		formatedName =  Character.toUpperCase(formatedName.charAt(0)) + formatedName.substring(1);
		return formatedName;
	}

}
