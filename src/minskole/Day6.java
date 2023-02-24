package minskole;

import java.util.Arrays;

public class Day6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] names = new String[5];
		
		names[0] = "Poorva";
		names[1] = "Mayuri";
		names[2] = "Sarika";
		names[3] = "Abhisha";
		names[4] = "Komal";
		
		// retrive
		System.out.println(names[0]);
		
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		String [] cities = {"Pune", "Mumbai","Banglore","Kolkata","Chennai"};
		for(int i = cities.length-1; i >= 0; i --) {
			System.out.println(cities[i]);
		}
		
		String info = "I am learning js";
		String [] sy = info.split(" ");
		String [] sy2 = info.split("a");
		
		System.out.println(Arrays.toString(sy));
		System.out.println(Arrays.toString(sy2));
		
		// Program 2
		
		String city = "Nagpur";
		char [] kl = city.toCharArray();
		System.out.println(kl);
		System.out.println(Arrays.toString(kl));
		
		// Program 3
		
		String [] name = {"Amol","Sarika","Poorva","Sachin","Satish"};
		for(int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		
		for(String s:name) {
			System.out.println(s);
		}
	
		// Program 4
		
		char [] nn = {'a','m','o','l'};
		String rev = "";
		for(char s:nn) {
			rev = s + rev;
		}
		System.out.println(rev);
		
		// Program 5
		
		int [] numberA = {11,22,33,44,55,66,77};
		float avg = 0;
		int sumA = 0;
		
		for(int j:numberA) {
			sumA = sumA + j;
		}
		avg = sumA/numberA.length;
		System.out.println(avg);
	}

}
