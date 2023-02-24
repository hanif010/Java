package minskole;

public class R {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Poorva";
		char [] aa = a.toCharArray();
		for(char a1:aa) {
			System.out.println(a1);
		}
		
		// Conditional Statements
		
		int numT = 5;
		if(numT > 0 && numT <= 5) {
			System.out.println("10% Discount");
		}
		if(numT > 5 && numT <= 10) {
			System.out.println("20% Discount");
		}
		if(numT > 10 ) {
			System.out.println("30% Discount");
		}
		
		int numT2 = 11;
		if(numT2 > 0 && numT2 <= 5) {
			System.out.println("10% Discount");
		}
		else if(numT2 > 5 && numT2 <= 10) {
			System.out.println("20% Discount");
		}
		else if(numT2 > 10) {
			System.out.println("30% Discount");
		}
		else {
			System.out.println("Please Enter correct input");
		}
		
		
		int marks = 92;
		
		if(marks > 90) {
			System.out.println("A Grade");
		}
		if(marks > 75) {
			System.out.println("B Grade");
		}
		if(marks > 65) {
			System.out.println("C Grade");
		}
		
		int marks1 = 91;
		if(marks1 > 90) {
			System.out.println("A Grade");
		}
		else if(marks1 > 75) {
			System.out.println("B Grade");
		}
		else if(marks1 >65) {
			System.out.println("C grade");
		}
		
		// Conditional statement
		
		int a1 = 10;
		int b1 = 50;
		
		if(a1 > b1) {
			System.out.println("A is Grater");
		}
		else {
			System.out.println("B is Grater");
		}
		
		String y = a1>b1?"A1 is grater":"B1 is grater";
		System.out.println(y);
		
		
	}

}
