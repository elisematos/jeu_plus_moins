package main;

import java.util.Random;
import java.util.Scanner;

public class JeuPlusMoins {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("##################################");
		System.out.println("Bienvenue sur le jeu plus ou moins");
		System.out.println("##################################");
		//G�n�ration de nombre al�atoire
		int valeur = genererAleatoire(1,100);
		/*Compteur*/
		for(int i = 4; i >= 0; i--){
		/*Comparaison entre le nombre al�atoire et le nombre choisi par le joueur*/
			comparaison(entreeNombre(),valeur);
			System.out.println("Nombre d'essais restants : "+i);
		}
		System.out.println("Vous avez perdu. Le nombre myst�rieux �tait "+valeur);	
	}
		
	public static void comparaison(int i, int j) {
		if (i<j) {
			System.out.println("Le nombre myst�rieux est plus grand.");
		}
		else if (i>j) {
			System.out.println("Le nombre myst�rieux est plus petit.");	
		}
		else {
			System.out.println("Vous avez gagn�.");
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
