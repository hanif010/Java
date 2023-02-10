
public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		System.out.println(x);
		
		String firstname = "Chinmay";
		System.out.println(firstname);
		
		//Arithmetic Operation	
		
		int a = 100;
		int b = 50;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		int x1 = 10;
		int y1 = 5;
		
		System.out.println(x1+y1);
		System.out.println(x1-y1);
		System.out.println(x1*y1);
		System.out.println(x1/y1);
		System.out.println(x1%y1);
		
		
		
		add(12,4);
		
		
		addA();
		addA();
		addA();
	
		addB(25,25);
		addB(35,35);
		
		int a1 = addC(56,44);
		System.out.println(a1);
		System.out.println(a1*2);
		System.out.println(a1-10);
		
		
	}
	
	public static void add(int a, int b) {
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	}
	
	
	// basic functions
	
	// function without parameter and without return type
	
	public static void addA() {
		System.out.println(9+9);
	}
	
	// function with parameter and without return type
	
	public static void addB(int x, int y) {
		System.out.println(x+y);
	}
	
	// function with parameter and with return type
	
	public static int addC(int x, int y) {
		return x + y;
	}

}
