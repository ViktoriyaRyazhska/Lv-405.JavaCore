package LessonThree.Homework;

import java.util.Calendar;

public class Person {
	private String name;
	private int birthYear;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public Person() {
	}

	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}

	Calendar now = Calendar.getInstance();
	int year = now.get(Calendar.YEAR);

	public int age() {
		return year - birthYear;
	}
	
	public void inputName (String name) {
		this.name = name;
	}
	
	public void inputBirthYear (int birthYear) {
		this.birthYear = birthYear;
	}
	
	public String output ( ) {
		return "Person " + this.name + ", " + this.birthYear + " Birhyear, " + this.age() + " yaers old.";
	}
	
	public String changeName (String name1) {
		this.name = name1;
		return name;
	}
	

}
