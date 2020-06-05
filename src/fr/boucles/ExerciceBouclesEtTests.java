package fr.boucles;

/**
 * class pour apprendre à utiliser les boucles et tests
 * 
 * @author robin
 *
 */
public class ExerciceBouclesEtTests {

	public static void main(String[] args) {

		int[] a = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println("\n");

		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}

		System.out.println("\n");

		for (int i = 0; i < a.length; i++) {
			if (a[i] > 3)
				System.out.print(a[i] + " ");
		}

		System.out.println("\n");

		// valeur modulo 2 = 0 donc pair
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0)
				System.out.print(a[i] + " ");
		}

		System.out.println("\n");
		// i (donc index) modulo 2 = 0 donc index pair
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0)
				System.out.print(a[i] + " ");
		}

		System.out.println("\n");
		// valeur de i modulo 2 = 1 donc impair
		for (int i = 0; i < a.length; i++) {
			if (Math.abs(a[i] % 2) == 1)
				System.out.print(a[i] + " ");
		}
	}
}
