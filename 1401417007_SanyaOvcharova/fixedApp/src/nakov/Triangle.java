package nakov;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		paintTriangle();

	}

	public static void paintTriangle() {

		for (int i = 0; i < 10; i++) {

			for (int k = 10; k > i; k--) {
				System.out.print(" ");
			}

			for (int j = 0; j < i; j++) {

				System.out.print(" ");

				System.out.print("*");
			}
			System.out.println();
		}
	}

}
