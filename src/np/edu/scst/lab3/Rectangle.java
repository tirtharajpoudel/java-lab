package np.edu.scst.lab3;

/**
 *
 * @author Tirtha Raj Poudel
 */
public class Rectangle {

    double area(double l, double b) {
	return l * b;
    }

    public static void main(String[] args) {
	Rectangle r = new Rectangle();
	System.out.println("Tirtha's rectangle's area: " + r.area(2, 9));
    }
}
