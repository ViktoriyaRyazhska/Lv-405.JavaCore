package Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PositiveNumbers {

	public static void main(String[] args) throws Exception, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Write number");
		
		int i = Integer.parseInt(br.readLine());
		int product = i;
		while (i>=0) {
		
		System.out.println("Write number");
		i = Integer.parseInt(br.readLine());
		if (i>=0) {
			product *= i;
		}
		continue;
		

	}
	System.out.println("The product is" + product);
		
	}

}
