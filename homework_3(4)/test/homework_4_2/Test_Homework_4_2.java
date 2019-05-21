package homework_4_2;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;

public class Test_Homework_4_2 {
	
	Dog tdog1 = new Dog("tdog1", Dog.Enbreed.вівчарка, 15);
	Dog tdog2 = new Dog("tdog2", Dog.Enbreed.даксхунд, 13);
	Dog tdog3 = new Dog("tdog3", Dog.Enbreed.пінчер, 15);
	
	@Test
	public void testNotSameName() {
		assertTrue(tdog1.getName() != tdog2.getName());
		assertTrue(tdog2.getName() != tdog3.getName());
		assertTrue(tdog3.getName() != tdog1.getName());
	}
	
	@Test
	public void testNotSameBreed() {
		assertNotEquals(tdog1.getBreed(), tdog2.getBreed());
		assertNotEquals(tdog2.getBreed(), tdog3.getBreed());
		assertNotEquals(tdog3.getBreed(), tdog1.getBreed());
	}
	
	@Ignore
	@Test
	public void testNullObject() {
		assertNull("Тут щось є:", tdog1);
		assertNull("Тут щось є:", tdog2);
		assertNull("Тут щось є:", tdog3);
	}
}
