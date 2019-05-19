package Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmployeeMain {

	public static void main(String[] args) throws Exception, IOException {
		Employee[] employee = new Employee [5];
		employee [0] = new Employee ("Vasya", 1, 2500);
		employee [1] = new Employee ("Oleg", 2, 3000);
		employee [2] = new Employee ("Mykola", 1, 2800);
		employee [3] = new Employee ("Viktor", 3, 3500);
		employee [4] = new Employee ("Ivan", 2, 3200);
		
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		System.out.println("Chosee the number of department");
		int number = Integer.parseInt(br.readLine());
		
		
		for (int j = 0; j < employee.length; j++) {
			if (number == employee[j].getDepartmentNumber()) {
				System.out.println(employee[j].getName() + ", salary " + employee[j].getSalary());
			}
		}
		
		for (int i = 0; i < employee.length - 1; i++) {
			for(int k = i + 1; k < employee.length; k++) {
				if (employee[i].getSalary() < employee[k].getSalary()) {
					Employee tmp = employee[i];
					employee[i] = employee[k];
					employee[k] = tmp;
					
				}
			}
			
		}
		for (int i = 0; i < employee.length; i++) {
			System.out.println(employee[i]);
			
		}

	}

}
