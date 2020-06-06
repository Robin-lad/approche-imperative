package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nb;

		do {
			System.out.println("Insérer un nombre entre 1 et 10");
			nb = scanner.nextInt();
		} while (nb > 10 || nb < 1);
		scanner.close();
		
		System.out.println("Table de " + nb +" :");
		for(int i = 1; i <= 10; i++) {
			System.out.println(nb + " * " + i + " = " + nb*i);
		}
	}
}
