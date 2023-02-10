
public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstname = "Hanif Jamadar";
		System.out.println(firstname);
		
		
		
		//Basic
		
		System.out.println("Hello"+2);
		System.out.println("2"+2);
		System.out.println(4+2);
		System.out.println("5"+"66");
		
		// Methods 
		// Length
		
		String firstname2 = "Rohan";
		int q1 = firstname2.length();
		System.out.println(q1);
		
		// Ex
		
		String city = new String("Pune");
		System.out.println(city);
		
		//toUpperCase
		
		String city2 = "Wardha";
		String q2 = city2.toUpperCase();
		System.out.println(q2);
		
		//toLowerCase
		
		String city3 = "NAGPUR";
		String q3 = city3.toLowerCase();
		System.out.println(q3);
		
		//Method Chaining
		
		String city4 = "Jaipur";
		city4.toUpperCase().toLowerCase().length();
		
		// Equals()
		
		String city5 = "pune";
		String city6 = "Pune";
		String city7 = "mumbai";
		
		System.out.println(city5.equals(city7));
		System.out.println(city5.equals(city6));
		
		// If else Statement
		
		if(city5.equals(city6)) {
			System.out.println("Same City");
		}
		else {
			System.out.println("Different city");
		}
		
		
		if(city5.equalsIgnoreCase(city6)) {
			System.out.println("Same City");
		}
		else {
			System.out.println("Different city");
		}
		
		
		//Ternary 
		
		String a = city5.equals(city7)?"Equal":"Not equal";
		System.out.println(a);
		
		
		// StartsWith()
		
		String city8 = "ujjain";
		boolean q33 = city8.startsWith("u");
		boolean q34 = city8.startsWith("ujj");
		System.out.println(q33);
		System.out.println(q34);
		
		//EndsWith()
		
		String city9 = "delhi";
		boolean q35 = city9.endsWith("i");
		boolean q36 = city9.endsWith("hi");
		System.out.println(q35);
		System.out.println(q36);
		
		// Contains()
		
		String j = "I am Learning java";
		boolean q37 = j.contains("am");
		System.out.println(q37);
		
		
		
	}

}
