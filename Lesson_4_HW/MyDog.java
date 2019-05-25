package Lesson_4_HW;

public class MyDog {

	public static void main(String[] args) {
		Dog dog1 = new Dog ("Bethoween", Breed.Bulldog, 12);
		Dog dog2 = new Dog ("Rex", Breed.values()[1], 11);
		Dog dog3 = new Dog ("Rex", Breed.values()[1], 8);
		System.out.println(dog1 + " " + dog1.hashCode());
		System.out.println(dog2+ " " + dog2.hashCode());
		System.out.println(dog3.getName() +" "+dog3.hashCode());
		
//Check if there is no two dogs with the same name.
		System.out.println(dog1.equals(dog2));
		System.out.println(dog1.equals(dog3));
		System.out.println(dog2.equals(dog3));
		
//Display the name and the kind of the oldest dog.
	
		Dog dog=dog1;
		if (dog.getAge()<dog2.getAge()) {
			dog=dog2;
		}
		if (dog2.getAge()<dog3.getAge()) {
			dog=dog3;
		}
		System.out.println("oldest dog is "+dog.getName()+", breed is " + dog.getBreed());
		
	}
	
}
