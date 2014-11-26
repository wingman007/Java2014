package random;


public class UsingENUM {

	private String firstName = "";
	private String familyName = "";
	private int age = 0;
	private Gender gender;

	UsingENUM(String gender) {
		setGender(gender);
		System.out.println(gender);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsingENUM smth = new UsingENUM("female");
		System.out.println(smth.gender);
	}

	public void setGender(String gender) {

		switch (gender) {

		case "female":
			this.gender = Gender.FEMALE;
			break;
		case "male":
			this.gender = Gender.MALE;
			break;
		default:
			this.gender = Gender.NO_INFO;
		}
	}

}
