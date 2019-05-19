package Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Month {

	public static void main(String[] args) throws Exception, IOException {
		int month[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Choose the number of the month");
		int monthNumber = Integer.parseInt(br.readLine());
		System.out.println("At this month we have " + month[monthNumber - 1] + "days");

	}

}
