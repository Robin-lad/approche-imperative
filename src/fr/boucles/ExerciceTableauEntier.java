package fr.boucles;

import java.util.ArrayList;

/**
 * Classe exercice sur les tableaux
 * 
 * @author robin
 *
 */
public class ExerciceTableauEntier {

	public static void main(String[] args) {

		ArrayList<Integer> tab = new ArrayList<Integer>(10);
		for (int i = 1; i < 11; i++) {
			tab.add(i);
		}

		System.out.println(tab.get(0));
		System.out.println(tab.size());
		System.out.println(tab.get(tab.size() - 1));
		tab.set(4, 8);

		System.out.println(tab+"\n");

		// version 2 avec array tout court
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(array[0]);
		System.out.println(array.length);
		System.out.println(array[array.length-1]);
		array[4] = 8;
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
