package nakov;

import java.util.Random;
import java.util.Scanner;

public class HeadsTails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Just some heads-or-tails programme.");
		System.out.println("Press enter to continue.");

		Scanner listener = new Scanner(System.in);
		listener.nextLine();

		// evenOdd(5);
		headsTails();
		listener.close();

	}

	public static void evenOdd(int check) {
		if (check % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}

	public static void headsTails() {

		Random rand = new Random();
		int check = rand.nextInt();
		if ((check % 2) == 0) {
			System.out.println("Heads!");
		} else {
			System.out.println("Tails");
		}

	}

}
