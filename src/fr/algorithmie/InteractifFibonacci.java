package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {

	public static int Fibonnaci(int n) {
		if (n <= 1) {
			//System.out.println("n : " + n);
			return n;
		} else {
			return Fibonnaci(n - 1) + Fibonnaci(n - 2);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Entrez un nombre");
		int nb = scanner.nextInt();

		System.out.println(Fibonnaci(nb));

		scanner.close();
	}

}
