package Lesson_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Operators {

	public static int number;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input please number ");
		int a = Integer.parseInt(br.readLine());
		System.out.println("another number ");
		int s = Integer.parseInt(br.readLine());
		System.out.println("and another number ");
		int d = Integer.parseInt(br.readLine());

		if (a % 2 != 0) {
			System.out.println(a + " is odd");
			number++;
		}
		if (s % 2 != 0) {
			System.out.println(s + " is odd");
			number++;
		}
		if (d % 2 != 0) {
			System.out.println(d + " is odd");
			number++;
		}
		System.out.println("quantity of odd numbers is " + number);
		System.out.println("-------------------------------------------------");
	}
	
	
	
	
	
	
}
