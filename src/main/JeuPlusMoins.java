package main;

import java.util.Random;
import java.util.Scanner;

public class JeuPlusMoins {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("##################################");
		System.out.println("Bienvenue sur le jeu plus ou moins");
		System.out.println("##################################");
		//Génération de nombre aléatoire
		int valeur = genererAleatoire(1,100);
		/*Compteur*/
		for(int i = 4; i >= 0; i--){
		/*Comparaison entre le nombre aléatoire et le nombre choisi par le joueur*/
			comparaison(entreeNombre(),valeur);
			System.out.println("Nombre d'essais restants : "+i);
		}
		System.out.println("Vous avez perdu. Le nombre mystérieux était "+valeur);	
	}
		
	public static void comparaison(int i, int j) {
		if (i<j) {
			System.out.println("Le nombre mystérieux est plus grand.");
		}
		else if (i>j) {
			System.out.println("Le nombre mystérieux est plus petit.");	
		}
		else {
			System.out.println("Vous avez gagné.");
			System.exit(0);
		}
	}
	public static int entreeNombre() {
		System.out.println("Veuillez saisir un nombre :");
		return sc.nextInt();
	}
	public static int genererAleatoire(int min,int max) {
		Random r = new Random();
		return min + r.nextInt(max - min);
	}
}
