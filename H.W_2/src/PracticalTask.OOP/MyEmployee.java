package PracticalTask;

public class MyEmployee {

	public static void main(String[] args) {
		Employee empl1 = new Employee("Andry", 150, 300);
		System.out.println (empl1);
		int ts1 = Employee.totalSum;
		int gs1 = Employee.getSalary;
		double gb1 = Employee.getBonuses;
		System.out.println ("total sum - " + ts1);
		System.out.println ("Salary - " + gs1);
		System.out.println ("Bonuses - " + gb1);
		System.out.println ("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
		System.out.println ();
				
		Employee empl2 = new Employee("Eugine", 180, 160);
		System.out.println (empl2);
		empl2.setRate(210);
		System.out.println (empl2);
		int ts2 = Employee.totalSum;
		int gs2 = Employee.getSalary;
		double gb2 = Employee.getBonuses;
		System.out.println ("total sum - " + ts2);
		System.out.println ("Salary - " + gs2);
		System.out.println ("Bonuses - " + gb2);
		System.out.println ("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
		System.out.println ();
		
		Employee empl3 = new Employee("Igor", 230, 140);
		int ts3 = Employee.totalSum;
		int gs3 = Employee.getSalary;
		double gb3 = Employee.getBonuses;
		System.out.println(empl3);
		System.out.println("total sum - " + ts3);
		System.out.println("Salary - " + gs3);
		System.out.println("Bonuses - " + gb3);
		System.out.println();
		empl3.setRate(245);
		empl3.setHours(177);
		ts3 = Employee.totalSum;
		gs3 = Employee.getSalary;
		gb3 = Employee.getBonuses;
		System.out.println(empl3);
		System.out.println("total sum - " + ts3);
		System.out.println("Salary - " + gs3);
		System.out.println("Bonuses - " + gb3);
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
		System.out.println();
		
		double n = Employee.avgRate();
		double s = Employee.totalSum;
		double c = Employee.number;
		System.out.println("Number of persone - " + c);
		System.out.println("total sum rate - " + s);
		System.out.println("avgRate - " + n);
	}

}
