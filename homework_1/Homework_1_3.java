package homework_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework_1_3 {
	public static void main(String[] args) throws IOException {
		System.out.println("������ ����� 1-� ����� � ������� �� 1-� �������");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double �1 = Double.parseDouble(br.readLine());
		System.out.println("����� 1-� �����= " + �1 + " ���/��");
		
		System.out.println("������ ����� 2-� ����� � ������� �� 1-� �������");
		double c2 = Double.parseDouble(br.readLine());
		System.out.println("����� 1-� �����= " + �1 + " ���/��");
		System.out.println("����� 2-� �����= " + c2 + " ���/��");
		
		System.out.println("������ ����� 3-� ����� � ������� �� 1-� �������");
		double c3 = Double.parseDouble(br.readLine());
		System.out.println("����� 1-� �����= " + �1 + " ���/��");
		System.out.println("����� 2-� �����= " + c2 + " ���/��");
		System.out.println("����� 3-� �����= " + c3 + " ���/��");
		
		System.out.println("������, ���� �����, ��������� ������� � ��. � ��������� 1-� �����");
		double t1 = Double.parseDouble(br.readLine());
		System.out.println("����� 1-� �����= " + �1 + " ���/��;" + " ��������� ������� " + t1 + "��.");
		System.out.println("����� 2-� �����= " + c2 + " ���/��");
		System.out.println("����� 3-� �����= " + c3 + " ���/��");
		
		System.out.println("������, ���� �����, ��������� ������� � ��. � ��������� 2-� �����");
		double t2 = Double.parseDouble(br.readLine());
		System.out.println("����� 1-� �����= " + �1 + " ���/��;" + " ��������� ������� " + t1 + "��.");
		System.out.println("����� 2-� �����= " + c2 + " ���/��;" + " ��������� ������� " + t2 + "��.");
		System.out.println("����� 3-� �����= " + c3 + " ���/��");
		
		System.out.println("������, ���� �����, ��������� �������  � ��. � ��������� 2-� �����");
		double t3 = Double.parseDouble(br.readLine());
		System.out.println("����� 1-� �����= " + �1 + " ���/��;" + " ��������� ������� " + t1 + "��.");
		System.out.println("����� 2-� �����= " + c2 + " ���/��;" + " ��������� ������� " + t2 + "��.");
		System.out.println("����� 3-� �����= " + c3 + " ���/��;" + " ��������� ������� " + t3 + "��.");
		System.out.println("�������� ������� ������� � ��������� 1-� �����= " + �1 * t1 + "���.");
		Double g1 = �1 * t1;
		System.out.println("�������� ������� ������� � ��������� 2-� �����= " + c2 * t2 + "���.");	
		Double g2 = c2 * t2;
		System.out.println("�������� ������� ������� � ��������� 3-� �����= " + c3 * t3 + "���.");
		Double g3 = c3 * t3;
		System.out.println("�������� ������� ��� ������ ���������= " + (g1 + g2 + g3) + " ���.");
	
		
	}
	
	
}
