package Lesson_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practical_7_String {

	public static void main(String[] args) throws IOException {
		System.out.println("Hello dear, this is lesson 7");
		System.out.println("1 task: type String «IT» and «IT Academy»");
		System.out.println("2 task: surname, name and patronymic»");
		System.out.println("3 task: checking the user name for validity»");
		System.out.println("4 exit");
		for (int m = 0; m < 4 || m > 4;) {
			System.out.println("choose a task 1-4");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			m = Integer.parseInt(br.readLine());
			switch (m) {
			case 1:
				task1();
				break;
			case 2:
				task2();
				break;
			case 4:
				System.out.println("Godbye");
				System.out.println("----------------------------------");
				break;
			default:
				System.out.println("Wrong");
				System.out.println("----------------------------------");
				break;
			}
		}
	}

	public static int task1() {
		String q1 = "IT";
		String q2 = "IT Acadeny";
		System.out.println(q2.contains(q1));
		System.out.println("----------------------------------");
		System.out.println("");
		return 0;
	}

	public static int task2() throws IOException {
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("What is your full name?");
//		String fullName = br1.readLine();
		String fullName = "Petryshyn Andry Myhajlovich";
//		System.out.println("Your full name is " + fullName);
		String[] arr = fullName.split(" ");
//		System.out.println(Arrays.toString(arr));
		String n1 = arr[0];
		String n2 = arr[1];
		String n3 = arr[2];
		System.out.println("Your full name is " + n1 + " " + n2 + " " + n3);
				
		String patern = "[A-Z]+";
		String initials = n2 + n3;
		Pattern p = Pattern.compile(patern);
		Matcher m = p.matcher(initials);
		System.out.print("- "+n1 + " ");
		while (m.find()) {
	        System.out.print(initials
				.substring(m.start(), m.end()) + ".");
	  }System.out.println(";");
	  System.out.println("- "+n2+";");
	  System.out.println("- "+n2+" "+ n3+" "+ n1+";");
	  System.out.println("----------------------------------");
		System.out.println("");
		return 0;
	}




}
