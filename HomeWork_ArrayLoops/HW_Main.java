package soft.serve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HW_Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

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
		
		System.out.println("Enter integers until the first negative number. Count the product of all entered even numbers");
		System.out.println("Product of all entered even numbers: " + productOfEvenNumbersUntilFirstNegativeNum(br));

		Car[] car = new Car[4];

		car[0] = new Car("Crossover", 2018, 4);
		car[1] = new Car("Coupe", 2005, 5);
		car[2] = new Car("Convertible", 2005, 6);
		car[3] = new Car("Sedan", 2014, 3);

		System.out.println("Certain model car by year: " + Arrays.toString(certainModelYear(car, 2005)));
		System.out.println("");
		System.out.println("Ordered by year:" + Arrays.toString(orderedByYear(car)));

	}

	public static Car[] orderedByYear(Car[] car) {
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

	public static Car[] certainModelYear(Car[] car, int yearOfProduction) {
		int counter = 0;
		for (int i = 0; i < car.length; i++) {
			if (car[i].getYearOfProduction() == yearOfProduction) {
				counter++;
			}
		}

		Car[] carYearArray = new Car[counter];
		int i2 = 0;
		for (int i = 0; i < car.length; i++) {
			if (car[i].getYearOfProduction() == yearOfProduction) {
				carYearArray[i2] = car[i];
				i2++;
			}
		}

		return carYearArray;
	}

	public static int getDaysOfMonth(int monthNum) {

		int[] daysOfMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (monthNum > 0 && monthNum <= 12) {
			return daysOfMonth[monthNum - 1];
		} else {
			throw new IllegalArgumentException("Enter number from 1 to 12");
		}

//		switch (monthNumber) {
//		case 1:
//		case 3:
//		case 5:
//		case 7:
//		case 8:
//		case 10:
//		case 12:
//			int[] ar1 = new int[31];
//			for (int i = 0; i < ar1.length; i++) {
//				ar1[i] = i + 1;
//			}
//			return ar1;
//		case 2:
//			int[] ar11 = new int[28];
//			for (int i = 0; i < ar11.length; i++) {
//				ar11[i] = i + 1;
//			}
//			return ar11;
//		case 4:
//		case 6:
//		case 9:
//		case 11:
//			int[] ar111 = new int[30];
//			for (int i = 0; i < ar111.length; i++) {
//				ar111[i] = i + 1;
//			}
//			return ar111;
//		default:
//			throw new IllegalArgumentException("Enter number from 1 to 12");
//		}

	}

	public static String calcSumOrProduct(int[] array) {
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
//		for (int i = 0; i <= array.length; i++) {
//			if ((array[i] > 0) && (i < array.length / 2)) {
//				result += array[i];
//			} else {
//				if ((i > array.length / 2)) {
//					result = (result + 1) * array[i];
//				}
//			}
//		}
//		return result;

//		for (int i = 0; i < array.length; i++) {
//			if ((array[i] < 0) || ((i > array.length / 2)) && (result == 0)) {
//				result = (result + 1) * array[i];
//			}
//			if (i > array.length / 2) {
//				continue;
//			} else {
//				if ((array[i] > 0) && (i < array.length / 2)) {
//					result += array[i];
//				}
//			}
//
//		}
//		return result;

	}

	public static int positionSecondPositiveNum(int[] array) {
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

	public static String minElemAndPosition(int[] array) {
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