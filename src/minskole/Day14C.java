package minskole;

public class Day14C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		ICICI ic = new ICICI();
		ic.loan();
		ic.save();
		ic.repo();
	}

}
interface WorldBankE{
	
	public void save();
	public void loan();
}

interface RBI{
	public void repo();
}

class ICICI implements WorldBankE,RBI{

	@Override
	public void repo() {
		// TODO Auto-generated method stub
		System.out.println("repo");
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("Save");
	}

	@Override
	public void loan() {
		// TODO Auto-generated method stub
		System.out.println("Loan");
	}
	
}
