package fr.algorithmie;

import java.util.Arrays;

public class Rotation {

	public static void main(String[] args) {
		int[] array1 = { 3, 8, 17, 5, 4 };
		int tmp = array1[array1.length-1];
		
		for(int i = array1.length-2; i >= 0; i--) {
			array1[i+1] = array1[i];
		}
		array1[0] = tmp;
		
		System.out.println(Arrays.toString(array1));
	}
}
