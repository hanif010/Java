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
		
		int s1 = 8900;
		int s2 = 9999;
		int s3 = 10000;
		
//		if(s1 > s2 && s1 > s3) {
//			System.out.println("S1 is Grater");
//		}
//		else if(s2 > s1 && s2 > s3) {
//			System.out.println("S2 is Grater");
//		}
//		else if(s3 > s1 && s3 > s2) {
//			System.out.println("S3 is Grater");
//		}
		
		if(s1 > s2) {
			if(s1 > s3) {
				System.out.println("S1 is Grater");
			}
		}
		else if(s2 > s1) {
			if(s2 > s3) {
				System.out.println("S2 is Grater");
			}
			else {
				System.out.println("S3 is Grater");
			}
		}
		
		// Switch case
		
		String city = "Indore";
		
		switch(city) {
			case "Pune":
				System.out.println("MH");
			case "Indore":
				System.out.println("MP");
			case "Jaipur":
				System.out.println("RJ");
			default:
				System.out.println("Incorrect city");
		}
		
		String city2 = "Pune";
		
		switch(city2) {
		case "Pune":
			System.out.println("MH");
			break;
		case "Indore":
			System.out.println("MP");
			break;
		case "Jaipur":
			System.out.println("RJ");
		default:
			System.out.println("Incorrect city");
		}
		
		
		String city3 = "Bhopal";
		
		switch(city3) {
		case "Pune":
		case "Nagpur":
			System.out.println("MH");
			break;
		
		case "Indore":
		case "Bhopal":
			System.out.println("MP");
			break;
			
		case "Jaipur":
		case "Udaipur":
			System.out.println("RJ");
			break;
			
		default:
			System.out.println("Incorrect city");
		}
		
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		
		// For and While loop
		
		for(int i = 0; i <= 3; i++) {
			System.out.println(i);
		}
		
		for(int i = 0; i <= 3; i++) {
			System.out.println("Hello");
		}
		
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		
		for(int i = 5; i >= 1; i--) {
			System.out.println(i);
		}
		
		for(int i = 4; i <= 40; i = i + 4) {
			System.out.println(i);
		}
		
		for(int i = 0; i <= 5; i++) {
			if(i == 3) {
				break;
			}
			System.out.println(i);
		}
		
		for(int i = 0; i <= 5; i++) {
			System.out.println(i);
			if(i == 3) {
				break;
			}
		}
		
		for(int i = 0; i <= 5; i++) {
			if(i == 3 ) {
				continue;
			}
			System.out.println(i);
		}
		
		//Print 1 - 5
		int q1 = 1;
		while(q1 <= 5) {
			System.out.println(q1);
			q1++;
		}
		
		//Print hello 5 times
		int q2 = 1;
		while(q2 <= 5) {
			System.out.println("Hello");
			q2++;
		}
		
		// Print 5-1
		int q3 = 5;
		while(q3 >= 1) {
			System.out.println(q3);
			q3--;
		}
		
		//Print table of 2
		
		int q4 = 2;
		while(q4 <= 20) {
			System.out.println(q4);
			q4 = q4 + 2;
		}
		
		int q5 = 2;
		while(q5 <= 20) {
			if(q5 == 6) {
				break;
			}
			System.out.println(q5);
			q5 = q5 + 2;
		}
		
		int q6 = 2;
		while(q6 <= 20) {
			if(q6 == 6) {
				q6 = q6 + 2;
				continue;
			}
			System.out.println(q6);
			q6 = q6 + 2;
		}
		
	}

}
