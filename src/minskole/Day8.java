package minskole;

public class Day8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person chinmay = new Person();
		System.out.println(chinmay.firstName);
		System.out.println(chinmay.lastName);
		System.out.println(chinmay.age);
		chinmay.displayName();
		
		Person amol = new Person();
		System.out.println(amol.firstName);
		System.out.println(amol.lastName);
		System.out.println(amol.age);
		amol.displayName();
		

		PersonB sarika = new PersonB("Sarika", "Pansare", 24);
		PersonB poorva = new PersonB("Poorva", "Vyas", 25);
		
		sarika.displayName();
		poorva.displayName();
	}

}

class PersonB{
	String firstName;
	String lastName;
	int age ;
	
	public PersonB(String fn, String ln, int ag) {
		this.firstName = fn;
		this.lastName = ln;
		this.age = ag;
	}
	
	public void displayName() {
		System.out.println(this.firstName + " " + this.lastName);
	}
}

class Person {
	String firstName = "Hanif";
	String lastName = "Jamadar";
	int age = 24;
	
	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
}
