package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nb;

		System.out.println("Insérer un nombre");
		nb = scanner.nextInt();

		scanner.close();

		for (int i = nb+1; i <= nb + 10; i++) {
			System.out.print(i + " ");
		}
	}
}
