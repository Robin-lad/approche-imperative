package fr.algorithmie;

import java.util.Arrays;

public class TriABulles {

	public static void main(String[] args) {
		int[] array2 = { 3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8 };
		int tmp;
		
		for (int i = array2.length; i >= 1; i--) {
			for(int j = 0; j < i-1; j++) {
				if(array2[j+1] < array2[j]) {
					tmp = array2[j];
					array2[j] = array2[j+1];
					array2[j+1] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(array2));
	}
}