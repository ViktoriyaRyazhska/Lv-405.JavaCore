package Lesson_4_HW;

enum Breed {
	Bulldog("bulldog"), Poodle("poodle"), Pekingese("pekingese");

	private String breedName;

	Breed(String breedName) {
		this.breedName = breedName;
	}

	public String getBreedName() {
		return breedName;
	}

}

public class Dog {
	private String name;
	private Breed breed;
	private int age;

	public Dog(String name, Breed breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Breed getBreed() {
		return breed;
	}

	public void setBreed(Breed breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dog name is " + name + ", breed is " + breed + " and age is " + age + ";";
	}
	public boolean equals (Object obj) { 
		Dog other = (Dog) obj;
		if (!name.equals(other.name))return false;
		return true;
	}
}
