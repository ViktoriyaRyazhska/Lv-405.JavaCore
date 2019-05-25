import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class DogMain {


    public static void main(String[] args) {


        Dog dog1 = new Dog("Tuzik", 8, Dog.breeds.DOBERMAN);
        Dog dog2 = new Dog("Grelka", 2, Dog.breeds.STAFF);
        Dog dog3 = new Dog("Sharik", 1, Dog.breeds.YORK);

        System.out.println("We have some dogs: ");
        System.out.println("");
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println("");
        System.out.println("If we see result 'true', all names are uniqe: " + Dog.getUniqeName(dog1, dog2, dog3));

        Dog OldestDog = Dog.getOldestDog(dog1, dog2, dog3);
        System.out.println("The oldest dog is: " + OldestDog.getName() + " and it`s " + OldestDog.getAge());



    }



}
