package np.edu.scst.lab2;

/**
 *
 * @author Tirtha Raj Poudel
 */
public class MultiplicationTable {

    public static void main(String[] args) {

	int num = 5;
	System.out.println("Tirtha's Multiplication Table: ");

	for (int i = 1; i <= 10; i++) {
	    System.out.println(String.format("%d * %d = %d", num, i, num * i));
	}
    }
}
