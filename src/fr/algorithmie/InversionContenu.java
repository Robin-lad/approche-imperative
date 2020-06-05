package fr.algorithmie;

public class InversionContenu {

	public static void main(String[] args) {

		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		int j = 0;
		int[] arrayCopie = new int[array.length];
		for (int i = array.length - 1; i >= 0; i--) {
			arrayCopie[j] = array[i];
			j++;
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println("\n");

		for (int i = 0; i < arrayCopie.length; i++) {
			System.out.print(arrayCopie[i] + " ");
		}
	}
}
