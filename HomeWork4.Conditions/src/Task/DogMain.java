package Task;

public class DogMain {

	public static void main(String[] args) {
		Dog dog1 = new Dog ("Tuzik", 10, "Labrador");
		Dog dog2 = new Dog ("Pes", 5, "Shepherd");
		Dog dog3 = new Dog ("Arni", 2, "Akita");
		
		if (dog1.getAge()>dog2.getAge() && dog1.getAge()>dog3.getAge()) {
			System.out.println("The oldest dog is " + dog1.getBreed() + " " + dog1.getName());
		}
		
		if (dog2.getAge()>dog1.getAge() && dog2.getAge()>dog3.getAge()) {
			System.out.println("The oldest dog is " + dog2.getBreed() + " " + dog2.getName());
		}
		
		if (dog3.getAge()>dog1.getAge() && dog3.getAge()>dog2.getAge()) {
			System.out.println("The oldest dog is " + dog3.getBreed() + " " + dog3.getName());
		}

	}

}
