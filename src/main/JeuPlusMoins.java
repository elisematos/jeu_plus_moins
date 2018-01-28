package main;

import java.util.Random;
import java.util.Scanner;

public class JeuPlusMoins {
	public static void main(String[] args) {
		
		Random r = new Random();
		int valeur = 1 + r.nextInt(100 - 1);
		System.out.println(comparaison(50,valeur));
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un nombre :");
		int nombre = sc.nextInt();
		System.out.println("Vous avez saisi : " + nombre);
	}
		
	public static String comparaison(int i, int j) {
		if (i<j) {
			return "Le nombre mystérieux est plus petit.";
		}
		else if (i>j) {
			return "Le nombre mystérieux est plus grand.";	
		}
		else {
			return "Vous avez gagné.";
		}
	}
	
}
