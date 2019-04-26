import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PersonMain {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Person person1 = new Person("QWERTY", 2000);
		Person person2 = new Person();
		
        System.out.println("Enter name:");
		person2.setName(br.readLine());
		System.out.println("Enter BirthYear:");
		person2.setBirthYear(Integer.parseInt(br.readLine()));
		
		
		System.out.println("Change name of " + person2.getName());
		person2.changeName(br.readLine());
		
		System.out.println("Changed name from " + person2.previousName() + " to " + person2.getName());
		
		person1.outputPersonInf();
		System.out.println(person1);
		System.out.println(person2);
		person2.outputPersonInf();
		

	}

}
