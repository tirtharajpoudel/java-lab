package np.edu.scst.lab2;

/**
 *
 * @author Tirtha Raj Poudel
 */
public class NaturalNumbers {

    public static void main(String[] args) {
	int n = 5;
	System.out.println("Tirtha's Natural Numbers: ");

	for (int i = 1; i <= n; i++) {
	    System.out.println(i);
	}

	int sum = n * (n + 1) / 2;
	System.out.println("Tirtha's Sum: " + sum);
    }
}
