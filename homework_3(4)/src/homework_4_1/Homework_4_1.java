package homework_4_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework_4_1 {

	public static void main(String[] args) throws IOException {
		
		// �������� �1
		// ��������� �������
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�� �� ���� ����� ������ � ������� �� -5 � 5 ?");
		System.out.println("������, ���� �����, ���� ��� ���� ����� �� -10 �� 10");
		float flnu1 = Float.parseFloat(br.readLine());
		System.out.println("���� ����� �����= " + flnu1);
		float flnu2 = Float.parseFloat(br.readLine());
		System.out.println("���� ����� �����= " + flnu2);
		float flnu3 = Float.parseFloat(br.readLine());
		System.out.println("���� ���� �����= " + flnu3);
		
		// ��������� � ���� ����������
		System.out.println("���� �����: " + flnu1 + "; " + flnu2 + "; " + flnu3 + "; ");
		System.out.println("�� �� ���� ����� � � ������� �� -5 �� 5 ?");
		if ((-5 <= flnu1 && flnu1 <= 5) && (-5 <= flnu2 && flnu2 <= 5) && (-5 <= flnu3 && flnu3 <= 5)) {
			System.out.println("³������: ���");
		} else {
			System.out.println("³������: �");
		}
		
		// ��������, �������� �2
		// ��� �����
		System.out.println();
		System.out.println("������ 3-� ���� ��� �����");
		int innu1 = Integer.parseInt(br.readLine());
		System.out.println("���� �����: " + innu1);
		int innu2 = Integer.parseInt(br.readLine());
		System.out.println("���� �����: " + innu1 + "; " + innu2);
		int innu3 = Integer.parseInt(br.readLine());
		System.out.println("���� �����: " + innu1 + "; " + innu2 + "; " + innu3);
		
		// ���������, � ���� ���������� ��� �������� � �������� �����.
		if (innu2 < innu1 && innu3 < innu1) {
			System.out.println("�������� �����= " + innu1);
		} else if (innu1 < innu2 && innu3 < innu2) {
			System.out.println("�������� �����= " + innu2);
		} else if (innu1 < innu3 && innu2 < innu3) {
			System.out.println("�������� �����=" + innu3);
		} else if (innu1 == innu2 && innu1 > innu3) {
			System.out.println("�������� ����� : " + innu1 + " � " + innu2);		
		} else if (innu2 == innu3 && innu2 > innu1) {
			System.out.println("�������� ����� : " + innu2 + " � " + innu3);
		} else if (innu3 == innu1 && innu3 > innu2) {
			System.out.println("�������� ����� : " + innu3 + " � " + innu1);
		}
		
		if (innu2 > innu1 && innu3 > innu1) {
			System.out.println("�������� �����= " + innu1);
		} else if (innu1 > innu2 && innu3 > innu2) {
			System.out.println("�������� �����= " + innu2);
		} else if (innu1 > innu3 && innu2 > innu3) {
			System.out.println("�������� �����= " + innu3);
		} else if (innu1 == innu2 && innu1 < innu3) {
			System.out.println("�������� ����� : " + innu1 + " � " + innu2);		
		} else if (innu2 == innu3 && innu2 < innu1) {
			System.out.println("�������� ����� : " + innu2 + " � " + innu3);
		} else if (innu3 == innu1 && innu3 < innu2) {
			System.out.println("�������� ����� : " + innu3 + " � " + innu1);
		} else {
			System.out.println("�� ���� �����-- ���");
		}
		
		// �������� �3
		// ��� �����
		System.out.println();
		System.out.println("������ ����� ���� HTTP- �������, � ��������� �����");
		System.out.println("400, 401, 402, 403, 404");
		short hter = Short.parseShort(br.readLine());
		
		// ���� �����
		Methods_4_1.errorName(hter);
			
	}
		
}
