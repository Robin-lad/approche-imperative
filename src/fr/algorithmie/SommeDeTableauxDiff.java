package fr.algorithmie;

import java.util.Arrays;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int[] array2 = { -1, 12, 17, 14, 5, -9, 0, 18 };

		int[] arraySomme;

		// condition pour connaitre l'array la plus longue, pour gérer les deux cas
		// (array2 peut être plus longue que la 1)
		if (array.length > array2.length) {

			arraySomme = new int[array.length];

			for (int i = 0; i < array2.length; i++) {
				arraySomme[i] = array[i] + array2[i];
			}
			for (int i = array2.length; i < array.length; i++) {
				arraySomme[i] = array[i];
			}
		} else {

			arraySomme = new int[array2.length];

			for (int i = 0; i < array.length; i++) {
				arraySomme[i] = array2[i] + array[i];
			}
			for (int i = array.length; i < array2.length; i++) {
				arraySomme[i] = array2[i];
			}
		}
		System.out.println(Arrays.toString(arraySomme));
	}
}
