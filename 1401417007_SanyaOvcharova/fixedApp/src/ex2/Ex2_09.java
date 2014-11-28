package ex2;

import java.util.*;

public class Ex2_09 {

	public String[] months = new String[13];

	public static Scanner listener = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// other way is switch(number) sysout month

		Ex2_09 months = new Ex2_09();
		int month = months.getUserInput();
		months.displayMonth(month);
		months.dusplayMonth2(month);

	}

	Ex2_09() {

		months[1] = "January";
		months[2] = "February";
		months[3] = "March";
		months[4] = "April";
		months[5] = "May";
		months[6] = "June";
		months[7] = "July";
		months[8] = "August";
		months[9] = "September";
		months[10] = "October";
		months[11] = "November";
		months[12] = "December";

	}

	public int getUserInput() {

		System.out.println("Select a month from 1 to 12");
		int input = listener.nextInt();
		// TODO Verification and normalization
		return input;

	}

	public void displayMonth(int input) {

		System.out.println("Array style " + months[input]);

	}

	public void dusplayMonth2(int input) {
		System.out.print("Switch style ");
		switch (input) {
		case 1:
			System.out.println(months[1]);
			break;
		case 2:
			System.out.println(months[2]);
			break;
		case 3:
			System.out.println(months[3]);
			break;
		case 4:
			System.out.println(months[4]);
			break;
		case 5:
			System.out.println(months[5]);
			break;
		case 6:
			System.out.println(months[6]);
			break;
		case 7:
			System.out.println(months[7]);
			break;
		case 8:
			System.out.println(months[8]);
			break;
		case 9:
			System.out.println(months[9]);
			break;
		case 10:
			System.out.println(months[10]);
			break;
		case 11:
			System.out.println(months[11]);
			break;
		case 12:
			System.out.println(months[12]);
			break;
		}

	}
}
