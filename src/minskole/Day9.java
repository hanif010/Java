package minskole;

public class Day9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person1 hanif = new Person1();
		System.out.println(hanif.fullName);
		System.out.println(hanif.age);
		System.out.println(hanif.adharCard);
		
		hanif.displayName();
		
		// Getting class Properties outside the class
		
		hanif.fullName = "Chinmay Deshpande";
		hanif.age = 32;
		hanif.adharCard = 1452;
		hanif.displayName();
		
		Person1 amol = new Person1();
		System.out.println(amol.fullName);
		System.out.println(amol.age);
		System.out.println(amol.adharCard);
		amol.displayName();
		
		//Using constructor
		
		Person2 asif = new Person2("Asif Jamadar", 22, 1634);
		Person2 javed = new Person2("Javed Shaikh", 28, 1834);
		
		asif.displayName();
		javed.displayName();
		
		Person3 poorva = new Person3();
		System.out.println(poorva.fullName);
		System.out.println(poorva.age);
		System.out.println(poorva.adharNo);
		
		poorva.setFullName("Poorva Vyas");
		poorva.setAge(25);
		poorva.setadharNo(12554);
		
		System.out.println(poorva.fullName);
		System.out.println(poorva.age);
		System.out.println(poorva.adharNo);
	}

}

class Person1{
	String fullName = "Hanif Jamadar";
	int age = 24;
	int adharCard = 1234;
	
	public void displayName() {
		System.out.println(this.fullName);
	}
}


class Person2{
	String fullName;
	int age;
	int adharNo;
	
	public Person2(String fn, int ag, int ad) {
		this.fullName = fn;
		this.age = ag;
		this.adharNo = ad;
	}
	
	public void displayName() {
		System.out.println(this.fullName);
	}
}

// Setter and Getter

class Person3 {
	String fullName;
	int age;
	int adharNo;
	
	public void setFullName(String fn) {
		this.fullName = fn;
	}
	
	public void setAge(int ag) {
		this.age = ag;
	}
	
	public void setadharNo(int ad) {
		this.adharNo = ad;
	}
}