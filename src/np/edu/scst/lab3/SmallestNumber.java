package np.edu.scst.lab3;

/**
 *
 * @author Tirtha Raj Poudel
 */
public class SmallestNumber {

    int smallest(int a, int b, int c) {
	if (a < b && a < c) {
	    return a;
	} else if (b < a && b < c) {
	    return b;
	} else {
	    return c;
	}
    }

    public static void main(String[] args) {
	SmallestNumber small = new SmallestNumber();
	System.out.println("Tirtha's smallest number: " + small.smallest(5, 10, 15));
    }

}
