package SoftServe.JavaOOP;

public class JavaOOPLesson3 {

    public static void main(String[] args) {
        Employee student1 = new Employee("John",20, 160);
        Employee student2 = new Employee("Denis",15, 150);
        Employee student3 = new Employee("Peter",20, 155);
        Employee student4 = new Employee("Nikolas",20, 165);
        Employee student5 = new Employee("Adam",20, 160);
        Employee student6 = new Employee("Jenifer",20, 180);


        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student5);
        System.out.println(student6);

        System.out.println("student1.getSalary() = " + student1.getSalary());
        System.out.println("student2.getSalary() = " + student2.getSalary());
        System.out.println("student3.getSalary() = " + student3.getSalary());
        System.out.println("student4.getSalary() = " + student4.getSalary());
        System.out.println("student5.getSalary() = " + student5.getSalary());
        System.out.println("student6.getSalary() = " + student6.getSalary());

        System.out.println("student1.getBunuses() = " + student1.getBunuses());
        System.out.println("student2.getBunuses() = " + student2.getBunuses());
        System.out.println("student3.getBunuses() = " + student3.getBunuses());
        System.out.println("student4.getBunuses() = " + student4.getBunuses());
        System.out.println("student5.getBunuses() = " + student5.getBunuses());
        System.out.println("student6.getBunuses() = " + student6.getBunuses());

        System.out.println("Employee.getTotalSum() = " + Employee.getTotalSum());

    }


}

