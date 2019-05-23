package Lesson_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practical_7_Area {

	public static void main(String[] args) throws Exception {
		
		try {
//			area();
			System.out.println("Площа прямокутника становить - "+area());
		} catch (Exception e) {
			System.err.println(e.getMessage() + "\n");
//			e.printStackTrace();
		}

	}

	public static int area() throws Exception {
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Введіть довжину однієї сторони");
		int a = Integer.parseInt(br1.readLine());
		System.out.println("Введіть довжину другої сторони");
		int b = Integer.parseInt(br1.readLine());

		if (a <= 0 | b <= 0)
			throw new Exception("Введено відємне число");

		int S = a * b;

		return S;
	}

}
