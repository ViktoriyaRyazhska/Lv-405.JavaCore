package Lesson_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practical_7_Area {

	public static void main(String[] args) throws Exception {
		
		try {
//			area();
			System.out.println("����� ������������ ��������� - "+area());
		} catch (Exception e) {
			System.err.println(e.getMessage() + "\n");
//			e.printStackTrace();
		}

	}

	public static int area() throws Exception {
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("������ ������� ���� �������");
		int a = Integer.parseInt(br1.readLine());
		System.out.println("������ ������� ����� �������");
		int b = Integer.parseInt(br1.readLine());

		if (a <= 0 | b <= 0)
			throw new Exception("������� ����� �����");

		int S = a * b;

		return S;
	}

}
