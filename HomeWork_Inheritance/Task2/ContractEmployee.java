package soft.serve.task2;

public class ContractEmployee extends Employee implements Pay {

	private int fixedMonthPay;
	private String federalTaxIdmember;

	public ContractEmployee(String name, int employeeId) {
		super(employeeId, name);
	}

	public ContractEmployee(int employeeId, String name, int fixedMonthPay, String federalTaxIdmember) {
		super(employeeId, name);
		this.fixedMonthPay = fixedMonthPay;
		this.federalTaxIdmember = federalTaxIdmember;
	}

	public int getFixedMonthPay() {
		return fixedMonthPay;
	}

	public void setFixedMonthPay(int fixedMonthPay) {
		this.fixedMonthPay = fixedMonthPay;
	}

	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}

	@Override
	public int calculatePay() {
		return fixedMonthPay;
	}

	@Override
	public String toString() {
		return super.toString() + "ContractEmployee [fixedMonthPay=" + fixedMonthPay + ", federalTaxIdmember="
				+ federalTaxIdmember + "]" + "\n";
	}

}
