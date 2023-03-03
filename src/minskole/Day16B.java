package minskole;

public class Day16B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DD d = new DD();
		
		d.one();
		d.seven();
		d.five();
	}

}

interface AA{
	
	abstract public void one();
	abstract public void two();
	abstract public void three();
}
interface BB{
	abstract public void four();
	abstract public void five();
}
interface CC extends AA, BB{
	abstract public void six();
	abstract public void seven();
}

class DD implements CC{
	public void one() {
		System.out.println("One");
	}
	public void two() {
		System.out.println("Two");
	}
	public void three() {
		System.out.println("Three");
	}
	public void four() {
		System.out.println("Four");
	}
	public void five() {
		System.out.println("Five");
	}
	public void six() {
		System.out.println("Six");
	}
	public void seven() {
		System.out.println("Seven");
	}
}