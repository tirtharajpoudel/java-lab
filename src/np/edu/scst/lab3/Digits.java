package np.edu.scst.lab3;

/**
 *
 * @author Tirtha Raj Poudel
 */
public class Digits {

    int sumOfDigits(int num) {
	int sum = 0;
	while (num != 0) {
	    int temp = num % 10;
	    sum += temp;
	    num = num / 10;
	}
	return sum;
    }

    public static void main(String[] args) {
	Digits d = new Digits();
	System.out.println("Tirtha's sum: " + d.sumOfDigits(988));
    }
}
