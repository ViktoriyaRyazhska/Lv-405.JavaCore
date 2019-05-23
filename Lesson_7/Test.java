package Lesson_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Hello dear, what is your full name?");
		String fullName = br.readLine();
		System.out.println("Your full name is " + fullName);
		String[] arr = fullName.split(" ");
		System.out.println(Arrays.toString(arr));
		String n1 = arr[0];
		String n2 = arr[1];
		String n3 = arr[2];
		System.out.println("Your full name is " + n1 + " " + n2 + " " + n3);

		String pattern1 = "[A-Z]+";
		Pattern p= Pattern.compile(pattern1);
		Matcher m = p.matcher(n1);
		while (m.find()) {
			System.out.print(n1.substring(m.start(), m.end()) + "*");
		}
		
	}

}
