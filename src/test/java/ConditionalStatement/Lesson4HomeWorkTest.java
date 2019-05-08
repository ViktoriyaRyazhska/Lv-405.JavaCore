package SoftServe.ConditionalStatement;

import org.junit.Test;

import static org.junit.Assert.*;

public class Lesson4HomeWorkTest {
    private Dog dog1;
    private Dog dog2;
    private Dog dog3;


    @Test
    public void isBelongToRange() {
        assertTrue(Lesson4HomeWork.isBelongToRange(-5,4.99,5));
        assertFalse(Lesson4HomeWork.isBelongToRange(-5.01,0,0));
    }

    @Test
    public void getMax() {
        assertEquals(23, Lesson4HomeWork.getMax(5,23,-554));
        assertEquals(223, Lesson4HomeWork.getMax(223,23,-554));
        assertEquals(5555, Lesson4HomeWork.getMax(5555,23,-554));
        assertEquals(1, Lesson4HomeWork.getMax(1,-23453423,-554));
        assertEquals(1, Lesson4HomeWork.getMax(1,0,0));
        assertEquals(0, Lesson4HomeWork.getMax(0,0,0));
    }

    @Test
    public void getMin() {
        assertEquals(-554, Lesson4HomeWork.getMin(5,23,-554));
        assertEquals(-3423, Lesson4HomeWork.getMin(223,-3423,-554));
        assertEquals(23, Lesson4HomeWork.getMin(5555,23,554));
        assertEquals(-23453423, Lesson4HomeWork.getMin(1,-23453423,-554));
        assertEquals(0, Lesson4HomeWork.getMin(1,0,0));
        assertEquals(0, Lesson4HomeWork.getMin(0,0,0));
    }

    @Test
    public void getErrorName() {
        assertEquals("Bad Request", Lesson4HomeWork.getErrorName(400));
        assertEquals("Unauthorized", Lesson4HomeWork.getErrorName(401));
        assertEquals("Forbidden", Lesson4HomeWork.getErrorName(403));
        assertEquals("Not Found", Lesson4HomeWork.getErrorName(404));
    }


    @Test
    public void isDogNameUnique() {
         dog1 = new Dog("Name1",8, Dog.breeds.GERMAN_SHEPHERD);
         dog2 = new Dog("Name1",2, Dog.breeds.POODLE);
         dog3 = new Dog("Nick",5, Dog.breeds.LABRADOR_RETRIEVER);
        assertFalse(Lesson4HomeWork.isDogNameUnique(dog1,dog2,dog3));
        dog1 = new Dog("name",2,Dog.breeds.GERMAN_SHEPHERD);
        dog2 = new Dog("name1",2,Dog.breeds.GERMAN_SHEPHERD);
        dog3 = new Dog("name2",2,Dog.breeds.GERMAN_SHEPHERD);
        assertTrue(Lesson4HomeWork.isDogNameUnique(dog1,dog2,dog3));
        dog1 = new Dog("name",8, Dog.breeds.GERMAN_SHEPHERD);
        dog2 = new Dog("Name",2, Dog.breeds.POODLE);
        dog3 = new Dog("NAME",5, Dog.breeds.LABRADOR_RETRIEVER);
        assertTrue(Lesson4HomeWork.isDogNameUnique(dog1,dog2,dog3));
    }

    @Test
    public void getOldestDog() {
        dog1 = new Dog("name",2,Dog.breeds.GERMAN_SHEPHERD);
        dog2 = new Dog("name1",5,Dog.breeds.GERMAN_SHEPHERD);
        dog3 = new Dog("name2",2,Dog.breeds.GERMAN_SHEPHERD);
        assertEquals(dog2, Lesson4HomeWork.getOldestDog(dog1,dog2,dog3));
        dog1 = new Dog("name",1,Dog.breeds.GERMAN_SHEPHERD);
        dog2 = new Dog("name1",10,Dog.breeds.GERMAN_SHEPHERD);
        dog3 = new Dog("name2",30,Dog.breeds.GERMAN_SHEPHERD);
        assertEquals(dog3, Lesson4HomeWork.getOldestDog(dog1,dog2,dog3));
        dog1 = new Dog("name",1,Dog.breeds.GERMAN_SHEPHERD);
        dog2 = new Dog("name1",1,Dog.breeds.GERMAN_SHEPHERD);
        dog3 = new Dog("name2",1,Dog.breeds.GERMAN_SHEPHERD);
        assertEquals(dog1, Lesson4HomeWork.getOldestDog(dog1,dog2,dog3));

    }
}