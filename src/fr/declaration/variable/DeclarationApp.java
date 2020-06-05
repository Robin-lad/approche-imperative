package fr.declaration.variable;
import java.util.ArrayList;

public class DeclarationApp {

	public static void main(String[] args) {

		byte b = 3;
		short s = 500;
		int i = 7854125;
		long l = 784643168778461687L;

		float f = 1.5f;
		double d = 7.5;

		char c = 'z';
		boolean bool = true;
		
		System.out.println(b + " " + s + " " + i + " " + l + " " + f + " " + d + " " + b + " " + c + " " + bool);
		
		String str = "j'ai fini";
		String str2 = "le tp";
		
		String randomString = "Voici le résultat d’un calcul :\n1+5=6";
		System.out.println(randomString);
		
		ArrayList<String> a = new ArrayList<String>();
		a.add(str);
		a.add(str2);
		if(bool) {
			for(int j = 0; j < a.size(); j++)
			{
				System.out.println(a.get(j));
			}
		}
	}
}
