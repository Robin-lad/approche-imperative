package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nb;

		do {
			System.out.println("Ins�rer un nombre entre 1 et 10");
			nb = scanner.nextInt();
		} while (nb > 10 || nb < 1);

		System.out.println("F�licitation ! vous avez �crit : " + nb);
		scanner.close();
	}
}