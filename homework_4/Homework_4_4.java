package homework_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework_4_4 {

	public static void main(String[] args) throws IOException {
		
		int int1 = 1;
		int product = 1;
		int a = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Почніть вводити невід'ємні цілі числа.");
		System.out.println("Програма зупиниться при першому від'ємному числі.");
		System.out.println("І порахує добуток всіх парних чисел.");
		
		while (int1 >= 0) {	// Щоб не виділяти пам'ять навмання для масива. Одразу ж почнемо множити введені парні числа. А потім їх виведемо.
		int1 = Integer.parseInt(br.readLine());
			if (int1 >= 0 && (int1 % 2) == 0) {
				product = product * int1;
				a++;
			} else if (int1 < 0) {break;}
		}
		if (a == 0) {
			System.out.println("Парні номера не були введені");
		} else {
			System.out.println("Добуток всіх ваших парних чисел = " + product +".");
		}
		
	}

}
