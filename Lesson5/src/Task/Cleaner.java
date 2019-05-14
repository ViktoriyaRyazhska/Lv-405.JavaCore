package Task;

public class Cleaner extends Stuff {
public final String TYPE_PERSON = getName();

	public Cleaner (String name) {
		super(name);
		name = "Cleaner";
	}
	public void print () {
		System.out.println("I am a " + TYPE_PERSON);
	}
	
	public void Salary () {
		System.out.println(TYPE_PERSON + " salary is 500 $");
	}

}
