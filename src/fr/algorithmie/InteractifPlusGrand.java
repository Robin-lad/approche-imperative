package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nb;
		int plusgrand = Integer.MIN_VALUE;

		System.out.println("Insérer 10 nombre");
		for (int i = 0; i < 10; i++) {
			nb = scanner.nextInt();
			if(nb > plusgrand) {
				plusgrand = nb;
			}
		}

		scanner.close();
		System.out.println("Le plus grand est : " + plusgrand);
	}
}
