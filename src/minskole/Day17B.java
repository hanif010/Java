package minskole;

public class Day17B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Humans a = new Humans("Hanif","12");
		Humans b = new Humans("Hanif","13");
		Humans c = new Humans("Hanif","14");
		System.out.println(a.fullName + a.age);
		System.out.println(b.fullName + b.age);
		System.out.println(c.fullName + c.age);
		
		a.Countobj();
	}

}

class Humans{
	static int objectCount = 0;
	String fullName;
	String age;
	
	public Humans(String fn, String ag) {
		this.fullName = fn;
		this.age = ag;
		
		increseObjCount();
		
	}
	
	public static void Countobj() {
		System.out.println(Humans.objectCount);
	}
	
	public static void increseObjCount() {
		objectCount =objectCount+1;
	}
}