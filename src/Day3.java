
public class Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//charAt()
		
		String city = "pune";
		for(int i = 0; i < city.length(); i++) {
			System.out.println(i);
			System.out.println(city.charAt(i));
		}
		
		String city2 = "Nagpur";
		char q1 = city2.charAt(1);
		System.out.println(q1);
		
		//length()
		
		int le = city2.length();
		System.out.println(le);
		
		for(int i = 0; i < le; i++) {
			System.out.println(city2.charAt(i));
		}
		
		// Reverse string()
		
		String city3 = "pune";
		String rev = "";
		
		for(int i = 0; i < city3.length(); i++) {
			rev = city3.charAt(i) + rev;
		}
		
		System.out.println(rev);
		
		String rev2 = "";
		for(int i = city3.length()-1; i >= 0 ; i--) {
			rev2 = rev2 + city3.charAt(i);
		}
		System.out.println(rev2);
		
		
		
		// Program 
		
		String fruits = "Apple mango banana grapes papaya";
		String userinput = "Apple";
		
		if(fruits.contains(userinput)) {
			System.out.println("Fruit Available");
		}
		else {
			System.out.println("Fruit is Not Available");
		}
		
		// Program 
		
		String nameA = "Chinamayou";
		String vowels = "aeiou";
		int count = 0;
		
		for(int i = 0; i<nameA.length();i++) {
			if(nameA.charAt(i) == 'a' || nameA.charAt(i) == 'e' || nameA.charAt(i) == 'i' || nameA.charAt(i)== 'o' || nameA.charAt(i) == 'u') {
				count = count + 1;
			}
		}
		
		System.out.println(count);
		
		
		
		// Program 
		
		String h = "Javascript";
		String j = h.substring(1,5);
		String j1 = h.substring(2);
		String j2 = h.substring(8);
		System.out.println(j);
		System.out.println(j1);
		System.out.println(j2);
		
		
		
		revSt("nagpur");
		revSt("pune");
		revSt("wardha");
		
	}
	
	public static String revSt(String city3) {
		String rev3 = "";
		for(int i = city3.length()-1; i >= 0; i--) {
			rev3 = rev3 + city3.charAt(i);
		}
		System.out.println(rev3);
		return rev3;
	}

}
