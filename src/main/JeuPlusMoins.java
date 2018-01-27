package main;

public class JeuPlusMoins {
	public static void main(String[] args) {
		System.out.println(comparaison(2,1));

	}
	public static String comparaison(int i, int j) {
		String message="";
		if (i<j) {
			message=i+" est plus petit que "+j;
		}
		else if (i>j) {
			message=i+" est plus grand que "+j;	
		}
		else {
			message="Vous avez gagné.";
		}
		return message;
	}
	
}
