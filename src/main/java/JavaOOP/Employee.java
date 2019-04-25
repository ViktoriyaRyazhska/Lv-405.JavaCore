package SoftServe.JavaOOP;

public class Employee {
    private String name;
    private double rate;
    private int hours;

    private static double totalSum;

    public Employee(){
        this("Unknown",0.0d,0);
        totalSum += getSalary();
    }

    public Employee(String name, double rate) {
       this(name, rate, 0);
       totalSum += getSalary();
    }

    public Employee(String name, double rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += getSalary();
    }

    public double getSalary(){
        return rate * hours;
    }

    public double getBunuses(){
        return getSalary() * 0.1;
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }

    public int getHours() {
        return hours;
    }

    public static double getTotalSum() {
        return totalSum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRate(double rate) {
        totalSum -= getSalary();
        this.rate = rate;
        totalSum += getSalary();
    }

    public void setHours(int hours) {
       totalSum -= getSalary();
        this.hours = hours;
        totalSum += getSalary();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }


}
