package findbugs;

import java.awt.List;
import java.util.ArrayList;

public class Find {

	/**
	 * VÃ©rifie que le bug ES_COMPARING_STRINGS_WITH_EQ est bien detectÃ©.
	 * voir http://findbugs.sourceforge.net/bugDescriptions.html#ES_COMPARING_STRINGS_WITH_EQ
	 */
	public static void testES1() {
		// on dÃ©clare deux objets String
		String s1 = new String("azerty");
		String s2 = new String("azerty");
		// on les compare avec ==
		if (s1 == s2) {
			System.out.println("ES1 : pas normal");
		}
		else {
			System.out.println("ES1 : ok");
		}
		// le bug est bien detectÃ© quand on exÃ©cute findbugs
	}
	
	/**
	 * VÃ©rifie que le bug ES_COMPARING_STRINGS_WITH_EQ est bien detectÃ©.
	 * voir http://findbugs.sourceforge.net/bugDescriptions.html#ES_COMPARING_STRINGS_WITH_EQ
	 */
	public static void testES2() {
		// on dÃ©clare deux objets String
		String s1 = new String("azerty");
		String s2 = new String("qwerty");
		// on les compare avec !=
		if (s1 != s2) {
			System.out.println("ES2 : ok");
		}
		else {
			System.out.println("ES2 : pas normal");
		}
		// le bug est bien detectÃ© quand on exÃ©cute findbugs
	}
	
	public static void main(String[] args) {
		testES1();
		testES2();
		
		/*
		 * Création d'un bug 
		 */
		String s = new String((String)null);
		
		
		/*
		 * Création d'un bug: valeur de retour ignorée
		 */
		String aString = "bob";
		aString.replace('b', 'p');
		if(aString.equals("pop")){}
		
		}

	/*
	 *Création d'un bug : la méthode peut retourner null
	 */
	@Override
	public String toString() {
		return null;
	}
	
	/*
	 * Création d'un bug: création de la méthode equals, mais pas
	 * de laméthode hashcode 
	 * 
	 * de plus, la méthode retourne toujours true
	 */
	public boolean equals(Object o) {
		return true;
	}
}
