
public class Employee {
	private String name;
    private double rate;
    private int hours;
    
    private static double totalSum;

    public Employee() {
    	this("Unknown",0.0,0);
    	totalSum += this.getSalary();
    }
    public Employee(String name, double rate) {
    	this(name,rate,0);
    	totalSum += this.getSalary();
    	
    }
	public Employee(String name, double rate, int hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
		totalSum += this.getSalary();
	}
	
	public double getSalary() {
		return this.rate * this.hours;
	}
	
	public double getBonuses() {
		return this.getSalary() * 0.1;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getRate() {
		return rate;
	}
	
	public void setRate(double rate) {
		totalSum = totalSum - this.getSalary();
		this.rate = rate;
		totalSum = totalSum + this.getSalary();
	}
	
	public int getHours() {
		return hours;
	}
	
	public void setHours(int hours) {
		totalSum = totalSum - this.getSalary();
		this.hours = hours;
		totalSum = totalSum + this.getSalary();
	}
	
	public static double getTotalSum() {
		return totalSum;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + "]";
	}
	
	
	
  
}