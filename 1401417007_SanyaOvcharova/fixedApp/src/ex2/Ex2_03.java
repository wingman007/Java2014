package ex2;

public class Ex2_03 {

	public static void main(String[] args) {

		for (int i = 1; i <= 15; i++) {
			char print = 'a';
			if (i > 5) {
				print = 'b';

			}
			System.out.printf("%2d " + print + "\n", i);

		}

	}

}
