/*
* Copyright (c) Petjalviff
* �� �������� � ���������� �� ����� ������
*/

package MyProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
 * Class ���� ���.
 *
 * @version 1.5 05.06.2019
 * @author ����� ��������
 */

public class TrainKineticEnergy {
	/**
	 * �������� ���� ���� ������ ������� ���� �� ������� ������ �������
	 * ����������
	 */
	/** fTjaga - ���� ���� ���������� 2�62 */
	public static int[] fTjaga = { 40000, 32800, 27800, 21400, 17400, 14600, 12400, 10600 };
	/**
	 * fTjagaVaverage - ���� ���� ���������� � ��������� �� �������� ��������
	 * ���� �����
	 */
	public static double fTjagaVaverage = 0;
	/** fTjagaVmax - ���� ���� ���������� ��� ����������� �������� �������� */
	public static double fTjagaVmax;
	/** fTjagaVmin - ���� ���� ���������� ��� �������� �������� �������� */
	public static double fTjagaVmin;
	/** ��� ���� ���������� */
	public static double wo1;
	/** ��� ���� ����� */
	public static double wo2;
	/** ������ ���� ���� */
	public static double fk;
	/** ������� ��� ����� �� ���������� ����� */
	public static double wo;
	/** ��������� ����, �� ������ ���� */
	public static double S = 0;
	/** ����, ���� ������ ���� �� ������ ������ ���������� */
	public static double St;

	/**
	 * �������� ����� ���� ������� ��������
	 * 
	 * @param args
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("<<<<   ������� ��� ���� ����   >>>>");
		System.out.println();
		System.out.println("    1 ��������: ���������� ����� ���� ������ ���� � ������������� �������� ����㳿");
		System.out.println("    2 ��������: ���������� �������� ���� �����");
		System.out.println("    3 exit");

		for (int m = 0; m < 3 || m > 3;) {
			System.out.println();
			System.out.println("Menu");
			System.out.println("������� ��������: 1-3");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			m = Integer.parseInt(br.readLine());
			switch (m) {
			case 1:
				task1();
				break;
			case 2:
				task2();
				break;
			case 4:
				System.out.println("���������� ������, ��� - 1 ��� � - 2");
				int b = Integer.parseInt(br.readLine());
				switch (b) {
				case 1:
					System.out.println("Godbye");
					break;
				case 2:
					m = 0;
					break;
				}
				break;
			default:
				System.out.println("Wrong");
				System.out.println("----------------------------------");
				break;
			}
		}

	}

	/**
	 * �������, ��� ������� ���� ���� ��� ����� ������� ��������
	 * 
	 * @param Vaverage
	 * @return fTjagaVaverage
	 */
	public static double meth(double Vaverage) {
		int Vmax = (((int) Vaverage + 10) / 10) * 10;
		double fTjagaVaverage;
		int nm = ((int) Vaverage) / 10 - 1;
		fTjagaVmin = fTjaga[nm];
		fTjagaVmax = fTjaga[nm + 1];

		fTjagaVaverage = (fTjagaVmax - ((fTjagaVmin - fTjagaVmax) / (-10)) * Vmax)
				+ +((fTjagaVmin - fTjagaVmax) / (-10)) * Vaverage;

		return fTjagaVaverage;
	}

	/**
	 * ����� ���������� ����� ���� ������ ���� � ������������� �������� ����㳿
	 * �� ���� ����
	 * 
	 * @return S
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public static double task1() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("#.#");
		System.out.println();
		System.out.println("+++<<< ���������� ����� ���� ������ ���� � ������������� �������� ����㳿 >>>+++");
		System.out.println();
		System.out.println("������ ���� ����� ��� ������ ���������");
		int Q = Integer.parseInt(br.readLine());
		System.out.println("������ ������� ������");
		int n = Integer.parseInt(br.readLine());
		System.out.println("������ �������� ������, �� ���������� �");
		double ik = Integer.parseInt(br.readLine());
		System.out.println("������ ������� ������, ���� ����������, �");
		int Sk = Integer.parseInt(br.readLine());
		System.out.println("������ �������� �������� ��� ���� �� �����, ��/���");
		double Vk = Integer.parseInt(br.readLine());
		System.out.println("������� ���� ���������� �� �������� �� 1 �� 10");
		int y = Integer.parseInt(br.readLine());
		/** P - ���� ����������, � */
		int P = 240;
		/** q0 - ������������ �� ��� ������ ���� ������, � */
		int q0 = (Q / n) / 4;
		/** Vaverage - ������� �������� ��� ����� ��/��� */
		double Vaverage;

