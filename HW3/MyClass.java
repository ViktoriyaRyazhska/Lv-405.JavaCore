import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyClass{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Person[] person = new Person[5];

        for(int index = 0; index < person.length; index++){
            System.out.println("Please input username: " );
            String name = br.readLine();
            System.out.println("Please input birth year: ");
            int birthYear = Integer.parseInt(br.readLine());

            person[index] = new Person(name, birthYear);

        }

        for (Person h : person) {
            System.out.println(h.outputUserInformation());
        }


    }
}