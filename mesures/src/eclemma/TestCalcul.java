package eclemma;

public class TestCalcul {
	
	public static void main(String[] args) {
		Calcul calculatrice = new Calcul();
		
		/*
		 * test des m�thodes addition et soustraction
		 * pas de condition dans ces deux m�thodes
		 * 1 seul test pour chaque suffit
		 */
		calculatrice.add(2, 3);
		calculatrice.sub(2, 3);
		
		try {
			/*
			 * test de toutes les conditions de la m�thode mul
			 */
			
			calculatrice.mul(0, 3);
			calculatrice.mul(3, 0);
			calculatrice.mul(2, 3);
			/*
			 * ce dernier test d�clenche une exception
			 */
			calculatrice.mul(2, -1);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("2+ 3 = " + calculatrice.result());

		try {
			
			/*
			 *test de toutes les conditions de la m�thode fac 
			 */
			calculatrice.fac(0);
			calculatrice.fac(1);
			calculatrice.fac(3);
			/*
			 * ce dernier test d�clenche une exception
			 */
			calculatrice.fac(-1);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
