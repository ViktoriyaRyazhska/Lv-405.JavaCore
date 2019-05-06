package HomeWork_3;

public class Person {
	private String name;
	private int birthYear;
	
	public static int age;
	
	public Person () {
		
	};
	
	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
		age = (int) 2019 - birthYear;
	}
	public Person(int birthYear, String name) {
		this.name = name;
		this.birthYear = birthYear;
		age = 2019-birthYear;
	}
	public Person(String name) {
		this.name = name;
	}
	public Person(int birthYear) {
		this.birthYear = birthYear;
		age = 2019-birthYear;
	}
		
	
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
		age = (int) 2019 - birthYear;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", birthYear=" + birthYear + "]";
	}
	
	
	

}
