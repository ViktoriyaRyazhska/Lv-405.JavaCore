package homework_3;

import java.io.IOException;	// ��������� ���������  �� ���������� �������� ���������� � ���� Person.java

public class Homework_3_1 {
	
	public static void main(String[] args) throws IOException {
		
		Person Person1 = new Person("�����", 1991);
		Person Person2 = new Person();
		Person Person3 = new Person("������ :)", 1937);
		Person Person4 = new Person("���������", 960);
		Person Person5 = new Person("���������", 938);
		
		Person2.setName("����");
		Person2.setBirthYear(2001);
		
		Person1.input();
		Person2.input();
		Person3.input();
		Person4.input();
		Person5.input();
		
		System.out.println(Person1.output());
		System.out.println(Person2.output());
		System.out.println(Person3.output());
		System.out.println(Person4.output());
		System.out.println(Person5.output());
		
		Person1.changeName();
		Person2.changeName();
		
		System.out.println(Person1 + "; �� ��� " + Person1.getName() + ": " + Person1.age());
		System.out.println(Person1.output());
		System.out.println(Person2 + "; �� ��� " + Person2.getName() + ": " + Person2.age());
		System.out.println(Person2.output());
		System.out.println(Person3 + "; �� ��� " + Person3.getName() + ": " + Person3.age());
		System.out.println(Person3.output());
		System.out.println(Person4 + "; �� ��� " + Person4.getName() + ": " + Person4.age());
		System.out.println(Person4.output());
		System.out.println(Person5 + "; �� ��� " + Person5.getName() + ": " + Person5.age());
		System.out.println(Person5.output());
	}
}
