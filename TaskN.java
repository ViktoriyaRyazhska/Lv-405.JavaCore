package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskN {

	public static void main(String[] args) throws Exception {

		System.out.println("Hello dear, this is Tasks Java");
		System.out.println("1 task: 1.Input number and generate Fibonacci sequence");
		System.out.println("2 task: 4.Input string and calculate number of loud letters ");
		System.out.println("3 task: 5.Input string and check if this string is palindrome ");
		System.out.println("4 task: 6.Input text and calculate number of words in this text");
		System.out.println("5 task: 7.Input number n and calculate n!");
		System.out.println("6 exit");
		for (int m = 0; m < 6 || m > 6;) {
			System.out.println("choose a task 1-6");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			m = Integer.parseInt(br.readLine());
			switch (m) {
			case 1:
				TaskOne t1 = new TaskOne();
				t1.task1();
				break;
			case 2:
				Task4 t4 = new Task4();
				t4.task4();
				break;
			case 3:
				Task5 t5 = new Task5();
				
				System.out.println(t5.isPalindrome("addda"));
				break;
			case 4:
				Task7 t7 = new Task7();
				System.out.println(t7.getFactorial(br));
				break;
			case 5:

				break;
			case 6:
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

}
