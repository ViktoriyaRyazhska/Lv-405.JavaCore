package homework_5_2;

abstract class Employee implements CalculatePay { // Have implemented calculatePay for easier use in Homework_5_2-class.
	
	protected String name;
	protected String employeeId;
	protected int avrMonSal;
	
	// Getters, Setters.
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAvrMonSal() {
		return avrMonSal;
	}
	
	// Constructors.
	Employee(String name, String employeeId) {
		this.name = name;
		this.employeeId = employeeId;
	}
	
	// Methods.
	
	// Overrides.
	@Override
	public abstract String toString();
}
