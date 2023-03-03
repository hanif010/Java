package minskole;

public class Day12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator a = new calculator();
		a.addition(12, 3);
		a.addition(12, 3, 4);
		a.addition(12, 3, 4, 5);
		
//		PersonC c = new PersonC();
//		PersonC c1 = new PersonC(2);
//		PersonC c2 = new PersonC(2,2);
//		PersonC c3 = new PersonC(2,5,6);
		
		SBI s = new SBI();
		s.Saving(1);
		s.Loan(2);
		
		
		SonD s1 = new SonD("Shirish","Deshpande","Chinmay");
		s1.displayName();
		s1.displaySname();
		
		
		
	}

}
class calculator{
	
	// overriding
	
	public void addition(int x, int y) {
		System.out.println(x+y);
	}
	public void addition(int x,int y, int z) {
		System.out.println(x+y+z);
	}
	public void addition(int x,int y, int z,int a) {
		System.out.println(x+y+z+a);
	}
}

class PersonC{
	
	public PersonC() {
		System.out.println("Default constructor is called");
	}
	
	public PersonC(int x) {
		System.out.println("Constructor with 1 parameter" + x);
	}
	
	public PersonC(int x, int y) {
		System.out.println("Constructor with 2 parameter" + (x+y));
	}
	
	public PersonC(int x,int y,int z) {
		System.out.println("Constructor with 3 parameter" + (x+y+z));
	}
}

//Overriding

class WorldBank{
	
	public void saving(int x) {
		System.out.println("WorldBank savig:"+x);
	}
	
	public void Loan(int y) {
		System.out.println("WorldBank:"+y);
	}
}

class SBI extends WorldBank{
	
	public void Saving(int x) {
		System.out.println("SBI Savig:" + x);
	}
	
	public void Loan(int y) {
		System.out.println("SBI Loan:" + y);
	}
}

//Program

 class FatherD{
	String firstName;
	String lastName;	
	public FatherD(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	
	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
}

class SonD extends FatherD{
	String sName;
	
	public SonD(String firstName, String lastName, String sName) {
		super(firstName,lastName);
		this.sName = sName;
	}
	
	public void displaySname() {
		System.out.println(this.sName + this.lastName);
	}
}
