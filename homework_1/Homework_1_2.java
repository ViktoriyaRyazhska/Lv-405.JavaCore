package homework_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework_1_2 {
	public static void main(String[] args) throws IOException {
		
		System.out.println("What is your name ?");		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = br.readLine();
		
		System.out.println("Where do you live, " + name + " ?");
		String name1 = br.readLine();
		System.out.println("Person " + name + " lives in " + name1);
		
	}	
}
