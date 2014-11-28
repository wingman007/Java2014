package Ex4;

import java.util.Random;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "Ivan", "Bin", "John", "Silviq", "IVAN" };

		isUpper(arr);
		findIv(arr);
		contI(arr);
		endIn(arr);

	}

	/**
	 * За даден масив от низове, изведете елементите започващи с "Ив".
	 */

	public static void findIv(String[] arr) {
		for (String i : arr) {

			if (i.startsWith("Iv")) {
				System.out.println(i);
			}

		}
	}

	/**
	 * За масив от низове, изведете елементите съдържащи "и".
	 */

	public static void contI(String[] arr) {
		for (String i : arr) {

			if (i.contains("i")) {
				System.out.println(i);
			}

		}
	}

	/**
	 * За масив от низове, изведете елементите завършващи с "ин".
	 */

	public static void endIn(String[] arr) {
		for (String i : arr) {

			if (i.endsWith("in")) {
				System.out.println(i);
			}

		}
	}

	/**
	 * За масив от низове, изведете низовете с големи букви.
	 */

	public static void isUpper(String[] arr) {
		for (String i : arr) {

			if (i.matches("[A-Z]{" + i.length() + "}")) {//for just capital letter ^[A_Z].*
				System.out.println(i);
			}

		}
	}

	/**
	 * Реализирайте евристични алгоритми за търсене в сортиран масив. Опитайте
	 * се да оцените броя на извършваните действия (върху различни тестови
	 * данни) за различните алгоритми.
	 */
	static int find_b(int x, int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		int middle;
		do {
			middle = (left + right) / 2;
			if (arr[middle] < x)
				left = middle + 1;
			else
				right = middle - 1;
		} while (arr[middle] != x && right >= left);
		if (arr[middle] == x)
			return middle;
		else
			return -1;
	}

	

	/**
	 * Да се генерират по случаен начин 3 масива, всеки от които с до 20
	 * елемента от цели числа принадлежащи на интервала [-100, 100]. Да се
	 * намери средно квадратично (сума_от_квадратите/броя) на числата, които са
	 * в интервал [-20, 20], за всеки масив.
	 */

	public static int[] randArr(int module, int arrNumber) {

		// random numbers [-mudule, module]

		Random rand = new Random();
		int[] randArr = new int[arrNumber];
		for (int i = 0; i < randArr.length; i++) {

			randArr[i] = (rand.nextInt() % module + 1);
		}
		return randArr;

	}

	public static int sqrtArr(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= -20 || arr[i] <= 20) {
				sum += Math.pow((double) arr[i], 2);
			}
		}
		return sum;

	}

}
