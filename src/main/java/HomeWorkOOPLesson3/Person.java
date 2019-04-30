package SoftServe.JavaOOP;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Person {
    private String name;
    private String birthdayYear;

    public Person(){
        this("unknown", "unknown");
    }

    public Person(String name, String birthdayYear) {
        this.name = name;
        this.birthdayYear = birthdayYear;
    }

    public String getName() {
        return name;
    }

    public String getBirthdayYear() {
        return birthdayYear;
    }

    public int age(){
        if(this.birthdayYear.equals("unknown")){
            return -1;
        }
        try {

            return LocalDate.now().getYear() - Integer.parseInt(getBirthdayYear());

        } catch (NumberFormatException e) {
            System.out.println("Incorrect birthday year, you should use only digits");
            return -1;
        }

    }

    public boolean input(String name, String birthdayYear){
        try {
            Integer.valueOf(birthdayYear);

            this.name = name;
            this.birthdayYear = birthdayYear;

        } catch (NumberFormatException e) {
            System.out.println("Incorrect birthday year, you should use only digits");
            return false;
        }

        return true;
    }

    public void changeName(String newName){
        this.name = newName;
    }

    public String output(){
        return "Name = " + getName() + "\n" + "Age = " + this.age();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

        Person[] persons = new Person[5];

        for (int index = 0; index < persons.length; index++) {
            System.out.print("Enter the name = ");
            String personName = consoleReader.readLine();
            System.out.print("Enter the birthday year = ");
            String personBirthdayYear = consoleReader.readLine();
            persons[index] = new Person(personName, personBirthdayYear);
        }

        System.out.println(persons[0].output());
        System.out.println(persons[1].output());
        System.out.println(persons[2].output());
        System.out.println(persons[3].output());
        System.out.println(persons[4].output());

    }


}
