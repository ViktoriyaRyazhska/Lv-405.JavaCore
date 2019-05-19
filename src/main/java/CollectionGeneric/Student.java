package SoftServe.GenericCollection.HomeWork;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Student {
    private static int idCounter = 0;
    private int id;
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = Objects.requireNonNull(name);
        this.course = course;
        this.id = ++idCounter;
    }

    public void printStudentsByCourse(List<Student> studList, int course) throws IllegalArgumentException{
        if(studList == null){
            throw new IllegalArgumentException("List cannot be null");
        }

        Iterator<Student> studIter = studList.iterator();
        while(studIter.hasNext()){
            Student studTmp = studIter.next();
            if(studTmp.course == course){
                System.out.println();
            }
        }
    }

     static class compareStudentByName implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            return o1.name.compareTo(o2.name);
        }
    }
    static class compareStudentByCourse implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            return o1.course - o2.course;
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course=" + course +
                '}' + '\n';
    }
}
