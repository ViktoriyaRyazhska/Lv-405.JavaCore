package Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FiveNumbers {

	public static void main(String[] args) throws Exception, IOException {

		int[] number = new int[5];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Write numbers");
		for (int i = 0; i < number.length; i++) {
			number[i] = Integer.parseInt(br.readLine());

		}

		int pos = 0;
		for (int i = 0; i < number.length; i++) {
			if (number[i] > 0) {
				pos++;
			if (pos == 2) {
				System.out.println("Second positive number at position " + (i+1));
			}
				
			}
		}
		
		int min = number[0];
		int j=0;
		int minj = 0;
		 while (j<number.length) {
			 if (number [j] <min) {
				 min = number[j];
				 minj=j;
			 }
			 j++;
		 }
		 
		 System.out.println("Minimum number is " + min + " at " + (minj +1) + " position");
		


	}

}
