package Lesson_5_HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array {

	public static void main(String[] args) throws NumberFormatException, IOException {
//		System.out.println(task1());
//		System.out.println(task2());
//		System.out.println(task3());
		System.out.println("Sum all entered even numbers - " + task4());
	}

	public static int task1() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int monthDay[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String monthName[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		System.out.println("Enter the number of month: 1-12");
		int m = Integer.parseInt(br.readLine()) - 1;
		System.out.println(monthName[m] + " has " + monthDay[m] + " days.");
		return 0;
	}

	public static int task2() {
		int array[] = { -31, 128, 231, -310, 131, 230, -31, 231, 430, -331 };
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			if (array[i] > 0) {
				sum += array[i];
			}
		}
		System.out.println("Sum of first 5 elements (only positive) is - " + sum);

		int array2[] = new int[5];
		int j = 0;
		for (int i = 5; i < array.length; i++) {
			array2[j] = array[i];
			j++;
			System.out.println("* i" + i + " - " + array[i]);
		}
		System.out.print("array2: {");
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + ", ");
		}
		System.out.println("}");
		return 0;
	}

	public static int task3() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int array3[] = new int[5];
		System.out.println("Enter 5 integer numbers");
		for (int i = 0; i < 5; i++) {
			System.out.println("Input number");
			array3[i] = Integer.parseInt(br.readLine());
//			System.out.println("* id" + i + " - " + array3[i]);
		}
		System.out.print("array3: {");
		for (int i = 0; i < array3.length; i++) {
			System.out.print(array3[i] + ", ");
		}
		System.out.println("}");

		int j = 1;
		for (int i = 0; i < array3.length; i++) {
			if (j == 2 & array3[i] > 0) {
				System.out.println("Second positive number - " + array3[i] + ", id position - " + i);
				break;
			}
			if (array3[i] > 0) {
				j++;
			}

		}
		int min = array3[0];
		int idMin = 0;
		for (int i = 0; i < array3.length; i++) {
			if (array3[i] < min) {
				min = array3[i];
				idMin = i;
			}
		}
		System.out.println("minimum = " + min + " is in " + (idMin + 1) + " place");
		System.out.println();

		return 0;
	}

	public static int task4() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		int j = 2;
		System.out.println("Enter integer numbers");
		for (int a = 0; a >= 0; a++) {
			System.out.println("Input number");
			j = Integer.parseInt(br.readLine());
			if (j < 0) {
				break;
			}
			if (j % 2 == 0) {
				sum = sum + j;
			}
			System.out.println(sum);
		}
		return sum;
	}
}
