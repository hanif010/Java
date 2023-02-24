package minskole;

public class Day9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person hanif = new Person();
		System.out.println(hanif.fullName);
		System.out.println(hanif.age);
		System.out.println(hanif.adharCard);
		
		hanif.displayName();
		
		// Getting class Properties outside the class
		
		hanif.fullName = "Chinmay Deshpande";
		hanif.age = 32;
		hanif.adharCard = 1452;
		hanif.displayName();
		
		Person amol = new Person();
		System.out.println(amol.fullName);
		System.out.println(amol.age);
		System.out.println(amol.adharCard);
		amol.displayName();
		
	//Using constructor
		
		PersonB asif = new PersonB("Asif Jamadar", 22, 1634);
		PersonB javed = new PersonB("Javed Shaikh", 28, 1834);
		
		asif.displayName();
		javed.displayName();
		
	}

}

class Person{
	String fullName = "Hanif Jamadar";
	int age = 24;
	int adharCard = 1234;
	
	public void displayName() {
		System.out.println(this.fullName);
	}
}


class PersonB{
	String fullName;
	int age;
	int adharNo;
	
	public PersonB(String fn, int ag, int ad) {
		this.fullName = fn;
		this.age = ag;
		this.adharNo = ad;
	}
	
	public void displayName() {
		System.out.println(this.fullName);
	}
}