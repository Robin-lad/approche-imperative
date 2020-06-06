package fr.algorithmie;

public class FabriquerMur {

	public static void main(String[] args) {
		// Tests de vérification
		verifier(3, 1, 8, true);
		verifier(3, 1, 9, false);
		verifier(3, 2, 10, true);
		verifier(3, 2, 8, true);
		verifier(3, 2, 9, false);
		verifier(6, 1, 11, true);
		verifier(6, 0, 11, false);
		verifier(1, 4, 11, true);
		verifier(0, 3, 10, true);
		verifier(1, 4, 12, false);
		verifier(3, 1, 7, true);
		verifier(1, 1, 7, false);
	}

	static boolean fabriquerMur(int nbSmall, int nbBig, int longueur) {
		// j'ai pas utilisé de modulo car on a un nombre limité de brique et je trouvais donc ça plus contraignant à calculer
		while (nbBig > 0) {
			if (longueur >= 5) {
				longueur -= 5;
				nbBig--;
			} else {
				break;
			}
		}

		if (nbSmall >= longueur) {
			return true;
		} else {
			return false;
		}
	}

	private static void verifier(int nbSmall, int nbBig, int longueur, boolean b) {
		if (!fabriquerMur(nbSmall, nbBig, longueur) == b) {
			throw new RuntimeException("Test (" + nbSmall + ", " + nbBig + ", " + longueur + ") NON passant.");

		}
	}
}
