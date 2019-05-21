package homework_4_2;

import java.io.IOException;

class Homework_4_2 {
				
	public static void main(String[] args) throws IOException {
		
		System.out.println("Введіть ім'я вашої першої собаки");
		Dog dog1 = new Dog();
		System.out.println("1) " + dog1);
		System.out.println();
		
		System.out.println("Введіть ім'я вашої другої собаки");		
		Dog dog2 = new Dog();
		System.out.println("1) " + dog1);
		System.out.println("2) " + dog2);
		System.out.println();
		
		System.out.println("Введіть ім'я вашої третьої собаки");
		Dog dog3 = new Dog();
		System.out.println("1) " + dog1);
		System.out.println("2) " + dog2);
		System.out.println("3) " + dog3);
		System.out.println();
		
		System.out.println("Чи співпадають імена у введених собак ?");  // Чомусь не працює знак "==". В обох випадках нижче, пише, що поля не співпадають, хоча, getName() повертає, те що було записано і веде облік об'єктів класу Dog.
//1спосіб		String nameequals = dog1.getName() == dog2.getName() || dog2.getName() == dog3.getName() || dog3.getName() == dog1.getName() ? "Так, співпадають" : "Ні, не співпадають";
//		System.out.println("Відповідь: " + nameequals) ;
		
//2спосіб		if (dog1.getName() == dog2.getName() || dog2.getName() == dog3.getName() || dog3.getName() == dog1.getName()) {
//			System.out.println("Відповідь: так, співпадають");
//		} else {
//			System.out.println("Відповідь: ні, не співпадають");
//		}
//		System.out.println();
		
//3спосіб		System.out.println(Dog.sameNames(dog1, dog2, dog3));
		
// Якщо заповнити об'єкти через метод "Dog(String name, Enbreed breed, int age)", тоді все працює і імена порівнює коректно.

// І нижче, ті способи, які не працюють з "getName", успішно працюють з "getAge".
		System.out.println("Яка собака найстарша ?");
		if (dog1.getAge() > dog2.getAge() && dog1.getAge() > dog3.getAge()) {
			System.out.println("Найстарша " + dog1);
		} else if (dog2.getAge() > dog1.getAge() && dog2.getAge() > dog3.getAge()) {
			System.out.println("Найстарша " + dog2);
		} else if (dog3.getAge() > dog2.getAge() && dog3.getAge() > dog1.getAge()) {
			System.out.println("Найстарша " + dog3);
		} else if (dog1.getAge() == dog2.getAge() && dog1.getAge() > dog3.getAge()) {
			System.out.println("Найстарші, дві собаки:");
			System.out.println(dog1);
			System.out.println(dog2);
		} else if (dog2.getAge() == dog3.getAge() && dog2.getAge() > dog1.getAge()) {
			System.out.println("Найстарші, дві собаки:");
			System.out.println(dog2);
			System.out.println(dog3);
		} else if (dog3.getAge() == dog1.getAge() && dog3.getAge() > dog2.getAge()) {
			System.out.println("Найстарші, дві собаки:");
			System.out.println(dog3);
			System.out.println(dog1);
		} else {
			System.out.println("Всі ваші собаки одного віку");
			System.out.println(dog1);
			System.out.println(dog2);
			System.out.println(dog3);
		}
				
	}

}
		
