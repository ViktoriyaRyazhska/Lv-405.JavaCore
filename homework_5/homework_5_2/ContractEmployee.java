package homework_5_2;

class ContractEmployee extends Employee implements CalculatePay { // Also, a better idea is to create 2 other classes, that could extend our Contract Employee to "hourly paid" and "fixed paid". But i suppose it wasn't necessary. )
	
	private int numHrsWrk;
	private int hrlRate;

	// Getters, Setters.
	public int getNumHrsWrk() {
		return numHrsWrk;
	}
	public void getNumHrsWrk(int numHrsWrk) {
		this.numHrsWrk = numHrsWrk;
	}
	public int getHrlRate() {
		return hrlRate;
	}
	public void getHrlRate(int hrlRate) {
		this.hrlRate = hrlRate;
	}
	
	// Constructors.
	ContractEmployee(String name, String fdrlTaxIdMmbr, int numHrsWrk, int hrlRate) {
		super(name, fdrlTaxIdMmbr);
		this.numHrsWrk = numHrsWrk;
		this.hrlRate = hrlRate;
	}
	
	// Overrides.
	@Override
	public void calculatePay() {
		avrMonSal = numHrsWrk * hrlRate;
	}

	@Override
	public String toString() {
			return name + ", federal tax id member: " + employeeId + ", average composite monthly wage: " + avrMonSal + ".";
	}
}
