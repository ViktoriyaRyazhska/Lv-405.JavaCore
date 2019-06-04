package soft.serve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HW_Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("Enter number of month:");
			System.out.println("Days in month: " + getDaysOfMonth(Integer.parseInt(br.readLine())));

			System.out.println("");

			int[] array = { 1, -2, -3, -4, 5, 6, 7, 8, 9, 10 };

			System.out.println(
					"Calculate the sum of first 5 elements if they are positive or product of last 5 element in the other case.");
			System.out.println(calcSumOrProduct(array));

			System.out.println("");

			System.out.println("Position of second positive number is " + positionSecondPositiveNum(array));

			System.out.println("");

			System.out.println("Minimum and its position: " + minElemAndPosition(array));

			System.out.println("");

			System.out.println(
					"Enter integers until the first negative number. Count the product of all entered even numbers");
			System.out.println("Product of all entered even numbers: " + productOfEvenNumbersUntilFirstNegativeNum(br));

			Car[] car = new Car[4];

			car[0] = new Car("Crossover", 2018, 4);
			car[1] = new Car("Coupe", 2005, 5);
			car[2] = new Car("Convertible", 2005, 6);
			car[3] = new Car("Sedan", 2014, 3);

			System.out.println("Certain model car by year: " + Arrays.toString(certainModelYear(car, 2005)));
			System.out.println("");
			System.out.println("Ordered by year:" + Arrays.toString(orderedByYear(car)));
		} catch (IllegalArgumentException | NullPointerException | IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

	public static Car[] orderedByYear(Car[] car) throws IllegalArgumentException {

		if (car == null) {
			throw new IllegalArgumentException("Car array cannot be null");
		}
		Car tmp;
		for (int i = 0; i < car.length - 1; i++) {
			for (int j = i + 1; j < car.length; j++) {
				if (car[i].getYearOfProduction() > car[j].getYearOfProduction()) {
					tmp = car[i];
					car[i] = car[j];
					car[j] = tmp;
				}
			}
		}
		return car;
	}

	public static Car[] certainModelYear(Car[] car, int yearOfProduction)
			throws IllegalArgumentException {
		if (car == null) {
			throw new IllegalArgumentException("Car array cannot be null");
		}

		Car[] carYearArray = new Car[car.length];
		int size = 0;
		for (int i = 0; i < car.length; i++) {
			if (car[i].getYearOfProduction() == yearOfProduction) {
				carYearArray[size++] = car[i];
			}
		}

		return Arrays.copyOf(carYearArray, size);
	}

	public static int getDaysOfMonth(int monthNum) throws IllegalArgumentException {

		int[] daysOfMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (monthNum > 0 && monthNum <= 12) {
			return daysOfMonth[monthNum - 1];
		} else {
			throw new IllegalArgumentException("Enter number from 1 to 12");
		}



	}

	public static String calcSumOrProduct(int[] array) throws IllegalArgumentException {
		if (array == null) {
			throw new IllegalArgumentException("Array cannot be null");
		}
		int sum = 0;
		int product = 1;

		for (int i = 0; i < array.length / 2; i++) {
			if (array[i] < 0) {
				sum = 0;
				break;
			}
			sum += array[i];
		}

		if (sum != 0) {
			return "Sum: " + sum;
		} else {

			for (int i = array.length / 2; i < array.length; i++) {
				product *= array[i];
			}
			return "Product: " + product;
		}

	}

	public static int positionSecondPositiveNum(int[] array) throws IllegalArgumentException{
		if (array == null) {
			throw new IllegalArgumentException("Array cannot be null");
		}
		int secondPositiveNum = 0;
		for (int i = 0; i < array.length / 2; i++) {
			if (array[i] > 0) {
				secondPositiveNum++;
			}
			if (secondPositiveNum == 2) {
				secondPositiveNum = i + 1;
				break;
			}
		}
		if (secondPositiveNum < 2) {
			throw new IllegalArgumentException("There is no second positive number");
		}
		return secondPositiveNum;

	}

	public static String minElemAndPosition(int[] array) throws IllegalArgumentException {
		if (array == null) {
			throw new IllegalArgumentException("Array cannot be null");
		}
		int min = array[0];
		int position = 0;
		for (int i = 0; i < array.length / 2; i++) {
			if (array[i] < array[0]) {
				min = array[i];
				position = i + 1;
			}
		}

		return min + " " + position;
	}

	public static int productOfEvenNumbersUntilFirstNegativeNum(BufferedReader br)
			throws NumberFormatException, IOException {
		if (br == null) {
			throw new IllegalArgumentException("BufferedReader cannot be null");
		}
		int number = 0;
		int product = 1;
		while (true) {
			number = Integer.parseInt(br.readLine());
			if (number < 0) {
				break;
			}
			if ((number & 1) == 0) {
				product *= number;
			}
		}
		return product;

	}

}