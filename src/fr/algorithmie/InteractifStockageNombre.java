package fr.algorithmie;

import java.util.ArrayList;
import java.util.Scanner;

public class InteractifStockageNombre {
	//TODO changer l'arraylist en array tout court pour respecter l'énoncé
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<>();
		boolean continuer = true;
		int nb;

		while (continuer) {
			System.out.println(
					"Tapez 1 pour ajouter un nombre ou tapez 2 pour voir la liste des nombres ou tapez 3 pour quitter");
			nb = scanner.nextInt();

			if (nb == 1) {
				System.out.println("Ecrire le nombre à ajouter au tableau");
				nb = scanner.nextInt();
				array.add(nb);
			} else if (nb == 2) {
				System.out.println(array);
			} else if (nb == 3) {
				continuer = false;
			}
		}
	}
}
