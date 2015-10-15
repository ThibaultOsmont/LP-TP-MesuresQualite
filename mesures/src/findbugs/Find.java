package findbugs;

import java.awt.List;
import java.util.ArrayList;

public class Find {

	/**
	 * Vérifie que le bug ES_COMPARING_STRINGS_WITH_EQ est bien detecté.
	 * voir http://findbugs.sourceforge.net/bugDescriptions.html#ES_COMPARING_STRINGS_WITH_EQ
	 */
	public static void testES1() {
		// on déclare deux objets String
		String s1 = new String("azerty");
		String s2 = new String("azerty");
		// on les compare avec ==
		if (s1 == s2) {
			System.out.println("ES1 : pas normal");
		}
		else {
			System.out.println("ES1 : ok");
		}
		// le bug est bien detecté quand on exécute findbugs
	}
	
	/**
	 * Vérifie que le bug ES_COMPARING_STRINGS_WITH_EQ est bien detecté.
	 * voir http://findbugs.sourceforge.net/bugDescriptions.html#ES_COMPARING_STRINGS_WITH_EQ
	 */
	public static void testES2() {
		// on déclare deux objets String
		String s1 = new String("azerty");
		String s2 = new String("qwerty");
		// on les compare avec !=
		if (s1 != s2) {
			System.out.println("ES2 : ok");
		}
		else {
			System.out.println("ES2 : pas normal");
		}
		// le bug est bien detecté quand on exécute findbugs
	}
	
	public static void main(String[] args) {
		testES1();
		testES2();
		
		/*
		 * Cr�ation d'un bug 
		 */
		String s = new String((String)null);
		
		
		/*
		 * Cr�ation d'un bug: valeur de retour ignor�e
		 */
		String aString = "bob";
		aString.replace('b', 'p');
		if(aString.equals("pop")){}
		
		}

	/*
	 *Cr�ation d'un bug : la m�thode peut retourner null
	 */
	@Override
	public String toString() {
		return null;
	}
	
	/*
	 * Cr�ation d'un bug: cr�ation de la m�thode equals, mais pas
	 * de lam�thode hashcode 
	 * 
	 * de plus, la m�thode retourne toujours true
	 */
	public boolean equals(Object o) {
		return true;
	}
}
