package by.jb24.less04hw;

import java.util.Random;

public class Sequence {

	public static void main(String[] args) {
		int[] arr = new int[10];
		fillArrayWithRandom(arr);
//		arr[0] = 100;
//		arr[1] = 101;
//		arr[2] = 102;
//		arr[3] = 103;
//		arr[4] = 104;
//		arr[5] = 105;
//		arr[6] = 106;
//		arr[7] = 107;
//		arr[8] = 108;
//		arr[9] = 109;
		outArray(arr);		
		if (isArrayIncrease(arr)){
			System.out.println("\nCurrent array is increased.");
		}else {
			System.out.println("\nCurrent array is decreased.");
		}
		
	}

	public static void fillArrayWithRandom(int[] arr) {
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(300);
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

	public static boolean isArrayIncrease(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					return false;
				}
			}
		}
		return true;
	}

}
