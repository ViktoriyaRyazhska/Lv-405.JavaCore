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

    /**
     * @return  person's age in integer format or NumberFormatException;
     * if birthdayYear contains non digit characters;
     * @throws NumberFormatException  if birthdayYear contains non digit characters;
     */
    public int age() throws NumberFormatException{

        String birthdayYear = this.getBirthdayYear();

        if(birthdayYear.equals("unknown")){
            return -1;
        }

        for (char c : birthdayYear.toCharArray()) {
            if(!Character.isDigit(c)){
                throw new NumberFormatException("You cannot use non digit character for birthday year");
            }
        }

        return LocalDate.now().getYear() - Integer.parseInt(birthdayYear);
    }

    /**
     * This method update information about Person;
     * @param name person name;
     * @param birthdayYear  birthday year in String format;
     * @throws NumberFormatException  if birthdayYear contains non digit characters;
     */
    public void input(String name, String birthdayYear) throws NumberFormatException{

        for (char c : birthdayYear.toCharArray()) {
             if(!Character.isDigit(c)){
                 throw new NumberFormatException("You cannot use non digit character for birthday year");
             }
        }

        this.name = name;
        this.birthdayYear = birthdayYear;
    }

    public void changeName(String newName){
        this.name = newName;
    }

    public String output(){
        return "Name = " + getName() + "\n" + "Age = " + this.age();
    }

    public static void main(String[] args) {
        try(BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in))) {

            Person[] persons = new Person[5];

            for (int index = 0; index < persons.length; index++) {

                System.out.print("Enter the name = ");
                String personName = consoleReader.readLine();
                System.out.print("Enter the birthday year = ");
                String personBirthdayYear = consoleReader.readLine();

                Person person = new Person();
                person.input(personName, personBirthdayYear);
                persons[index] = person;

            }

            System.out.println(persons[0].output());
            System.out.println(persons[1].output());
            System.out.println(persons[2].output());
            System.out.println(persons[3].output());
            System.out.println(persons[4].output());

        }catch (IOException | NumberFormatException e ){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }


}
