import java.time.Year;

class Person {

    private String name;
    private int birthYear;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    //public Person (){

    //}

    public Person (String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }
    public int getAge (){
        return Year.now().getValue() - getBirthYear();
    }

    public String outputUserInformation (){
        return "Name: " + getName() + ", age of person: " + getAge();

    }


}
