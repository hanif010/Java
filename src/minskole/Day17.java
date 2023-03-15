package minskole;

public class Day17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Information.country);
		Information.displayCountryName();
		
		Information a = new Information(12);
		a.displayCityName();
		a.displayCountryName();
		
	}

}

class Information{
	
	static String country = "India";
	int age;
	
	public Information(int age){
		this.age = age;
	}
	
	public static void displayCountryName() {
		System.out.println(Information.country);
	}
	
	public void displayCityName() {
		System.out.println("Pune");
	}
}
