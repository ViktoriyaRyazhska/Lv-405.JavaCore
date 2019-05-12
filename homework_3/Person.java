package homework_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Person {  // ϳ� ����� ������ ����� �������, ��, �������, ������� ������� ����� input() � ���� ������� � ��������� �� ���� � ������� ������ � ������. ��� ���� � � output(). ���, �����, ��� �����, ����� ����������� ������� ���������� �������� )
				// � ������� ���� ������� "information" �� ��������� ���������� ��� ��'���. ���� ���� ������� ������ ������ ���� ����� ���.
	private String name;
	private int birthYear;
	private String ch; // � �� ������� ��� ��������� ����, ��� � �� ����, �� ����������� bufferedReader �����. )
	
	String getName() {
		return this.name;
	}	
	void setName(String name) {
		this.name = name;
	}	
	int getBirthYear() {
		return this.birthYear;
	}	
	void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}                                    // ^ ������ � ������
	
	Person() {}
	Person(String name, int birthYear) { // ������ �� ���� ����������� short birthYear. ��������� �� int.
		this.name = name;
		this.birthYear = birthYear;
	}
		
	short age() {
		return (short) (2019 - this.birthYear);
	}
	
	void input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("������, ���� �����, �������������� ��� " + this.name);
		this.ch = br.readLine();		
	}
	
	@Override
	public String toString() {
		return "��'�: " + this.name + "; �� ����������: " + this.birthYear + "; ";
	}
	
	String output() {
		return "�������������� ��� " + this.name + ": " + this.ch;
	}
	
//	void changeName(String name) { // ���, �� ���� ��� ����� �� ����������� �� setName, ������ ���� ����� bufferedReader � �������.
//		this.name = name;
//	}
	
	void changeName() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("������, ���� �����, ���� ��'� ��� " + this.name);
		this.name = br.readLine();
	}
}
