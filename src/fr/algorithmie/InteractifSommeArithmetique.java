package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nb;

		System.out.println("Ins�rer un nombre");
		nb = scanner.nextInt();

		scanner.close();

		int res = 0;
		for (int i = 1; i <= nb; i++) {
			res += i;
		}
		System.out.println(res);
	}
}
