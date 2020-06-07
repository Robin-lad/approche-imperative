package fr.algorithmie;

import java.util.ArrayList;
import java.util.Scanner;

public class Interactif21Batons {

	// Permet l'initialisation du tableau de batons et remet les batons quand on
	// recommence une partie
	public static void remettreBatons(ArrayList<String> a, int nbBaton) {
		if (a.isEmpty()) {
			for (int i = 0; i < nbBaton; i++) {
				a.add("|");
			}
		} else {
			for (int i = 0; i < nbBaton; i++) {
				a.set(i, "|");
			}
		}
	}

	// Affiche le tableau de batons
	public static void AfficheBatons(ArrayList<String> a) {
		for (int i = 0; i < a.size(); i++) {
			System.out.print(a.get(i) + " ");
		}
		System.out.print("\n");
	}

	// Effectue une suppression des batons retirés
	public static void SuppressionBatons(ArrayList<String> a, int debut, int fin) {
		for (int i = debut; i < fin; i++) {
			a.set(i, " ");
		}
	}

	// fonction qui fait jouer l'ordi avec un rand ou qui tire des batons pour n'en
	// laisser qu'un
	public static int TourDeJeuDeLordi(int batonsrestant) {
		switch (batonsrestant) {
		case 1:
			return 1;
		case 2:
			return 1;
		case 3:
			return 2;
		case 4:
			return 3;
		}
		return 1 + (int) (Math.random() * ((3 - 1) + 1));
	}

	public static void main(String[] args) {

		// boolean pour refaire une partie
		int continuer = 0;
		int nbBaton = 21;
		ArrayList<String> tabBatons = new ArrayList<String>(nbBaton);

		System.out.println("Bienvenue au jeu des " + nbBaton + " batons");
		System.out.println("Tapez 1 pour connaitre les règles ou tapez 2 pour commencer la partie");

		Scanner scanner = new Scanner(System.in);
		int nb = scanner.nextInt();

		if (nb == 1) {
			System.out.println("La personne qui retire le dernier baton a perdu");
			System.out.println("Chacun votre votre tour vous pouvez retirer de 1 à 3 batons");
			System.out.println("Le joueur commence la partie");
		}

		do {
			remettreBatons(tabBatons, nbBaton);
			AfficheBatons(tabBatons);

			String gagnant = "le joueur ! Bravo !";
			// nombre de batons retirés au cours de la partie
			int batonsRetire = 0;

			// boucle pour le jeu complet tour joueur et ordinateur
			while (batonsRetire < nbBaton) {
				System.out.println("Nombre à retirer ? (1-3)");
				nb = scanner.nextInt();

				// tant que le nombre de baton proposé est incorrect on en rentre un nouveau
				while (nb < 1 || nb > 3 || batonsRetire + nb > nbBaton) {
					System.out.println("Entrez un nombre correct !");
					nb = scanner.nextInt();
				}
				// on supprime du tableau les batons qui viennent d'être retirées
				SuppressionBatons(tabBatons, batonsRetire, batonsRetire + nb);
				batonsRetire += nb;

				// comme le tour du joueur et de l'ordi sont dans la même boucle si jamais le
				// joueur retire le dernier baton il fallait qu'il perde et qu'il ne fasse pas
				// jouer l'ordinateur d'où le break
				if (batonsRetire == nbBaton) {
					gagnant = "L'ordinateur !";
					break;
				}
				AfficheBatons(tabBatons);

				// tour de l'ordi, même execution qu'avec le joueur
				int batonsRetireOrdi = TourDeJeuDeLordi(nbBaton - batonsRetire);
				SuppressionBatons(tabBatons, batonsRetire, batonsRetire + batonsRetireOrdi);
				batonsRetire += batonsRetireOrdi;
				System.out.println("L'ordinateur a retiré " + batonsRetireOrdi + " batons");
				AfficheBatons(tabBatons);
			}

			System.out.println("Jeu terminé !! Le gagnant est : " + gagnant);
			System.out.println("\ntapez 1 pour rejouer ou 2 pour quitter");
			continuer = scanner.nextInt();

		} while (continuer == 1);

		scanner.close();
	}
}