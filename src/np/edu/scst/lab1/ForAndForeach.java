package np.edu.scst.lab1;

/**
 *
 * @author Tirtha Raj Poudel
 */
public class ForAndForeach {

    public static void main(String[] args) {
	float tirthaarray[] = new float[10];
	for (int i = 0; i < 10; i++) {
	    tirthaarray[i] = i + 1;
	}
	for (float i : tirthaarray) {
	    System.out.println(i);
	}
    }
}
