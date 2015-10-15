package metrics;

public class Metrics {

	/**
	 * some attributes.
	 */
	private boolean cond1, cond2, cond3, cond4;
	

	public final void complexity() {

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

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
