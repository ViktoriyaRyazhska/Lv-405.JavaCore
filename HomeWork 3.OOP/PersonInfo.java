package LessonThree.Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PersonInfo {

	public static void main(String[] args) throws IOException {
		Person person1 = new Person();
		BufferedReader person11 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Name of person1?");
		person1.inputName(person11.readLine());
		BufferedReader person12 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Birthday of person1?");
		person1.inputBirthYear(Integer.parseInt(person12.readLine()));
		person1.age();
		System.out.println(person1.output());
		
		Person person2 = new Person();
		BufferedReader person21 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Name of person2?");
		person2.inputName(person21.readLine());
		BufferedReader person22 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Birthday of person2?");
		person2.inputBirthYear(Integer.parseInt(person22.readLine()));
		person2.age();
		System.out.println(person2.output());
		
		Person person3 = new Person();
		BufferedReader person31 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Name of person3?");
		person3.inputName(person31.readLine());
		BufferedReader person32 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Birthday of person3?");
		person3.inputBirthYear(Integer.parseInt(person32.readLine()));
		person3.age();
		System.out.println(person3.output());
		
		Person person4 = new Person();
		BufferedReader person41 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Name of person4?");
		person4.inputName(person41.readLine());
		BufferedReader person42 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Birthday of person4?");
		person4.inputBirthYear(Integer.parseInt(person42.readLine()));
		person4.age();
		System.out.println(person4.output());
		
		Person person5 = new Person();
		BufferedReader person51 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Name of person5?");
		person5.inputName(person51.readLine());
		BufferedReader person52 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Birthday of person5?");
		person5.inputBirthYear(Integer.parseInt(person52.readLine()));
		person5.age();
		System.out.println(person5.output());
		

	}

}
