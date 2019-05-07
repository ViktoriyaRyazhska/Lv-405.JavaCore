import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {
    public static void main(String[] args) throws IOException {
        Person person1 = new Person();
        BufferedReader pers1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What name has got first Person?");
        person1.inputName(pers1.readLine());
        BufferedReader persbirthyear1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What year is the birth of the first person!? ");
        person1.inputBirthYear(Integer.parseInt(pers1.readLine()));
        person1.age();
        System.out.println(person1.output());
        System.out.println();


        Person person2 = new Person();
        BufferedReader pers2 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What name has got second Person? ");
        person2.inputName(pers2.readLine());
        BufferedReader persbirthyear2 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What year is the birth of the second person!? ");
        person2.inputBirthYear(Integer.parseInt(pers2.readLine()));
        person2.age();
        System.out.println(person2.output());
        System.out.println();

        Person person3 = new Person();
        BufferedReader pers3 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What name has got third Person?");
        person3.inputName(pers3.readLine());
        BufferedReader persbirthyear3 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What year is the birth of the third person!? ");
        person3.inputBirthYear(Integer.parseInt(pers3.readLine()));
        person3.age();
        System.out.println(person3.output());
        System.out.println();

        Person person4 = new Person();
        BufferedReader pers4 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What name has got fourth Person?");
        person4.inputName(pers4.readLine());
        BufferedReader persbirthyear4 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What year is the birth of the fourth person!? ");
        person4.inputBirthYear(Integer.parseInt(pers4.readLine()));
        person4.age();
        System.out.println(person4.output());
        System.out.println();

        Person person5 = new Person();
        BufferedReader pers5 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What name has got fifth Person?");
        person5.inputName(pers5.readLine());
        BufferedReader persbirthyear5 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What year is the birth of the fifth person!? ");
        person5.inputBirthYear(Integer.parseInt(pers5.readLine()));
        person5.age();
        System.out.println(person5.output());
        System.out.println();
        person1.changeName("Roman");
        System.out.println("We have 5 persons: ");
        System.out.println(person1.output());
        System.out.println(person2.output());
        System.out.println(person3.output());
        System.out.println(person4.output());
        System.out.println(person5.output());

        /*Person pers1 = new Person("Roman", 1995);
        Person pers2 = new Person("Lilian", 1997);
        Person pers3 = new Person("Vasyl", 1996);
        Person pers4 = new Person("Marta", 1998);
        Person pers5 = new Person("Yulik", 1994);
        pers4.inputName("Yulya");
        pers5.changeName("Yaromyr");
        System.out.println(pers4);
        pers4.agePerson();
        System.out.println(pers5);
        pers5.agePerson();
        System.out.println(pers1.output());*/
    }


    private String name;
        private int birthYear;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getBirthYear() { return birthYear; }

        public void setBirthYear(int birthYear) { this.birthYear = birthYear; }


        public Person(String name){
            this.name = name;
        }

        public Person(){
            this.name = name;
            this.birthYear = birthYear;
        }

        @Override
        public String toString(){
            return "Person name and birthYear -> " + name + ", " + birthYear;
        }

        private int age;
        public int age() {
        return 2019 - birthYear;
    }

        public void agePerson(){
            age = 2019 - birthYear;
            System.out.println("Person age = " + age);
        }

    public void inputName (String name) {
        this.name = name;
    }

    public void inputBirthYear (int birthYear) {
        this.birthYear = birthYear;
    }
    public String output() {
        return "Person " + this.name + ", " + this.birthYear + " birth year, " + this.age() + " years old.";
    }

    public String changeName (String nametwo) {
        this.name = nametwo;
        return name;
    }





    }


