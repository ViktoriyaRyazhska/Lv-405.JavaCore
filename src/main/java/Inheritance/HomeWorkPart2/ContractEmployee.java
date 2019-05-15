package SoftServe.Inheritance;

import java.util.Objects;

public class ContractEmployee extends Employee implements HaveSalary {
    private String federalTaxImbiber;
    private int monthlySalary;

    public ContractEmployee(String name, String federalTaxImbiber, int monthlySalary) {
        super(name);
        this.federalTaxImbiber = Objects.requireNonNull(federalTaxImbiber);
        this.monthlySalary = monthlySalary;
    }

    public String getFederalTaxImbiber() {
        return federalTaxImbiber;
    }

    public void setFederalTaxImbiber(String federalTaxImbiber) {
        this.federalTaxImbiber = Objects.requireNonNull(federalTaxImbiber);
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }


    @Override
    public String toString() {
        return super.toString() + "federalTaxImbiber='" +
                federalTaxImbiber + '\'' +
                ", monthlySalary=" + monthlySalary;
    }

    @Override
    public int calculatePay() {
        return monthlySalary;
    }
}
