import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Person {
	private String name;
	private int birthYear;
	
	List<String> nameList = new ArrayList<String>();

	public Person() {
	}

	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;

	}

	public int calculateAge() {
		return Year.now().getValue() - getBirthYear();
	}

	public void inputPersonInf(String name, int birthYear) {
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

	public void changeName(String name) {

		nameList.add(this.name);

		this.name = name;
	}

	public String previousName() {
		return nameList.get(nameList.indexOf(this.name) +1);
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
