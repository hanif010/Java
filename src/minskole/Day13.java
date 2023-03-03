package minskole;

public class Day13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cal ca =new Cal();
		ca.add(12, 8);
		ca.add(12, 12, 6);
		ca.add(12, 12, 12, 4);
		
	
//		Person12 a1 = new Person12();
//		Person12 a2 = new Person12(12,12);
//		Person12 a3 = new Person12(12,12,12);
		
		HDFC hdf = new HDFC("India","Pune",25,586101);
		System.out.println(hdf.city);
		System.out.println(hdf.country);
		System.out.println(hdf.pinCode);
		
		hdf.save(1200);
		hdf.Loan(1400);
		
	}

}

class Cal{
	 public void add(int x , int y) {
		 System.out.println(x+y);
	 }
	 
	 public void add(int x, int y, int z) {
		 System.out.println(x+y+z);
	 }
	 
	 public void add(int x, int y, int z, int a) {
		 System.out.println(x+y+z+a);
	 }
}


class Person12 {
	
	public Person12() {
		System.out.println("Default constror is called");
	}
	
	
	public Person12(int x, int y) {
		System.out.println("Constructor called with 2 Param");
	}
	
	public Person12(int x, int y, int z) {
		System.out.println("Constructor called with 3 param");
	}
}

//overriding

class WorldBank12{
	String country;
	String city;
	int loan;
	
	public WorldBank12(String cn, String ct, int ln) {
		this.country = cn;
		this.city = ct;
		this.loan = ln;
	}
	
	public void loan(int x) {
		System.out.println("WB loan" + x);
	}
	
	public void save(int y) {
		System.out.println("WB save" + y);
	}
}

class HDFC extends WorldBank12{
	int pinCode;
	public HDFC(String cn, String ct, int ln , int pc) {
		super(cn, ct, ln);
		this.pinCode = pc;
	}
	
	public void Loan(int x) {
		System.out.println("HDFC Loan" + x);
	}
	
	public void save(int y) {
		System.out.println("HDFC save" + y);
	}	
	
}


