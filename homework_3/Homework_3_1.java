package homework_3;

import java.io.IOException;	// Детальніші пояснення  до домашнього завдання розташовані у файлі Person.java

public class Homework_3_1 {
	
	public static void main(String[] args) throws IOException {
		
		Person Person1 = new Person("Андрій", 1991);
		Person Person2 = new Person();
		Person Person3 = new Person("Більбо :)", 1937);
		Person Person4 = new Person("Володимир", 960);
		Person Person5 = new Person("Святослав", 938);
		
		Person2.setName("Ігор");
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
		
		System.out.println(Person1 + "; вік для " + Person1.getName() + ": " + Person1.age());
		System.out.println(Person1.output());
		System.out.println(Person2 + "; вік для " + Person2.getName() + ": " + Person2.age());
		System.out.println(Person2.output());
		System.out.println(Person3 + "; вік для " + Person3.getName() + ": " + Person3.age());
		System.out.println(Person3.output());
		System.out.println(Person4 + "; вік для " + Person4.getName() + ": " + Person4.age());
		System.out.println(Person4.output());
		System.out.println(Person5 + "; вік для " + Person5.getName() + ": " + Person5.age());
		System.out.println(Person5.output());
	}
}
