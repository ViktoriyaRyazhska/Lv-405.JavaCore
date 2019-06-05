package Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskOne {
//	public static void main(String[] args) throws Exception, IOException {
//
//
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Input number");
//		int n = Integer.parseInt(br.readLine());
		int[] number = new int [n];
		number[0] = 0;
		number[1] = 1;
		System.out.print(number[0] + " ");
		System.out.print(number[1] + " ");

		for (int i = 2; i < n; i++) {
			number[i] = number[i - 1] + number[i - 2];
		System.out.print(number[i] + " ");


	}
	}
}