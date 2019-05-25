public class Dog {

    private String name;
    private int age;
    private breeds breed;

    public enum breeds {
        STAFF,
        DOBERMAN,
        YORK
    }

    public Dog(String name, int age, breeds breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public static boolean getUniqeName(Dog dog1, Dog dog2, Dog dog3) {
        if (dog1.getName().equals(dog2) || dog2.getName().equals(dog3) || dog3.getName().equals(dog1)) {
            return false;
        } else {
            return true;
        }

    }

    public int getAge() {
        return age;
    }

    public static Dog getOldestDog(Dog dog1, Dog dog2, Dog dog3) {
        int dog1Age = dog1.getAge();
        int dog2Age = dog2.getAge();
        int dog3Age = dog3.getAge();

        return (dog1Age >= dog2Age && dog1Age >= dog3Age) ? dog1 : (dog2Age >= dog3Age ) ? dog2 : dog3;
    }

    @Override
    public String toString() {
        return "Dog name is : " + getName() + ", age: " + getAge() + ", breed: " + breed;
    }
}
