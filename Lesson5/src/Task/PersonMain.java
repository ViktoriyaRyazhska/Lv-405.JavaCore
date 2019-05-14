package Task;

public class PersonMain {

	public static void main(String[] args) {
		Person person [] = new Person [5];
		person[0] = new Student("Andrew");
		person[1] = new Teacher("Vadim");
		person[2] = new Cleaner ("Oleg");
		person[3] = new Teacher ("Vova");
		person[4] = new Student ("Vasya");
		
		for (int i = 0; i < person.length; i++) {
			person [i].print();
		}
		
		for (int i = 0; i < person.length; i++) {
			if (person[i] instanceof Stuff) {
				((Stuff)person[i]).Salary();
			}
			
		}

	}

}
