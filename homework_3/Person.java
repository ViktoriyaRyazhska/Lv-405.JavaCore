package homework_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Person {  // Під кінець роботи тільки зрозумів, що, можливо, просять зробити метод input() і його варіанти в залежності від типу і кількості змінних в душках. Так само і з output(). Але, думаю, цей пакет, також підповідатиме вимогам домашнього завдання )
				// З першого разу зрозумів "information" як додаткову інформацію про об'єкт. Саме тому прийняв рішення писати саме такий код.
	private String name;
	private int birthYear;
	private String ch; // в ДЗ вказано два приватних поля, але я не знаю, як використати bufferedReader краще. )
	
	String getName() {
		return this.name;
	}	
	void setName(String name) {
		this.name = name;
	}	
	int getBirthYear() {
		return this.birthYear;
	}	
	void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}                                    // ^ сетери і гетери
	
	Person() {}
	Person(String name, int birthYear) { // чомусь не можу використати short birthYear. Виправляє на int.
		this.name = name;
		this.birthYear = birthYear;
	}
		
	short age() {
		return (short) (2019 - this.birthYear);
	}
	
	void input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Введіть, будь ласка, характеристику для " + this.name);
		this.ch = br.readLine();		
	}
	
	@Override
	public String toString() {
		return "Ім'я: " + this.name + "; рік народження: " + this.birthYear + "; ";
	}
	
	String output() {
		return "Характеристика для " + this.name + ": " + this.ch;
	}
	
//	void changeName(String name) { // Так, як нічим цей метод не відрізняється від setName, виведу його через bufferedReader і консоль.
//		this.name = name;
//	}
	
	void changeName() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Введіть, будь ласка, нове ім'я для " + this.name);
		this.name = br.readLine();
	}
}
