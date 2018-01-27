package main;

import java.util.Random;

public class JeuPlusMoins {
	public static void main(String[] args) {
		
		Random r = new Random();
		int valeur = 1 + r.nextInt(100 - 1);
		System.out.println(comparaison(50,valeur));
	}
		
	public static String comparaison(int i, int j) {
		String message="";
		if (i<j) {
			message="Le nombre mystérieux est plus petit.";
		}
		else if (i>j) {
			message="Le nombre mystérieux est plus grand.";	
		}
		else {
			message="Vous avez gagné.";
		}
		return message;
	}
	
}
