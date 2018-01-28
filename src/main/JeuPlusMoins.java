package main;

import java.util.Random;
import java.util.Scanner;

public class JeuPlusMoins {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Génération de nombre aléatoire
		Random r = new Random();
		int valeur = 1 + r.nextInt(100 - 1);
		/*Comparaison entre le nombre aléatoire et le nombre choisi par le joueur*/
		System.out.println(comparaison(entreeNombre(),valeur));
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
	public static int entreeNombre() {
		System.out.println("Veuillez saisir un nombre :");
		return sc.nextInt();
	}
}
