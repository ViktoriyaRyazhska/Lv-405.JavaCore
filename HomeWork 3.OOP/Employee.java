package LessonThree.Task;

public class Employee {
	private String name;
	private int rate;
	private int hours;
	private static double totalSum = 0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		totalSum -= getSalary() - getBonuses();
		this.rate = rate;
		totalSum += getSalary() + getBonuses();
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		totalSum -= getSalary() - getBonuses();
		this.hours = hours;
		totalSum += getSalary() + getBonuses();
	}

	public Employee() {
		totalSum += getSalary() + getBonuses();
	}

	public Employee(String name, int rate) {
		this.name = name;
		this.rate = rate;
		totalSum += getSalary() + getBonuses();
	}

	public Employee(String name, int rate, int hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
		totalSum += getSalary() + getBonuses();
	}

	@Override
	public String toString() {
		return "Employee [name= " + name + ", rate= " + rate + ", hours= " + hours + "]";
	}

	public int getSalary() {
		return hours * rate;
	}

	public double getBonuses() {
		return getSalary() * 0.1;
	}

	public static double totalSalary() {
		return totalSum;

	}

}
