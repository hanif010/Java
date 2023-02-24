package minskole;

public class Day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//String str = "I";
		//String str2 = "learning";
		//String str3  = "javaScript";
		//String h = String.join("@",str,str2,str3);
		//System.out.println(h);
		
		// Program 2
		
		String city = "pune";
		int q1 = city.indexOf("u");
		int q2 = city.indexOf("U");
		System.out.println(q1);
		System.out.println(q2);
		
		
		String firstname = "Chinmay Deshpande";
		int q3 = firstname.indexOf("a",6);
		System.out.println(q3);
		
		for(int i = 0; i < firstname.length(); i++) {
			if(firstname.charAt(i) == 'a') {
				System.out.println(i);
			}
		}
		
		// Trim()
		
		String city2 = " Pune ";
		System.out.println(city2.length());
		String q12 = city2.trim();
		System.out.println(q12.length());
		
		
		//Replace()
		
		
		String city3 = "Nagpur";
		String q13 = city3.replace("a","i");
		System.out.println(q13);
		
		
		//isEmpty()
		
		String city4 = "";
		String city5 = "Solapur";
		
		boolean q15 = city4.isEmpty();
		System.out.println(q15);
		
		boolean q16 = city5.isEmpty();
		System.out.println(q16);
		
		
	}

}
