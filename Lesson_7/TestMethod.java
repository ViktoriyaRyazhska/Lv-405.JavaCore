package Lesson_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestMethod {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int e = Integer.parseInt(br.readLine());
		switch (e) {
		case 1:
			Qtraine();
			break;
		case 2:
			task1();
			break;
		}
	}

	public static int Qtraine() {

		int Q = 1000;
		System.out.println("Вага поїзда становить - " + Q + "т.");
		return Q;

	}

	public static int task1() {
		String q1 = "IT";
		String q2 = "IT Acadeny";
		System.out.println(q2.contains(q1));
		System.out.println("----------------------------------");
		System.out.println("");
		return 0;
	}
}
