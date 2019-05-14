package soft.serve;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestTasks {

	@Test
	public void testBelongTrue() {
		Task1 t1 = new Task1();
		t1.setStartOfRange(-5);
		t1.setEndOfRange(5);
		assertTrue(t1.belong(-3.45, 4, 4.34));
		
		t1.setStartOfRange(-5);
		t1.setEndOfRange(5);
		assertFalse(t1.belong(-5.65, 4, 4.34));
	}

	@Test
	public void testFromTrueFalseToYesNo() {
		Task1 t1 = new Task1();
		t1.setStartOfRange(-5);
		t1.setEndOfRange(5);
		t1.belong(-3.45, 4, 4.34);
		assertTrue("Yes" == t1.fromTrueFalseToYesNo());
		t1.belong(-5.65, 4, 4.34);
		assertFalse("No" == t1.fromTrueFalseToYesNo());
	}

	@Test
	public void testGetMin() {
		Task1 t1 = new Task1();
		t1.setFirstIntNmbr(8);
		t1.setSecondIntNmbr(2);
		t1.setThirdIntNmbr(4);
		assertTrue(2 == t1.getMin());
	}

	@Test
	public void testGetMax() {
		Task1 t1 = new Task1();
		t1.setFirstIntNmbr(8);
		t1.setSecondIntNmbr(2);
		t1.setThirdIntNmbr(4);
		assertTrue(8 == t1.getMax());
	}

	@Test
	public void testGetErrorName() {
		Task1 t1 = new Task1();
		assertEquals("Bad Request", t1.getErrorName(400));
		assertEquals("Unauthorized", t1.getErrorName(401));
		assertEquals("Internal Server Error", t1.getErrorName(500));
		assertEquals("Not Implemented", t1.getErrorName(501));
	}

	@Test
	public void testSameDogName() {
		Dog dog1 = new Dog("1", Dog.Breed.BOXER, 5);
		Dog dog2 = new Dog("0", Dog.Breed.BEAGLE, 8);
		Dog dog3 = new Dog("2", Dog.Breed.COLLIE, 1);
		assertEquals("No", Dog.sameDogName(dog1, dog2, dog3));

		Dog dog11 = new Dog("1", Dog.Breed.BOXER, 5);
		Dog dog22 = new Dog("0", Dog.Breed.BEAGLE, 8);
		Dog dog33 = new Dog("0", Dog.Breed.COLLIE, 1);
		assertEquals("Yes", Dog.sameDogName(dog11, dog22, dog33));
		
		Dog dog111 = new Dog("0", Dog.Breed.BOXER, 5);
		Dog dog221 = new Dog("1", Dog.Breed.BEAGLE, 8);
		Dog dog331 = new Dog("0", Dog.Breed.COLLIE, 1);
		assertEquals("Yes", Dog.sameDogName(dog111, dog221, dog331));
		
		Dog dog1111 = new Dog("1", Dog.Breed.BOXER, 5);
		Dog dog2211 = new Dog("1", Dog.Breed.BEAGLE, 8);
		Dog dog3311 = new Dog("0", Dog.Breed.COLLIE, 1);
		assertEquals("Yes", Dog.sameDogName(dog1111, dog2211, dog3311));
		
		Dog dog11111 = new Dog("0", Dog.Breed.BOXER, 5);
		Dog dog22111 = new Dog("0", Dog.Breed.BEAGLE, 8);
		Dog dog33111 = new Dog("0", Dog.Breed.COLLIE, 1);
		assertEquals("Yes", Dog.sameDogName(dog11111, dog22111, dog33111));	
	}
	
	@Test
	public void testGetOldestDog() {
		Dog dog1 = new Dog("1", Dog.Breed.BOXER, 5);
		Dog dog2 = new Dog("0", Dog.Breed.BEAGLE, 8);
		Dog dog3 = new Dog("2", Dog.Breed.COLLIE, 1);
		ArrayList<Dog> dogs = new ArrayList<>();
		dogs.add(dog1);
		dogs.add(dog2);
		dogs.add(dog3);
		assertEquals("8 year Beagle", Dog.getOldestDog(dogs));
	}

}
