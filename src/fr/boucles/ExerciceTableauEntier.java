package fr.boucles;

import java.util.ArrayList;

/**
 * Classe exercice sur les tableaux
 * @author robin
 *
 */
public class ExerciceTableauEntier {

	public static void main(String[] args) {
		
		ArrayList<Integer> tab = new ArrayList<Integer>(10);
		for(int i = 1; i < 11; i++) {
			tab.add(i);
		}
		
		System.out.println(tab.get(0));
		System.out.println(tab.size());
		System.out.println(tab.get(tab.size()-1));
		tab.set(4, 8);
		
		System.out.println(tab);
	}
}
