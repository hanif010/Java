package minskole;

public class Day10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FatherA shirish = new FatherA();
		System.out.println(shirish.firstName);
		System.out.println(shirish.lastName);
		//System.out.println(shirish.age);
		shirish.displayName();
		
		FatherB a = new FatherB();
		System.out.println(a.firstName);
		System.out.println(a.lastName);
		
		
		SonB Chinmay = new SonB();
		System.out.println(Chinmay.firstName);
		System.out.println(Chinmay.lastName);
		System.out.println(Chinmay.sName);
		
		Chinmay.displayName();
		Chinmay.displaySname();
		
		SonC asif = new SonC("Maktum","Jamadar","Asif");
		System.out.println(asif.firstName);
		System.out.println(asif.lastName);
		System.out.println(asif.sName);
		
		asif.displayName();
		asif.displaySname();
		
		
		
		
		
	}

}

class FatherA{
	String firstName = "Shiris";
	String lastName = "Deshpande";
	//private int age = 60;
	
	public void displayName() {
		System.out.println(this.firstName +" "+ this.lastName);
	}
}

class SonA extends FatherA{
	String sName = "Chinmay";
	
	public void displaySName() {
		System.out.println(this.sName +" "+this.lastName);
	}
}


class FatherB{
	String firstName = "Shirish";
	String lastName = "Deshpande";
	
	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
}

class SonB extends FatherB{
	String sName = "Chinamy";
	
	public void displaySname() {
		System.out.println(this.sName + this.lastName);
	}
}


class FatherC{
	String firstName;
	String lastName;
	
	public FatherC(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}
	
	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
}

class SonC extends FatherC{
	String sName;
	public SonC(String fn, String ln, String sn) {
		super(fn,ln);
		this.sName = sn;
	}
	
	public void displaySname() {
		System.out.println(this.sName + this.lastName);
	}
}

