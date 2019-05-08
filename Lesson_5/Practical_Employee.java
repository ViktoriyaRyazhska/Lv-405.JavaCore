package Lesson_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practical_Employee {
	private String name;
	private int depatmentNumber;
	private int salary;
	
	public Practical_Employee(String name, int depatmentNumber, int salary) {
		this.name = name;
		this.depatmentNumber = depatmentNumber;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepatmentNumber() {
		return depatmentNumber;
	}

	public void setDepatmentNumber(int depatmentNumber) {
		this.depatmentNumber = depatmentNumber;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	@Override
	public String toString() {
		return "Practical_Employee [name=" + name + ", depatmentNumber=" + depatmentNumber + ", salary=" + salary + "]";
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		Practical_Employee[] em = new Practical_Employee[5];
		em[0] = new Practical_Employee("Andry", 78, 34000);
		em[1] = new Practical_Employee("Dimass", 16, 64000);
		em[2] = new Practical_Employee("Igor", 12, 65820);
		em[3] = new Practical_Employee("Misha", 96, 102000);
		em[4] = new Practical_Employee("Yra", 23, 54000);
		
		System.out.println(em[0]);
		System.out.println(em[1]);
		System.out.println(em[2]);
		System.out.println(em[3]);
		System.out.println(em[4]);
		
		int s1=em[0].getSalary();
		int s2=em[1].getSalary();
		int s3=em[2].getSalary();
		int s4=em[3].getSalary();
		int s5=em[4].getSalary();
		System.out.println(s1+" "+s2+" "+s3+" "+s4+" "+s5 );
		System.out.println("--------------------------------------");
		System.out.println();
		
		int[] array= {s1, s2, s3, s4, s5};  
		System.out.println("Find maximum");
		int max = array[0];
		int i = 0;
		while (i < array.length) {
			if (array[i] > max) {
				max = array[i];
			}
			i++;
		}
		--i;
		String nameE=em[i].getName();
		System.out.println(nameE + " - have the biggest of these salary - " + max + "$");
		System.out.println();
		System.out.println("--------------------------------------");
		System.out.println();
		
		
		
		
		System.out.println("Find all employees of a certain department");
		System.out.println("Input number of Depatment?");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int infoDep = Integer.parseInt(br.readLine());
				
		i = 0;
		System.out.println("Find positive numbers in the array");
		while (i < array.length) {
			if (array[i] == infoDep) {
			System.out.print(array[i]+" ");
			}
			i++;
		}
		System.out.println();
		System.out.println("the the sum of positive numbers in the array is ");
		System.out.println("--------------------------------------");
		System.out.println();
		
		
		
		
		
		
		
		System.out.println("not sort of the Salary:");
		for (int a = 0; a < array.length; a++) {
			System.out.println(array[a]);
		}
		
		int tmp;
		for (int a = 0; a < array.length - 1; a++) {
			for (int j = a + 1; j < array.length; j++) {
				if (array[a] < array[j]) {
					tmp = array[a];
					array[a] = array[j];
					array[j] = tmp;
				}
			}
		}System.out.println("Sort of the Salary:");
		for (int a = 0; a < array.length; a++) {
			System.out.println(array[a]);
		}


	}
	
}
