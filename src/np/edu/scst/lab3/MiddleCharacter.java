package np.edu.scst.lab3;

/**
 *
 * @author Tirtha Raj Poudel
 */
public class MiddleCharacter {

    char midChar(String s) {
	int mid = s.length() / 2;
	return s.charAt(mid);
    }

    public static void main(String[] args) {
	MiddleCharacter str = new MiddleCharacter();
	System.out.println("Middle character: " + str.midChar("tirtha"));
    }
}