		/** x - ���������� ������� ����� for */
		int x = (80 - 20) / y;
		System.out.println();
		System.out.println("row-   |  Vk  | Vaver| wo1  | wo2  | wo   |fTjagaVaverage|  fk |  St  |   S    |");
		System.out.println("-------|------|------|------|------|------|--------------|-----|------|--------|");

		for (int i = 0, count = 1; i < x; i++) {
//			double fTjagaVaverage;
			Vaverage = (Vk + (Vk - y)) / 2;
			wo1 = 1.9 + 0.01 * Vaverage + 0.0003 * Vaverage * Vaverage;
			wo2 = 0.7 + ((3 + 0.1 * Vaverage + 0.0025 * Vaverage * Vaverage) / q0);
			wo = (P * wo1 + Q * wo2) / (P + Q);
			fTjagaVaverage = meth(Vaverage);
			fk = fTjagaVaverage / (Q + P);
			St = 4.17 * (((Vk - y) * (Vk - y) - Vk * Vk) / (fk - wo - ik));
			S = S + St;
			if (Vaverage >= 20) {
				System.out.printf("row-%2d | %4.1f | %4.1f | %4.1f | %4.1f | %4.1f | %12.1f | %3.1f | %5.1f| %6.1f |%n",
						count, Vk, Vaverage, wo1, wo2, wo, fTjagaVaverage, fk, St, S);
			}
			Vk = Vk - y;
			count++;

		}

		if (S > Sk) {
			System.out.println();
			System.out.println("���� ������ ������� - " + df.format(S) + "�.");
			System.out.println("���� ����� - " + Q + "� ������ ����� �������� "+ Sk+"� �� ��������� - " + ik
					+ "� - ���� ����� �������� ���������.");
		} else {
			System.out.println();
			System.out.println(
					"���� ������ ������� ���� - " + df.format(S) + "�., �� � ����� ����������� - " + Sk + "�.");
			System.out.println(
					"���� "+Q + "�, �� ����� ����� � ��������� - " + ik + "� - �� ���������, ������� ������� ������������� ������ � ������.");
			System.out.println(
					"���� ����� ����� ��������� ������������� � ���� ��������� �������� �� ������� �������� ����㳿");
		}
		return S;
	}

	public static double task2() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("#");
		System.out.println("++++<<< ���������� �������� ���� ����� >>>++++");

		System.out.println();
		System.out.println("������ ����� ���� ���������, �");
		double ik = Integer.parseInt(br.readLine()); // ����� ���� ���������, �
		
		String[] locomotive = { "��11/��10", "��80", "��40", "2�62", "�62", "2��10�", "�62�", "��33��", "���3" };// �����
																													// ����������
		int[] Ftjaga1 = { 62000, 69000, 34000, 72000, 36000, 81300, 40000, 51200, 36000 };// ���� ���� ���������� ���
																							// ������ � ����, ���
		int[] Ftjaga2 = { 46000, 51200, 25600, 40000, 20000, 48000, 32000, 43540, 23000 };// �������� ���� ����
																							// ����������, ���
		int[] Ploc = { 184, 186, 93, 240, 120, 276, 120, 138, 120 };
		double[] Vloc = { 46.5, 43.5, 43.5, 20, 20, 26.4, 26.4, 24.5, 11.4 };// �������� �������� ����������, ��/���
		double Q = 0, q0, wo1, wo2, wor, Qv, no;
		q0 = 23;// ������������ �� ��� ������, �
		Qv = 92;// ���� ������ ������ ������, � � ��������
		no = 4;//

		for (int i = 0; i < Ftjaga1.length; i++) {
			String loc = locomotive[i];
			int Ft1 = Ftjaga1[i];
			int Ft2 = Ftjaga2[i];
			double V = Vloc[i];
			int P = Ploc[i];

			wo1 = 1.9 + 0.01 * V + 0.0003 * V * V;// ��� ���� ����������
			wo2 = 0.7 + ((3 + 0.1 * V + 0.0025 * V * V) / q0);// ��� ���� ������
			Q = (Ft2 - (wo1 + ik) * P) / (wo2 + ik);
			System.out.printf("%12s | %6.1f �.|%n",loc,Q);

			wor = 1;

		}

		return Q;

	}

}
