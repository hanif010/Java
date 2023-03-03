package minskole;

public class Day14A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SBIb aaa = new SBIb("Pune","India",58610);
		System.out.println(aaa.city);
		System.out.println(aaa.country);
		System.out.println(aaa.pinCode);
		
		aaa.loan();
		aaa.save();
		aaa.displayCountryName();
		
		PNBb ppp = new PNBb("Pune","India");
		System.out.println(ppp.city);
		System.out.println(ppp.country);
		
		ppp.save();
		ppp.loan();
		ppp.displayCountryName();
	}

}

abstract class WorldBanka{
	String city;
	String country;
	
	public WorldBanka(String ct, String cn) {
		this.city = ct;
		this.country = cn;
	}
	
	// Abstract method
	abstract public void save();
	abstract public void loan();
	
	public void displayCountryName() {
		System.out.println("India");
	}
}

class SBIb extends WorldBanka{
	int pinCode;
	
	public SBIb(String ct, String cn, int pc) {
		super(ct,cn);
		this.pinCode = pc;
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("Save method SBI");
	}

	@Override
	public void loan() {
		// TODO Auto-generated method stub
		System.out.println("Loan method SBI");
	}
}

class PNBb extends WorldBanka{
	
	public PNBb(String ct, String cn) {
		super(ct,cn);
	}
	
	public void save() {
		System.out.println("Save method PNB");
	}
	
	public void loan() {
		System.out.println("Loan method PNB");
	}
}