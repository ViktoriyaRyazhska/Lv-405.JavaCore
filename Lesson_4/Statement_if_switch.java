package Lesson_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Statement_if_switch {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader numberDay = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Use operator IF");
		System.out.println("Input please the number of the day of the week");
		int nd = Integer.parseInt(numberDay.readLine());
		if (nd==1) {
			System.out.println(nd + " - is Monday/�� ��������/��� �����������");
		}
		if (nd==2) {
			System.out.println(nd + " - is Tuesday/�� ³������/��� �������");
		}
		if (nd==3) {
			System.out.println(nd + " - is Wednesday/�� ������/��� �����");
		}
		if (nd==4) {
			System.out.println(nd + " - is Thursday/�� ������/��� �������");
		}
		if (nd==5) {
			System.out.println(nd + " - is Friday/�� �'������/��� �������");
		}
		if (nd==6) {
			System.out.println(nd + " - is Saturday/�� ������/��� �������");
		}
		if (nd==7) {
			System.out.println(nd + " - is Sunday/�� �����/��� �����������");
		}
		if (nd==0||nd<0||nd>7) {
			System.out.println(nd + " - day does not exist/���� �� ����/���� �� ����������");
		}
		System.out.println("-------------------------------------------------------");
		System.out.println();
				
		System.out.println("Use operator SWITCH");
		System.out.println("Input please the number of the day of the week");
		nd = Integer.parseInt(numberDay.readLine());
		switch(nd) {
		case 1:
			System.out.println(nd + " - is Monday/�� ��������/��� �����������");
			break;
		case 2:
			System.out.println(nd + " - is Tuesday/�� ³������/��� �������");
			break;
		case 3:
			System.out.println(nd + " - is Wednesday/�� ������/��� �����");
			break;
		case 4:
			System.out.println(nd + " - is Thursday/�� ������/��� �������");
			break;
		case 5:
			System.out.println(nd + " - is Friday/�� �'������/��� �������");
			break;
		case 6:
			System.out.println(nd + " - is Saturday/�� ������/��� �������");
			break;
		case 7:
			System.out.println(nd + " - is Sunday/�� �����/��� �����������");
			break;
		default:
			System.out.println("Wrong!");
			
			
		}
	}

}
