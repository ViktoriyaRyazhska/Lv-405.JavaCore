import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2_Dialogue {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name;
		String adress;
		
		System.out.println("What is your name?");
		name = br.readLine();
		
		System.out.println("Where are you live, " + name + "?");
		adress = br.readLine();
		
		System.out.println("On the " + adress);
	}
}
