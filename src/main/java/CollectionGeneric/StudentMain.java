package SoftServe.GenericCollection.HomeWork;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 2));
        students.add(new Student("Peter", 2));
        students.add(new Student("Jack", 3));
        students.add(new Student("Adam", 3));
        students.add(new Student("Will", 4));

        students.sort(new Student.compareStudentByName());
        System.out.println(students);

        students.sort(new Student.compareStudentByCourse());
        System.out.println(students);

    }
}
