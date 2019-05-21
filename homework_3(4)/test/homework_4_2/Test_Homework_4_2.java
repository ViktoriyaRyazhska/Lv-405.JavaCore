package homework_4_2;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;

public class Test_Homework_4_2 {
	
	Dog tdog1 = new Dog("tdog1", Dog.Enbreed.�������, 15);
	Dog tdog2 = new Dog("tdog2", Dog.Enbreed.��������, 13);
	Dog tdog3 = new Dog("tdog3", Dog.Enbreed.�����, 15);
	
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
		assertNull("��� ���� �:", tdog1);
		assertNull("��� ���� �:", tdog2);
		assertNull("��� ���� �:", tdog3);
	}
}
