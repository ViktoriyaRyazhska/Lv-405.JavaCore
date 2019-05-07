package Lesson_4;

public class Operators {
	
	public static int number;

	public static void main(String[] args) {
		int a=2, s=3, d=5;
		if (a % 2 != 0 ) {
			System.out.println(a + " is odd");
			number++;
		}
		if (s % 2 != 0 ) {
			System.out.println(s +  " is odd");
			number++;
		}
		if (d % 2 != 0 ) {
			System.out.println(d   + " is odd");
			number++;
		}
System.out.println("quantity of odd numbers is " + number);
	}

	
	
	
}


