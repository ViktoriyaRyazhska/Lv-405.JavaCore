package homework_5_2;

class SalariedEmployee extends Employee implements CalculatePay { // Also, a better idea is to create 2 other classes, that could extend our Salaried Employee to "hourly paid" and "fixed paid". But i suppose it wasn't necessary. )
	
	private int fixMonPay;
		
	// Getters, Setters.
	public int getFixMonPay() {
		return fixMonPay;
	}
	public void getFixMonPay(int fixMonPay) {
		this.fixMonPay = fixMonPay;
	}
	
	// Constructors.
	SalariedEmployee(String name, String sclSecNum, int fixMonPay) {
		super(name, sclSecNum);
		this.fixMonPay = fixMonPay;
	}
	
	// Overrides.
	@Override
	public void calculatePay() {
		super.avrMonSal = fixMonPay;
	}
	
	@Override
	public String toString() {
		return name + ", social security number: " + employeeId + ", average fix monthly wage: " + avrMonSal + ".";
	}

}
