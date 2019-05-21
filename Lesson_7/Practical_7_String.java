package Lesson_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Practical_7_String {

	public static void main(String[] args) throws IOException {
		String q1 = "IT";
		String q2 = "IT Acadeny";
		System.out.println(q2.contains(q1));
		System.out.println("----------------------------------");
		System.out.println("");
		
		System.out.println("Hello dear, what is your full name?");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String fullName = br.readLine();
		System.out.println("Your full name is " + fullName);
		
		String [] arr = fullName.split(" ");
		System.out.println(Arrays.toString(arr));
		String n1 = arr[0];
		String n2 = arr[1];
		String n3 = arr[2];
		
		System.out.println("full name is " + n1 +" "+n2 + " "+n3);
	}

}
