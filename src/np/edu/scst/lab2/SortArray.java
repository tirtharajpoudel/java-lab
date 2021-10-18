package np.edu.scst.lab2;

import java.util.Arrays;

/**
 *
 * @author Tirtha Raj Poudel
 */
public class SortArray {

    public static void main(String[] args) {
	int[] tirthasarray = {4, 2, 5, 1, 3};

	Arrays.sort(tirthasarray);

	for (int i = 0; i < 5; i++) {
	    System.out.println(tirthasarray[i]);
	}
    }
}
