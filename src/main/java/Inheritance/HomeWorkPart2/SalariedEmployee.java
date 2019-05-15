package SoftServe.Inheritance;

import java.util.Objects;

public class SalariedEmployee extends Employee implements HaveSalary{
    private String socialSecurityNumber;
    private int workHours;
    private int hourlyRate;

    public SalariedEmployee(String name, String socialSecurityNumber, int workHours,int hourlyRate) {
        super(name);
        this.socialSecurityNumber = Objects.requireNonNull(socialSecurityNumber);
        this.workHours = workHours;
        this.hourlyRate = hourlyRate;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = Objects.requireNonNull(socialSecurityNumber);
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }


    @Override
    public int calculatePay() {
        return hourlyRate * workHours;
    }

    @Override
    public String toString() {
        return super.toString() +
                "socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", workHours=" + workHours +
                ", hourlyRate=" + hourlyRate;
    }
}
