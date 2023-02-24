package minskole;

//import java.util.Arrays;

public class Day7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers = new int[5];
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
		numbers[4] = 5;
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		for(int s:numbers) {
			System.out.println(s);
		}
		
		//Program 2
		int [][] numbersC = new int[3][4];
		numbersC[0][0] = 11;
		numbersC[0][1] = 22;
		numbersC[0][2] = 33;
		numbersC[0][3] = 44;
		
		numbersC[1][0] = 11;
		numbersC[1][1] = 22;
		numbersC[1][2] = 33;
		numbersC[1][3] = 44;
		
		numbersC[2][0] = 55;
		numbersC[2][1] = 66;
		numbersC[2][2] = 77;
		numbersC[2][3] = 88;
		
		for(int i = 0; i < numbersC.length; i++) {
			int [] r = numbersC[i];
			for(int j = 0; j < r.length; j++) {
				System.out.println(r[j]);
			}
		}
		
		int [][] numbersD = {
				{11,22,33,44},
				{55,66,77,88},
				{99,110,120,130}
		};
		
		for(int i = 0; i < numbersD.length; i++) {
			//System.out.println(Arrays.toString(numbersD[i]));
			int [] row = numbersD[i];
			for(int j = 0; j < row.length; j ++) {
				System.out.println(row[j]);
			}
		}
		
		//For each
		for(int [] row:numbersD) {
			for(int col:row) {
				System.out.println(col);
			}
		}
		
		for(int [] row2:numbersC) {
			for(int col2:row2) {
				System.out.println(col2);
			}
		}
	}

}
