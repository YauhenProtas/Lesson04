package by.jb24.less04hw;

import java.util.Random;

public class SumEquals {

	public static void main(String[] args) {
		int sum = 0;
		int k = 3;
		int[] arr = new int[200];

		fillArrayWithRandom(arr);
		outArray(arr);

		for (int i = 0; i < arr.length; i++) {
			if (isEqual(arr[i], k)) {
				System.out.println("Will processed: arr[" + i + "]=" + arr[i]);
				sum = sum + arr[i];
			}
		}
		
		System.out.println("\nRESULT: Sum=" + sum);
		

	}

	public static void fillArrayWithRandom(int[] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(300);
		}
	}

	public static void outArray(int[] arr) {
		System.out.println("--------------------------------------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]=" + arr[i] + "; ");
		}
		System.out.println();
		System.out.println("--------------------------------------------");
	}

	public static boolean isEqual(int num, int eql) {
		if (num % eql == 0) {
			return true;
		} else {
			return false;
		}
	}

}
