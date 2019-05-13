
public class Main {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		Employee employee2 = new Employee("Name",50);
		Employee employee3 = new Employee("Name2",10,160);
		
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);
		
		employee3.setRate(20);

		System.out.println(Employee.getTotalSum());
	}

}
