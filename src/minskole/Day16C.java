package minskole;

public class Day16C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		YY y = new YY();
		y.greet();
		y.greet(5);
		y.ZZ();
	}

}

interface ZZ{
	
	public void ZZ();
	default void greet() {
		System.out.println("Hello");
	}
	
	default void greet(int x) {
		System.out.println("Hello"+x);
	}
}

class YY implements ZZ{
	public void ZZ() {
		System.out.println("Bye");
	}
}