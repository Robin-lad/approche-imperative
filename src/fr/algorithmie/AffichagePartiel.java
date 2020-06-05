package fr.algorithmie;

public class AffichagePartiel {

	public static void main(String[] args) {

		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		// seulement les entiers supérieur à 3
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 3) {
				System.out.print(array[i] + " ");
			}
		}

		System.out.println("\n");

		// valeur modulo 2 = 0 donc pair
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.print(array[i] + " ");
			}
		}

		System.out.println("\n");
		// i (donc index) modulo 2 = 0 donc index pair
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				System.out.print(array[i] + " ");
			}
		}

		System.out.println("\n");
		// valeur de i modulo 2 = 1 donc impair
		for (int i = 0; i < array.length; i++) {
			if (Math.abs(array[i] % 2) == 1) {
				System.out.print(array[i] + " ");
			}
		}
	}
}
