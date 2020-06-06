package fr.algorithmie;

public class FirstLast {

	public static boolean calculBoolean(int[] t) {
		if (t.length > 0) {
			if (t[0] == t[t.length - 1]) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] array1 = { 3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8 };
		int[] array2 = { 6 };
		int[] array3 = { 6, 4 };
		int[] array4 = { 5, 6 };
		int[] array5 = { 0, 6, 0 };
		int[] array6 = { 0, 6, 6, 6, 6, 6, 5, 6, 6 };

		System.out.println(calculBoolean(array1));
		System.out.println(calculBoolean(array2));
		System.out.println(calculBoolean(array3));
		System.out.println(calculBoolean(array4));
		System.out.println(calculBoolean(array5));
		System.out.println(calculBoolean(array6));
	}
}