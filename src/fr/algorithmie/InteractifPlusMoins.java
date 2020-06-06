package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		int nombreAleatoire = 1 + (int) (Math.random() * ((100 - 1) + 1));

		Scanner scanner = new Scanner(System.in);
		int nb;
		int nbCoups = 0;

		System.out.println("Devinez le nombre entre 1 et 100");
		do {
			nb = scanner.nextInt();
			nbCoups++;
			if (nb > nombreAleatoire) {
				System.out.println("Plus petit");
			} else if (nb < nombreAleatoire) {
				System.out.println("Plus grand");
			} else {
				System.out.println("Bravo vous avez trouvé en " + nbCoups + " coups ");
			}
		} while (nb != nombreAleatoire);

		scanner.close();
	}
}