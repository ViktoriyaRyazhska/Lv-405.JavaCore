package homework_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework_4_4 {

	public static void main(String[] args) throws IOException {
		
		int int1 = 1;
		int product = 1;
		int a = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("������ ������� ����'��� ��� �����.");
		System.out.println("�������� ���������� ��� ������� ��'������ ����.");
		System.out.println("� ������ ������� ��� ������ �����.");
		
		while (int1 >= 0) {	// ��� �� ������� ���'��� �������� ��� ������. ������ � ������� ������� ������ ���� �����. � ���� �� ��������.
		int1 = Integer.parseInt(br.readLine());
			if (int1 >= 0 && (int1 % 2) == 0) {
				product = product * int1;
				a++;
			} else if (int1 < 0) {break;}
		}
		if (a == 0) {
			System.out.println("���� ������ �� ���� ������");
		} else {
			System.out.println("������� ��� ����� ������ ����� = " + product +".");
		}
		
	}

}
