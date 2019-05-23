package soft.serve.task2;

public class SalariedEmployee extends Employee implements Pay {
	private int hourlyRate;
	private String socialSecurityNumber;
	private int numberOfHoursWork;

	public SalariedEmployee(int employeeId, String name, int hourlyRate, String socialSecurityNumber,
			int numberOfHoursWork) {
		super(employeeId, name);
		this.hourlyRate = hourlyRate;
		this.socialSecurityNumber = socialSecurityNumber;
		this.numberOfHoursWork = numberOfHoursWork;
	}

	@Override
	public int calculatePay() {

		return hourlyRate * numberOfHoursWork;
	}

	public int getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public int getNumberOfHoursWork() {
		return numberOfHoursWork;
	}

	public void setNumberOfHoursWork(int numberOfHoursWork) {
		this.numberOfHoursWork = numberOfHoursWork;
	}

	@Override
	public String toString() {
		return super.toString() + "SalariedEmployee [hourlyRate=" + hourlyRate + ", socialSecurityNumber="
				+ socialSecurityNumber + ", numberOfHoursWork=" + numberOfHoursWork + "]" + "\n";
	}

}
