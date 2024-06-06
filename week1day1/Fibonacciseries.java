package week1.day1;


public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//define all variables
		int a = 0;
		int b = 1;
		int c;
		int count = 10;
		
		System.out.println(a);
		System.out.println(b);
		
		//open for loop
		for (int i = 2; i < count; i++) {
			c = a+b;
			System.out.println(c);
			a = b;
			b = c;
			
		}
			
		
	}

}
