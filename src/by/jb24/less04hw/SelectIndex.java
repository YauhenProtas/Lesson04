package by.jb24.less04hw;

import java.util.Arrays;
import java.util.Random;

public class SelectIndex {

	public static void main(String[] args) {
		int[] arr = new int[100];
		int nullArrSize = 0;

		fillArrayWithRandom(arr);
//		arr[0] = 100;
//		arr[1] = 0;
//		arr[2] = 102;
//		arr[3] = 103;
//		arr[4] = 0;
//		arr[5] = 105;
//		arr[6] = 106;
//		arr[7] = 107;
//		arr[8] = 0;
//		arr[9] = 109;
		outArray(arr);
		// count values = 0 to get new array size
		nullArrSize = countNull(arr);

		if (nullArrSize == 0) {
			System.out.println("Null-valued items not found. Program closed.");
			return;
		} else {
			System.out.println("Array of indexes is:");
			getNull(arr, nullArrSize);

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

	public static int countNull(int[] arr) {
		int nullArrSize = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				nullArrSize++;
			}
		}
		return nullArrSize;
	}

	public static void getNull(int[] arr, int arrlen) {
		int[] outarr = new int[arrlen];
		int j = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				outarr[j] = i;
				j++;
			}
		}
		System.out.println(Arrays.toString(outarr));
	}

}
