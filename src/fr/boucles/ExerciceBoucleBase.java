package fr.boucles;

/**
 * Classe pour s'exercer avec les boucles
 * @author robin
 *
 */
public class ExerciceBoucleBase {

	public static void main(String[] args) {
		
		//utilisation de printf et non println pour les sauts de lignes
		for(int i = 1; i < 11; i++) {
			System.out.printf("%s", i + " ");
		}
		System.out.println("\n");
		
		String prenom = "Robin";
		String nom = "Ladenburger";
		
		for(int i = 0; i < 20; i++) {
			System.out.println(nom + " " + prenom);
		}
		
		System.out.println();
		
		for(int i = 2; i < 101; i+=2) {
			System.out.println(i);
		}
		
		for(int i = 1; i < 100; i+=2) {
			System.out.println(i);
		}
	}
}
