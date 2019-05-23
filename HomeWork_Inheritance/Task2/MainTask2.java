package soft.serve.task2;

import java.util.Arrays;

public class MainTask2 {
	public static void main(String[] args) {
		Employee[] employee = new Employee[6];
		employee[0] = new SalariedEmployee(132132, "Q", 34, "H87983Jm", 8);
		employee[1] = new SalariedEmployee(567532, "W", 556, "H883f", 10);
		employee[2] = new SalariedEmployee(34532, "W2", 222, "H9wewJ", 4);
		employee[3] = new ContractEmployee(4334, "E", 1200, "JL987");
		employee[4] = new ContractEmployee(5434, "R", 3400, "JG483");
		employee[5] = new ContractEmployee(2344, "RF", 1800, "GS83");

		System.out.println(Arrays.toString(employee));

		System.out.println("\n======================================\n");

		for (Employee i : employee) {
			System.out.println(i.getEmployeeId() + ", " + i.getName() + "; Average monthly wage = " + i.calculatePay());
			System.out.println("+----------------------------------------------------+");
		}

		System.out.println("********************************************");
		Arrays.sort(employee, new SortByDescendingAverageMonthlyWage());
		for (int i = 0; i < employee.length; i++)
			System.out.println(employee[i] + "Average monthly wage = " + employee[i].calculatePay() + "\n");

	}
}
