package homework_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework_4_1 {
	
	// �������� �1
	public static void main(String[] args) throws IOException {
		
		int monnum;
		int monnum1;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("���� �����, ������ ����� ������ �����");
		monnum = Integer.parseInt(br.readLine());
		
		while(monnum < 1 || 13 <= monnum) {
			System.out.println("������ ������ ����� �� �� � ��� �����");
			System.out.println("������ ����� ����� �� 1 �� 12");
			monnum = Integer.parseInt(br.readLine());
		}
		
		monnum1 = monnum - 1; // ������� �� �������, ��� ����� � ����, ��� � ���� �����, ������ ���� �����, �� ������ monnum1. ��� ��� �� ������������ �� ���� "while" � �������� ������.
		
		System.out.print("� " + Arrays.monthNames[monnum1] + " " + Arrays.monthDays[monnum1]);
		
		if (Arrays.monthDays[monnum1] == 31) {
			System.out.println(" ����.");
		} else if (Arrays.monthDays[monnum1] == 28 || Arrays.monthDays[monnum1] == 30) {
			System.out.println(" ���.");
		}
		
	}
	
}