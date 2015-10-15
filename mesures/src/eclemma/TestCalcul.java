package eclemma;

public class TestCalcul {
	
	public static void main(String[] args) {
		Calcul calculatrice = new Calcul();
		
		/*
		 * test des méthodes addition et soustraction
		 * pas de condition dans ces deux méthodes
		 * 1 seul test pour chaque suffit
		 */
		calculatrice.add(2, 3);
		calculatrice.sub(2, 3);
		
		try {
			/*
			 * test de toutes les conditions de la méthode mul
			 */
			
			calculatrice.mul(0, 3);
			calculatrice.mul(3, 0);
			calculatrice.mul(2, 3);
			/*
			 * ce dernier test déclenche une exception
			 */
			calculatrice.mul(2, -1);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("2+ 3 = " + calculatrice.result());

		try {
			
			/*
			 *test de toutes les conditions de la méthode fac 
			 */
			calculatrice.fac(0);
			calculatrice.fac(1);
			calculatrice.fac(3);
			/*
			 * ce dernier test déclenche une exception
			 */
			calculatrice.fac(-1);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
