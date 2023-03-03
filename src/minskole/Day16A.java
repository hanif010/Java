package minskole;

public class Day16A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SBH sbh = new SBH("Bijapur","India");
		sbh.card();
		sbh.discount();
		sbh.loan();
		sbh.save();
	}

}
interface WB{
	public void save();
	public void loan();
	public void discount();
}

abstract class SBIf{
	String city;
	String country;
	
	public SBIf(String ct, String cn) {
		this.city = ct;
		this.country = cn;
	}
	
	abstract public void card();
	
	public void displayCountry() {
		System.out.println(this.country);
	}
}

class SBH extends SBIf implements WB{
	
	public SBH(String ct,String cn) {
		super(ct,cn);
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("Save SBH");
	}

	@Override
	public void loan() {
		// TODO Auto-generated method stub
		System.out.println("LOan SBH");
	}

	@Override
	public void discount() {
		// TODO Auto-generated method stub
		System.out.println("Discount SBH");
	}

	@Override
	public void card() {
		// TODO Auto-generated method stub
		System.out.println("Card...");
	}
	
}