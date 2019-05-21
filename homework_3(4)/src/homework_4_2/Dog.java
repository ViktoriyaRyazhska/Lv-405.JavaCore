package homework_4_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Dog {
	private String name;
	private Enbreed breed;
	private int age;
	
	enum Enbreed {
		вівчарка, пінчер, терєр, даксхунд, шпіц;
	}
	
	Dog() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));			
		
		name = br.readLine();
		System.out.println("Введіть породу собаки " + name + " із запропонованих нижче");
		System.out.println("Вівчарка, Пінчер, Терєр, Даксхунд, Шпіц");
		String strbreed = br.readLine();
		breed = Enbreed.valueOf(strbreed.toLowerCase());
		System.out.println("Введіть вік собаки " + name + " (скільки цілих років)");
		age = Integer.parseInt(br.readLine());
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Enbreed getBreed() {
		return breed;
	}
	public void setBreed(Enbreed breed) {
		this.breed = breed;
	}	
	public int getAge() {
		return age;
	}	
	public void setAge(byte age) {
		this.age = age;
	}
	// ^ Гетери і Сетери
	
	Dog(String name, Enbreed breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;	
	}
	
	// Нижче спробував (після невдалих спроб в класі Homework_4_2), чи працює окремий метод, щоб порвінювати імена. Не працює (. Так само пропускає все до слова "else" і виводить те, що там написано.

//	static void sameNames(Dog obj1, Dog obj2, Dog obj3) {
//		if (obj1.getName() == obj2.getName() && obj1.getName() != obj3.getName()) {
//			System.out.println("У вас дві собаки з однаковим ім'ям");
//			System.out.println(obj1);
//			System.out.println(obj2);
//		} else if (obj2.getName() == obj3.getName() && obj2.getName() != obj1.getName()) {
//			System.out.println("У вас дві собаки з однаковим ім'ям");
//			System.out.println(obj2);
//			System.out.println(obj3);
//		} else if (obj3.getName() == obj1.getName() && obj3.getName() != obj2.getName()) {
//			System.out.println("У вас дві собаки з однаковим ім'ям");
//			System.out.println(obj3);
//			System.out.println(obj1);
//		} else {
//			System.out.println("Всі ваші собаки мають однакові імена");
//		}
//	}
	
//до 3-го способу	static String sameNames(Dog obj1, Dog obj2, Dog obj3) {
//		if (obj1.getName() == obj2.getName() && obj1.getName() != obj3.getName()) {
//			return "У вас дві собаки з однаковим ім'ям";
//		} else if (obj2.getName() == obj3.getName() && obj2.getName() != obj1.getName()) {
//			return "У вас дві собаки з однаковим ім'ям";
//		} else if (obj3.getName() == obj1.getName() && obj3.getName() != obj2.getName()) {
//			return "У вас дві собаки з однаковим ім'ям";
//		} else {
//			return "Всі ваші собаки мають однакові імена";
//		}
//	}
	
	@Override
	public String toString() {
		return "Собака " + this.name + "; порода: " + this.breed + "; вік: " + this.age + "р.";
	}
		
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Dog other = (Dog) obj;
		if (age != other.age) return false;
		if (name == null) {
			if (other.name != null) return false;
		} else if (!name.contentEquals(other.name)) return false;
		return true;
	}
	
}
