package eclemma;

public class TestCalcul {
	
	public static void main(String[] args) {
		Calcul calculatrice = new Calcul();
		
		calculatrice.add(2, 3);
		System.out.println("2+ 3 = " + calculatrice.result());

	}

}
