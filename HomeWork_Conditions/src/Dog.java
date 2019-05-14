package soft.serve;
import java.util.ArrayList;
import java.util.Collections;

public class Dog {
	private String name;
	private Breed breed;
	private int age;

	public enum Breed {
		BEAGLE("Beagle"), 
		BOXER("Boxer"), 
		COLLIE("Collie");
		
		String breedName;
		
		Breed(String breedName) {
			this.breedName = breedName;
		}
	}

	public Dog() {
	}

	public Dog(String name, Breed breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	public static String sameDogName(Dog name1, Dog name2, Dog name3) {

		if (name1.equals(name2) || name1.equals(name3) || name2.equals(name3)) {
			return "Yes";
		}
		return "No";
	}



	public static String getOldestDog(ArrayList<Dog> dogs) {

		int max = dogs.get(0).getAge();
		int i;
		String dogBreed = "";

		for (i = 0; i < dogs.size(); i++) {
			if (dogs.get(i).getAge() > max) {
				max = dogs.get(i).getAge();
				dogBreed = dogs.get(i).getBreed().breedName;
			}
		}
		return Integer.toString(max) + " year " + dogBreed;

	}



	public Breed getBreed() {
		return breed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog dog = (Dog) obj;
		if (name == null) {
			if (dog.name != null)
				return false;
		} else if (!name.equals(dog.name))
			return false;
		return true;
	}

}
