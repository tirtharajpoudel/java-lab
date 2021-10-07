package np.edu.scst.lab1;

/**
 *
 * @author Tirtha Raj Poudel
 */
public class Prime {

    public static void main(String[] args) {
	int number = 53;
	int count = 0;
	for (int i = 1; i < (number / 2) + 1; i++) {
	    if (number % i == 0) {
		count++;
	    }
	}
	if (count > 1) {
	    System.out.println("Tirtha's Composite Number.");
	} else {
	    System.out.println("Tirtha's Prime Number.");
	}
    }
}
