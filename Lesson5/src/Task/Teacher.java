package Task;

public class Teacher extends Stuff {
public final String TYPE_PERSON = getName();
public Teacher (String name) {
	super (name);
	name = "Teacher";
}
	

	public void print () {
		System.out.println("I am a " + TYPE_PERSON);
	}
	
	public void Salary () {
		System.out.println(TYPE_PERSON + " salary is 1000 $");
	}

}
