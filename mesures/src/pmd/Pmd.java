package pmd;
/**
 * 
 * @author lanoix-a
 *
 */
public class Pmd {

	/**
	 * some attributes.
	 */
	private boolean cond1, cond2, cond3, cond4;
	
	/**
	 *  a method that show the PMD rule for cyclomatic complexity detection.
	 *  java > codesize > cyclomatic complexity
	 */
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

/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		System.out.println("do something");
	}

}
