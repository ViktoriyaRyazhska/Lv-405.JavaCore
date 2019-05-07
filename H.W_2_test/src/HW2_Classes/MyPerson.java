package HomeWork_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyPerson {

	public static void main(String[] args) throws IOException {
		Person pers1= new Person ("Dimass", 1992); 
		System.out.println(pers1);
		int a1 = Person.age;
		System.out.println("you are " + a1 + " years old");
		System.out.println("----------------------------------------------");
		System.out.println();
		
		Person pers2= new Person ("Andry", 1984); 
		System.out.println(pers2);
		int a2 = Person.age;
		System.out.println("you are " + a2 + " years old");
		System.out.println("----------------------------------------------");
		System.out.println();
		
		Person pers3= new Person (1969,"Ivan"); 
		System.out.println(pers3);
		int a3 = Person.age;
		System.out.println("you are " + a3 + " years old");
		System.out.println("----------------------------------------------");
		System.out.println();
		
		Person pers4= new Person (169,"Igor"); 
		System.out.println(pers4);
		int a4 = Person.age;
		System.out.println("you are " + a4 + " years old");
		pers4.setName("Igorchyk");
		pers4.setBirthYear(2011);
		a4 = Person.age;
		System.out.println(pers4);
		System.out.println("Now you are " + a4 + " years old");
		System.out.println("----------------------------------------------");
		System.out.println();
		
		Person pers5= new Person (); 
			System.out.println("Hello dear, what is your name?");
			BufferedReader info = new BufferedReader(new InputStreamReader(System.in));
			pers5.setName(info.readLine());
			System.out.println("When you were born?");
			pers5.setBirthYear(Integer.parseInt(info.readLine()));
			System.out.println(pers5);
			int a5 = Person.age;
			System.out.println("You are " + a5 + " years old");
			System.out.println("----------------------------------------------");
			System.out.println();
	}
}

