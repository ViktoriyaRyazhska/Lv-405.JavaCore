package Task;

public class Student extends Person {
	public final String TYPE_PERSON = getName();

	public Student(String name) {
		super(name);
		name = "Student";
	}

	public void print() {
		System.out.println("I am a " + TYPE_PERSON);
	}

}
