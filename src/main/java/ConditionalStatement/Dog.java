package SoftServe.ConditionalStatement;

import java.util.Objects;

public class Dog {
    enum breeds{
        LABRADOR_RETRIEVER,
        GERMAN_SHEPHERD,
        BULLDOG,
        POODLE,
        ROTTWEILER,
        BOXER
    }

    private final String name;
    private  int age;
    private breeds breed;

    public Dog(String name, breeds breed) {
       this(name, 0 ,breed);
    }

    public Dog(String name, int age, breeds breed) {
        this.name = Objects.requireNonNull(name);
        this.age = age;
        this.breed = Objects.requireNonNull(breed);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public breeds getBreed() {
        return breed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return name.equals(dog.name) &&
                breed == dog.breed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, breed);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed=" + breed +
                '}';
    }
}
