package Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarMain {

	public static void main(String[] args) throws Exception, IOException {
		Car[] car = new Car[4];
		car[0] = new Car("Sedan", 2005, 1.3);
		car[1] = new Car("Hugeback", 2010, 2.0);
		car[2] = new Car("Minibus", 2015, 3.5);
		car[3] = new Car("SUV", 2019, 4.2);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Write model year");
		int year = Integer.parseInt(br.readLine());
		for (int i = 0; i < car.length; i++) {
			if (year == car[i].getYear()) {
				System.out.println(car[i]);
			}

		}

		for (int i = 0; i < car.length - 1; i++) {
			for (int j = i + 1; j < car.length; j++) {
				if (car[i].getYear() < car[j].getYear()) {
					Car tmp = car[i];
					car[i] = car[j];
					car[j] = tmp;
				}

			}

		}
		
		System.out.println("Sort by year:");

		for (int i = 0; i < car.length; i++) {
			
			System.out.println(car[i]);

		}

	}

}
