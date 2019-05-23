package soft.serve.task2;

import java.util.Comparator;

public class SortByDescendingAverageMonthlyWage  implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp2.calculatePay() - emp1.calculatePay();
	}

}
