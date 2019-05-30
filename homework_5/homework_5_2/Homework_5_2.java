package homework_5_2;

class Homework_5_2 {
	public static void main(String[] args) {
		
		Employee[] employees = new Employee[5];
		
		employees[0] = new SalariedEmployee("Jhon", "123456789", 1500);
		employees[1] = new ContractEmployee("Graham", "098765432", 120, 12);
		employees[2] = new SalariedEmployee("Janise", "234567890", 1350);
		employees[3] = new ContractEmployee("Chack Jr.", "987654321", 120, 14);
		employees[4] = new SalariedEmployee("Maisie", "345678901", 1725);
		
		for (byte a = 0; a < employees.length; a++) {
			employees[a].calculatePay();
		}
		
		Employee temp;
		
		for (byte a = 0; a < employees.length - 1; a++) {
			for (int b = a + 1; b < employees.length; b++) {
				if (employees[a].getAvrMonSal() < employees[b].getAvrMonSal()) {
					temp = employees[a];
					employees[a] = employees[b];
					employees[b] = temp;
				}
			}
		}
		
		for (byte a = 0; a < employees.length; a++) {
			System.out.println(employees[a]);
		}
	}
}
