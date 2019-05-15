package SoftServe.Inheritance;

import java.util.Objects;

public abstract class Employee  {
    private String name;
    private String employeeID;
    private static int idCounter = 0;

    public Employee(String name) {
        this.employeeID = String.valueOf(++idCounter);
        this.name = Objects.requireNonNull(name);
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = Objects.requireNonNull(name);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null ) return false;
        if(!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;
        return Objects.equals(employeeID, employee.employeeID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeID);
    }

    @Override
    public String toString() {
        return "Employee " +
                "name='" + name + '\'' +
                ", employeeID='" + employeeID + '\'' + ' ';
    }
}

