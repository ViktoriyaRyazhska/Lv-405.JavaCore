package PracticalTask;

public class Employee {
	private String name;
	private int rate;
	private int hours;
	
	public static int totalSum = 0;
	public static int getSalary = 0;
	public static double getBonuses =0 ;
	
	public static int number;
			
	public Employee(String name, int rate, int hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
		totalSum = totalSum + rate;
		getSalary = rate*hours;
		getBonuses = getSalary * (10/(double)100);
		number++;
	}
	public Employee(int rate, String name, int hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
		totalSum = totalSum + rate;
		getSalary = rate*hours;
		getBonuses = getSalary * (10/(double)100);
		number++;
	}
	public Employee(int hours, int rate, String name) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
		getSalary = rate*hours;
		totalSum = totalSum + rate;
		getBonuses = getSalary * (10/(double)100);
		number++;
	}
	public Employee(String name, int rate) {
		this.name = name;
		this.hours = rate;
		totalSum = totalSum + rate;
		number++;
	}
	public Employee(int rate, String name) {
		this.name = name;
		this.hours = rate;
		totalSum = totalSum + rate;
		number++;
	}
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
		totalSum = totalSum - this.rate;
		this.rate = rate;
		totalSum = totalSum + rate;
		getSalary = rate*hours;
		getBonuses = getSalary * (10/(double)100);
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
		getSalary = rate*hours;
		getBonuses = getSalary * (10/(double)100);
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + "]";
	}
	//additional workout 
		public static double avgRate() {
			return totalSum/(double)number;
		} 
}
