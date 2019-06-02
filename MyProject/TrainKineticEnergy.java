package MyProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class TrainKineticEnergy {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("���������� ����� ���� ������ ���� � ������������� �������� ����㳿");
		System.out.println();
		System.out.println("������ ���� ����� ��� ������ ���������");
		int Q = Integer.parseInt(br.readLine()); // ���� �����, �
//		Integer.parseInt(br.readLine())
		System.out.println("������ ������� ������");
		int n = Integer.parseInt(br.readLine());// �-��� ������, ��
		System.out.println("������ �������� ������, �� ����������");
		int ik = Integer.parseInt(br.readLine()); // ����� ���� ���������, �
		System.out.println("������ ������� ������, ���� ����������, �");
		int Sk = Integer.parseInt(br.readLine()); // ������� ������ ���� ���������, �
		System.out.println("������ �������� �������� ��� ���� �� �����, ��/���");
		double Vk = Integer.parseInt(br.readLine()); // �������� �� ������� ������, ��/���
		System.out.println("������� ���� ���������� �� �������� �� 1 �� 10");
		int y = Integer.parseInt(br.readLine());// ���� ���������� ��������

		int P = 240; // ���� ���������,�
		int q0 = (Q / n)/4;// ������������ �� ���,�
		double Vaver;//������� ��������
		int[] Ftjaga = { 40000, 32800, 27800, 21400, 17400, 14600, 12400, 10600 };// ���� ���� ���������� 2�62 � ����� 20-90 ��/���
		double Ft=0, Fn, Fk, wo1,wo2,fk,wo, S=0, St; //���� ���� ��� ������� ��������, ���� ���� ��� �����. ��. ��������, ���� ���� ��� ��. ��. ��������,
		int x = (80 - 20) / y; //���������� ������� ����� for
		DecimalFormat df= new DecimalFormat ("#.#");
		
		System.out.println("row-  |  Vk  | Vaver| wo1 | wo2 | wo |   Ft  |  fk |   St  |   S   | ");//������� �������
		
		for (int i = 0, s = 1; i <= x; i++) {
			Vaver = (Vk + (Vk - y)) / 2;
			wo1 = 1.9+0.01*Vaver+0.0003*Vaver*Vaver;
			wo2 = 0.7+((3+0.1*Vaver+0.0025*Vaver*Vaver)/q0);
			wo = (P*wo1+Q*wo2)/(P+Q);

//			System.out.println(Vaver + " " + Vk);
			if (Vaver <= 80 && Vaver >= 70) {
				Fk = Ftjaga[7];
				Fn = Ftjaga[6];
				Ft = Fk - ((Fn - Fk) / (70 - 80)) * 80 + ((Fn - Fk) / (70 - 80)) * Vaver;
//				System.out.println("80-70 Fn:" + Fn + ", Fk:" + Fk + ", Ft:" + Ft);
			}
			if (Vaver < 70 && Vaver >= 60) {
				Fk = Ftjaga[6];
				Fn = Ftjaga[5];
				Ft = Fk - ((Fn - Fk) / (60 - 70)) * 70 + ((Fn - Fk) / (60 - 70)) * Vaver;
//				System.out.println("70-60 Fn:" + Fn + ", Fk:" + Fk + ", Ft:" + Ft);
			}
			if (Vaver < 60 && Vaver >= 50) {
				Fk = Ftjaga[5];
				Fn = Ftjaga[4];
				Ft = Fk - ((Fn - Fk) / (50 - 60)) * 60 + ((Fn - Fk) / (50 - 60)) * Vaver;
//				System.out.println("60-50 Fn:" + Fn + ", Fk:" + Fk + ", Ft:" + Ft);
			}
			if (Vaver < 50 && Vaver >= 40) {
				Fk = Ftjaga[4];
				Fn = Ftjaga[3];
				Ft = Fk - ((Fn - Fk) / (40 - 50)) * 50 + ((Fn - Fk) / (40 - 50)) * Vaver;
//				System.out.println("50-40 Fn:" + Fn + ", Fk:" + Fk + ", Ft:" + Ft);
			}
			if (Vaver < 40 && Vaver >= 30) {
				Fk = Ftjaga[3];
				Fn = Ftjaga[2];
				Ft = Fk - ((Fn - Fk) / (30 - 40)) * 40 + ((Fn - Fk) / (30 - 40)) * Vaver;
//				System.out.println("40-30 Fn:" + Fn + ", Fk:" + Fk + ", Ft:" + Ft);
			}
			if (Vaver < 30 && Vaver >= 25) {
				Fk = Ftjaga[2];
				Fn = Ftjaga[1];
				Ft = Fk - ((Fn - Fk) / (25 - 30)) * 30 + ((Fn - Fk) / (25 - 30)) * Vaver;
//				System.out.println("30-25 Fn:" + Fn + ", Fk:" + Fk + ", Ft:" + Ft);
			}
			if (Vaver < 25 && Vaver >= 20) {
				Fk = Ftjaga[1];
				Fn = Ftjaga[0];
				Ft = Fk - ((Fn - Fk) / (20 - 25)) * 25 + ((Fn - Fk) / (20 - 25)) * Vaver;
//				System.out.println("25-20 Fn:" + Fn + ", Fk:" + Fk + ", Ft:" + Ft);
			};
			fk = Ft/(Q+P);
			St=4.17*(((Vk-y)*(Vk-y)-Vk*Vk)/(fk-wo-ik));
			S=S+St;
			if (Vaver >= 20) {
				System.out.println("row-" + s + " | " + Vk + " | " + Vaver+ " | "+df.format(wo1)+" | " +df.format(wo2)+" | " +df.format(wo)+" | " + Ft + " | "+ df.format(fk) + " | "+df.format(St)+" | " +df.format(S)+" | ");
			};
			Vk = Vk - y;
			s++;
		}
		
		if (S>Sk) {
			System.out.println("���� ������ ������� - "+df.format(S)+"�.");
			System.out.println("���� ����� - "+Q+"�, �� ����� - "+ik+" � ������ �����, ���� ����� �������� ���������");	
		} else {
		System.out.println("���� ������ ������� ���� - "+df.format(S)+"�., �� � ����� ����������� - "+Sk+"�.");		
		System.out.println(+Q+"�, ���� ���� �� ����� - "+ik+" - �� ���������, ������� ������� ������ � ������.");
		System.out.println("���� ����� ����� ��������� ������������� � ���� ��������� �������� �� ������� �������� ����㳿");
		}

	}

}
