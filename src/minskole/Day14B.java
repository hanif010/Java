package minskole;

public class Day14B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SBID cc = new SBID();
		cc.save();
		cc.loan();
		cc.discount();
	}

}

interface WorldBankD{
	abstract public void loan();
	abstract public void save();
	abstract public void discount();
}

class SBID implements WorldBankD{
	public void loan() {
		System.out.println("Loan SBI");
	}
	
	public void save() {
		System.out.println("Save SBI");
	}
	
	public void discount() {
		System.out.println("Discount SBI");
	}
}