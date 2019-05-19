package Lesson_4_HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numbers {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Read 3 float numbers and check: are they all belong to the range [-5,5]");
		System.out.println("Input please number:");
		float a = Integer.parseInt(br.readLine());
		System.out.println("another number");
		float s = Integer.parseInt(br.readLine());
		System.out.println("and another number");
		float d = Integer.parseInt(br.readLine());
		System.out.println("You input: " + a + ", " + s + " and " + d);

		if (a > -5 & a < 5) {
			System.out.println(a + " - belongs to the range [-5,5]");
		} else
			System.out.println(a + " - not belongs to the range [-5,5]");
		if (s > -5 & s < 5) {
			System.out.println(s + " - belongs;");
		} else
			System.out.println(s + " - not belongs;");
		if (d > -5 & d < 5) {
			System.out.println(d + " - belongs;");
		} else
			System.out.println(d + " - not belongs;");
		System.out.println("------------------------------------------------------------------------");
		System.out.println();
		System.out.println("Read 3 integer numbers and write max and min of them");
		System.out.println("Input please number:");
		int q = Integer.parseInt(br.readLine());
		System.out.println("another number");
		int w = Integer.parseInt(br.readLine());
		System.out.println("and another number");
		int e = Integer.parseInt(br.readLine());
		System.out.println("You input: " + q + ", " + w + " and " + e);

		int max;
		int min;
		max = q;
		min = q;

		if (max < w) {
			max = w;
		}
		if (max < e) {
			max = e;
		}
		;

		if (min > w) {
			min = w;
		}
		if (min > e) {
			min = e;
		}

		System.out.println("max - " + max);
		System.out.println("min - " + min);
	}
	
}	
	
 