package minskole;

public class Day11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Multi level
		Son hanif = new Son("Imam","Jamadar","Maktum","Hanif");
		System.out.println(hanif.firstName);
		System.out.println(hanif.lastName);
		System.out.println(hanif.Fname);
		System.out.println(hanif.Sname);
		
		hanif.displayGname();
		hanif.displayFname();
		hanif.displaySname();
		
		
		//Heraricle
		
		Daughter1 ayesha = new Daughter1("Mamta","Jamadar","Ayesha");
		System.out.println(ayesha.firstName);
		System.out.println(ayesha.lastName);
		System.out.println(ayesha.Daughter1);
		
		ayesha.displayMname();
		ayesha.displayDname();
		
		Daughter2 sana = new Daughter2("Mamta", "Jamadar", "Sana");
		System.out.println(sana.firstName);
		System.out.println(sana.lastName);
		System.out.println(sana.Daughter2);
		
		sana.displayMname();
		sana.displayD2name();
		
		Mother mamta = new Mother("Mamta","Jamadar");
		System.out.println(mamta.firstName);
		System.out.println(mamta.lastName);
		
		mamta.displayMname();
		
		
		
	}

}

// Multi-level

class GrandFather{
	String firstName;
	String lastName;
	
	public GrandFather(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}
	
	public void displayGname() {
		System.out.println(this.firstName + this.lastName);
	}
}

class Father extends GrandFather{
	String Fname;
	
	public Father(String fn, String ln, String Fn) {
		super(fn,ln);
		this.Fname = Fn;
	}
	
	public void displayFname() {
		System.out.println(this.Fname + this.lastName);
	}
}

class Son extends Father{
	String Sname;
	
	public Son(String fn, String ln, String Fn, String sn) {
		super(fn,ln,Fn);
		this.Sname = sn;
	}
	
	public void displaySname() {
		System.out.println(this.Sname + this.lastName);
	}
}

//Heraricle

class Mother{
	String firstName;
	String lastName;
	
	public Mother(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
		
	}
	
	public void displayMname() {
		System.out.println(this.firstName + this.lastName);
	}
}

class Daughter1 extends Mother{
	String Daughter1;
	public Daughter1(String fn, String ln, String dn) {
		super(fn,ln);
		this.Daughter1 = dn;
	}
	
	public void displayDname() {
		System.out.println(this.Daughter1 + this.lastName);
	}
	
}

class Daughter2 extends Mother{
	String Daughter2;
	
	public Daughter2(String fn, String ln, String dn2) {
		super(fn,ln);
		this.Daughter2 = dn2;
		
	}
	
	public void displayD2name() {
		System.out.println(this.Daughter2 + this.lastName);
	}
}
