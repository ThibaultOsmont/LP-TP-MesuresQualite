package checkstyle;

/**
 * Classe checkstyle.
 * @author Thibault
 *
 */
public class Check {

	/**
	 * résultat.
	 */
	private int resultat;
	
	/**
	 * Additionne 2 nombres.
	 * @param anumber
	 * 		nombre 1
	 * 
	 * @param another
	 * 		nombre 2
	 */
    public final void add(final int anumber, final int another) {
    	resultat = anumber + another;
    }

    /**
     * Méthode soustraction.
     * @param anumber
     * 		nombre 1
     * @param another
     * 		nombre 2
     */
    public final void sub(final int anumber, final int another) {
    	resultat =  anumber - another;
    }

    /**
     * Méthode multiplication.
     * @param anumber
     * 		nombre 1
     * @param amultiplicator
     * 		multiplicateur
     * 
     * @throws Exception
     * 		si nombre négatif
     */
    public final void mul(final int anumber, final int amultiplicator)
    		throws Exception {
    	if (amultiplicator < 0) {
    		throw new Exception();
    	} else if (anumber == 0) {
			resultat = 0;
		} else if (amultiplicator == 0) {
			resultat = 0;
		} else {
    		resultat = 0;
    		for (int i = 0; i < amultiplicator; i++) {
    			resultat += anumber;
    		}
        }
    }
    
    /**
     * Calcul factorielle.
     * @param ncalcul
     * 		factorielle de ncalcul
     * @return
     * 		la factorielle de ncalcul
     */
    private int facto(final int ncalcul) {
    	if (ncalcul == 0) {
			return 1;
		} else if (ncalcul == 1) {
			return 1;
		} else {
			return ncalcul * facto(ncalcul - 1);
		}
    }
    
    /**
     * Calcul de la factorielle d'un nombre.
     * 
     * @param ncalcul
     * 		factorielle de ncalcul a calculer
     * 
     * @throws Exception
     * 		si ncalcul est négatif
     */
    public final void fac(final int ncalcul) 
    		throws Exception {
    	if (ncalcul < 0) {
			throw new Exception();
		} else {
			resultat = facto(ncalcul);
		}
    	
    }
    
    /**
     * Retourne le resultat.
     * 
     * @return
     * 		resultat
     */
    public final int result() {
    	return resultat;
    }

}