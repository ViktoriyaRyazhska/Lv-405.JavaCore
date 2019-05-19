package Task;

public class Numbers {

	public static void main(String[] args) {
		int numbers[] = {45, -20, 24, -5, 7, 47, -57, 34, 157, 1 };
		int max = numbers[0];
		int i = 0;
		while (i < numbers.length) {
			if (numbers[i]>max) {
				max = numbers[i];
			}
			i++;

		}
		
		System.out.println("Max number = " + max);
		
		int sum = 0;
			
		
		for (int j = 0; j < numbers.length; j++) {
			if (numbers[j]<0) {
				continue;
			} sum += numbers[j];
			
			
			
		}
		
		System.out.println("Sum of positive numbers = " + sum);
		
		int countNegative = 0;
		int countPositive = 0;
		
		for (int j = 0; j < numbers.length; j++) {
			if (numbers[j] < 0) {
				countNegative++;
			} countPositive++;
			
		}
		
		System.out.println("The amount of negative numbers is " + countNegative);
		
		if (countPositive>countNegative) {
			System.out.println("There are more positive values");
		} else {
			System.out.println("There are more negative values");
		}

	}

}
