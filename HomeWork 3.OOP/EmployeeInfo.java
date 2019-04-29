package LessonThree.Task;

public class EmployeeInfo {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.setName("Vasya");
		employee1.setRate(50);
		employee1.setHours(90);

		Employee employee2 = new Employee("Taras", 40);
		employee2.setHours(110);

		Employee employee3 = new Employee("Stepan", 60, 80);

		System.out.println(employee1);
		System.out.println("Total salary " + employee1.getSalary());
		System.out.println("Total bonus " + employee1.getBonuses());
		System.out.println(employee2);
		System.out.println("Total salary " + employee2.getSalary());
		System.out.println("Total bonus " + employee2.getBonuses());
		System.out.println(employee3);
		System.out.println("Total salary " + employee3.getSalary());
		System.out.println("Total bonus " + employee3.getBonuses());
		System.out.println("Total salary of all employees is " + Employee.totalSalary());
	}

}
