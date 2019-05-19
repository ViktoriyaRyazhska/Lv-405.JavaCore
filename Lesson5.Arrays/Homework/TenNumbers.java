package Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TenNumbers {

	public static void main(String[] args) throws Exception, IOException {
		int[] number = new int[10];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Write numbers");
		for (int i = 0; i < number.length; i++) {
			number[i] = Integer.parseInt(br.readLine());

		}

		boolean check = true;
		int sum = 0;
		int product = number[5];
		for (int i = 0; i < number.length; i++) {
			if (number[i] >= 0) {
				check = true;
				continue;
			} else {
				check = false;
				break;
			}

		}

		if (check == true) {
			for (int i = 0; i < 5; i++) {
				sum += number[i];
			}
			System.out.println("Sum of first 5 elements = " + sum);
		} else {
			for (int i = 5; i < number.length; i++) {
				product *= number[i];
			}
			System.out.println("Product of first 5 elements = " + product);
		}

	}
}
