package random;

import java.util.Scanner;

public class Grades {

	static Scanner myScanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Grades myProgram = new Grades();
		while (true) {

			float score1 = myProgram.add(myScanner);
			System.out.println(score1);
			int maxScore = myProgram.getMaxScore(myScanner);

			float grade = myProgram.determineGrade(maxScore, score1);
			System.out.printf("The grade is %.2f", grade);
			System.out.println();
			String partyBreaker = myScanner.nextLine();
			if (partyBreaker.equals("exit")) {
				break;
			}

		}

	}

	/**
	 * Calculate grade
	 * 
	 * @param int
	 * @param int
	 * 
	 * @return float
	 */
	public float determineGrade(int maxPoints, float score) {

		float grade = score / maxPoints * 6;
		return grade;

	}

	/**
	 * get maximum score from user input
	 * 
	 * @param getScore
	 * @return int
	 */

	public int getMaxScore(Scanner getScore) {

		System.out.println("Enter a maximum score: ");
		int maxScore = getScore.nextInt();
		return maxScore;

	}

	/**
	 * Get score from user input Deprecated
	 * 
	 * @param Scanner
	 *            getScore
	 * @return float
	 */

	public float getStudentScore(Scanner getScore) {

		System.out.println("Enter a student score: ");
		float studentScore = getScore.nextFloat();
		return studentScore;

	}

	/**
	 * Calculate score by user input
	 * 
	 * @param Scanner
	 *            getScore
	 * @return float
	 */

	public float add(Scanner getScore) {
		float result = 0;
		System.out.println("Enter input: ");

		while (true) {
			float input = getScore.nextFloat();
			if (input == 0)
				break;
			result += input;
		}
		return result;

	}

}
