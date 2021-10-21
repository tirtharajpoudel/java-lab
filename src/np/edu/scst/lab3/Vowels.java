package np.edu.scst.lab3;

/**
 *
 * @author Tirtha Raj Poudel
 */
public class Vowels {

    int countVowels(String str) {
	int numOfVowels = 0;

	for (int i = 0; i < str.length(); i++) {
	    str = str.toLowerCase();
	    char currentChar = str.charAt(i);
	    if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
		numOfVowels++;
	    }
	}
	return numOfVowels;
    }

    public static void main(String[] args) {
	Vowels v = new Vowels();
	String tirthasString = "Tirtha's string";
	int numOfVowels = v.countVowels(tirthasString);
	System.out.println("Number of vowels: " + numOfVowels);
    }
}
