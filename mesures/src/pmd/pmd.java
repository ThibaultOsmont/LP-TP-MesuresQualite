package pmd;
/**
 * 
 * @author lanoix-a
 *
 */
public class pmd extends Object{
/*
 * Règles PMD : 
 * 		inutile de préciser que la classe Pmd hérite de la classe Object
 * 		le nom de la classe ne devrait pas commencer par une minuscule
 */
	
	
	/**
	 * some attributes.
	 */
	private boolean cond1, cond2, cond3, cond4;
	
	/**
	 *  a method that show the PMD rule for cyclomatic complexity detection.
	 *  java > codesize > cyclomatic complexity
	 */
	public final void complexity() {
		//Complexité de 11
		if (cond1) {
			if (cond2) {
				System.out.println("a");
			} else if (cond3) {
				System.out.println("b");
			} else {
				System.out.println("c");
			}
		} else if (cond4) {
			if (cond1 == cond4) {
				System.out.println("d");
			}
		} else if (!cond3) {
			if (cond2) {
				System.out.println("e");
			}
		} else {
			if (!cond1) {
				System.out.println("f");
			} else if (cond2) {
				System.out.println("g");
			} else if (cond3 != cond4) {
				System.out.println("h");
			} else {
				System.out.println("i");
			}
		}
	}

/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		System.out.println("do something");
		
		/*
		 * Règles PMD : 
		 * 	comparaison d'expressions identiques
		 * 	absence d'acolades
		 * 
		 */
		if(1 == 1)
			System.out.println("Hello !");
		else
			System.out.println("Good bye...");
		
		/*
		 * Règles PMD:
		 * 		la variable ne devrait pas commencer par une majuscule
		 * 		le nom de variable est trop long
		 */
		String TestVariableSuperLoooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooongue = "hello";
		String string = "ssssss";
		
		/*
		 * Règle PMD : inutile d'appeler toString sur une String
		 */
		System.out.println(string.toString());
		
	}
	
	public void Methode(String param1, String param2, 
			int param3, int param4, double param5, double param6, boolean param7, boolean param8
			, char param9, char param10) {
		/*
		 * Règles PMD:
		 * 		le nom de la méthode devrait commencer par une minuscule 
		 * 		le message apparait trop souvent
		 * 		trop de paramètres
		 * 		aucun paramètre d'utilisé
		 */
		System.out.println("message répété beaucoup de fois");
		System.out.println("message répété beaucoup de fois");
		System.out.println("message répété beaucoup de fois");
		System.out.println("message répété beaucoup de fois");
		System.out.println("message répété beaucoup de fois");
		System.out.println("message répété beaucoup de fois");
		System.out.println("message répété beaucoup de fois");
		System.out.println("message répété beaucoup de fois");
		System.out.println("message répété beaucoup de fois");
		System.out.println("message répété beaucoup de fois");
		// voici un commentaire beaucoup trop long pour être affiché sur une seule petie petite petite ligne... il devrait être écrit sur plusieurs lignes
	}
	
}
