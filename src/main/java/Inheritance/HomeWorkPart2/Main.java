package SoftServe.Inheritance;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[6];

        employees[0] = new SalariedEmployee("John","#12345",160,20);
        employees[1] = new SalariedEmployee("Robert","#34523",160,18);
        employees[2] = new SalariedEmployee("Bill","#12395",163,22);
        employees[3] = new ContractEmployee("Greg","&2222",2000);
        employees[4] = new ContractEmployee("Alan","&3333",1800);
        employees[5] = new ContractEmployee("Peter","&4444",2150);


        Arrays.sort(employees, (emplOne, emplTwo) -> {
            // We would have avoided this(class cast) if we were implemented HaveSalary in Employee class
            // and just overwrite calculatePay() method in child classes
            int emplOneSalary = emplOne.getClass() == ContractEmployee.class ?
                    ((ContractEmployee)emplOne).calculatePay() : ((SalariedEmployee)emplOne).calculatePay();
            int emplTwoSalary = emplTwo.getClass() == ContractEmployee.class ?
                    ((ContractEmployee)emplTwo).calculatePay() : ((SalariedEmployee)emplTwo).calculatePay();

            return emplTwoSalary - emplOneSalary;
        });

        for (Employee employee : employees) {
            if(employee.getClass() == ContractEmployee.class){
                System.out.println(employee + " " + ((ContractEmployee)employee).calculatePay());
            }else if(employee.getClass() == SalariedEmployee.class){
                System.out.println(employee + " " + ((SalariedEmployee)employee).calculatePay());
            }
        }
    }
}
