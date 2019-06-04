import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Person {
	private String name;
	private int birthYear;
	
	

	public Person() {
	}

	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;

	}

	public int calculateAge() {
		return LocalDate.now().getYear() - getBirthYear();
	}

	public void inputPersonInf(String name, int birthYear)throws IllegalArgumentException {
		if (name == null || name.isEmpty()) {
			throw new IllegalArgumentException("String can't be null");
		}
		this.name = name;
		this.birthYear = birthYear;
	}

	@Override
	public String toString() {
		return "Name: " + name + "; BirthYear: " + birthYear + "; Age: " + calculateAge();
	}

	public void outputPersonInf() {
		System.out.println("Name: " + this.name + "; BirthYear: " + birthYear + "; Age: " + calculateAge());
	}

	public void changeName(String name, List nameList) {
		if (name == null || name.isEmpty() || nameList == null) {
			throw new IllegalArgumentException("Param can't be null");
		}
		nameList.add(this.name);

		this.name = name;
	}

	public String previousName(List nameList) {
		return (String) nameList.get(nameList.indexOf(this.name) +1);
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
	}

}
