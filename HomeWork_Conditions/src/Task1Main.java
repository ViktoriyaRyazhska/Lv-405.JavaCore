package soft.serve;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task1Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Task1 task1 = new Task1();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter start and end of the range:");
		System.out.println("Start: ");
		task1.setStartOfRange(Integer.parseInt(br.readLine()));

		System.out.println("End: ");
		task1.setEndOfRange(Integer.parseInt(br.readLine()));

		System.out.println("Enter three numbers and the program will determine is numbers belong to the range ["
				+ task1.getStartOfRange() + "," + task1.getEndOfRange() + "]");
		System.out.println("Enter firts number:");
		task1.setFirstFloatNmbr(Double.parseDouble(br.readLine()));

		System.out.println("Enter second number:");
		task1.setSecondFloatNmbr(Double.parseDouble(br.readLine()));

		System.out.println("Enter third number:");
		task1.setThirdFloatNmbr(Double.parseDouble(br.readLine()));

		System.out.println("Is all numbers belong to the range? " + task1.fromTrueFalseToYesNo());
		
		System.out.println("");
		
		
		System.out.println("Enter three numbers and the program will determine Min Max numbers");
		System.out.println("Enter firts number:");
		task1.setFirstIntNmbr(Integer.parseInt(br.readLine()));
		System.out.println("Enter second number:");
		task1.setSecondIntNmbr(Integer.parseInt(br.readLine()));
		System.out.println("Enter third number:");
		task1.setThirdIntNmbr(Integer.parseInt(br.readLine()));
		System.out.println("Min, Max of numbers:");
		System.out.println("Min: " + task1.getMin());
		System.out.println("Max: " + task1.getMax());
		
		System.out.println("");
		
		System.out.println("Enter HTTP code error");
		System.out.println("Error name: " + task1.getErrorName(Integer.parseInt(br.readLine())));	

		Dog dog1 = new Dog("Q", Dog.Breed.BOXER, 5);
		Dog dog2 = new Dog("W", Dog.Breed.BEAGLE, 8);
		Dog dog3 = new Dog("R", Dog.Breed.COLLIE, 1);
		
		System.out.println("Is there dogs with the same name? " + Dog.sameDogName(dog1, dog2, dog3));


		
		ArrayList<Dog> dogs = new ArrayList<>();
		dogs.add(dog1);
		dogs.add(dog2);
		dogs.add(dog3);
		
		
		System.out.println("Oldest dog: " + Dog.getOldestDog(dogs));
		

		

	}

}
