package homework_4_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework_4_1 {

	public static void main(String[] args) throws IOException {
		
		// Завдання №1
		// Присвоєння значень
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Чи всі ваші числа будуть у проміжку між -5 і 5 ?");
		System.out.println("Введіть, будь ласка, ваші три дійсні числа від -10 до 10");
		float flnu1 = Float.parseFloat(br.readLine());
		System.out.println("Ваше перше число= " + flnu1);
		float flnu2 = Float.parseFloat(br.readLine());
		System.out.println("Ваше друге число= " + flnu2);
		float flnu3 = Float.parseFloat(br.readLine());
		System.out.println("Ваше третє число= " + flnu3);
		
		// Обрахунок і вивід інформації
		System.out.println("Ваші числа: " + flnu1 + "; " + flnu2 + "; " + flnu3 + "; ");
		System.out.println("Чи всі ваші числа є у проміжку між -5 та 5 ?");
		if ((-5 <= flnu1 && flnu1 <= 5) && (-5 <= flnu2 && flnu2 <= 5) && (-5 <= flnu3 && flnu3 <= 5)) {
			System.out.println("Відповідь: так");
		} else {
			System.out.println("Відповідь: ні");
		}
		
		// Наступне, завдання №2
		// Ввід даних
		System.out.println();
		System.out.println("Введіть 3-и ваші цілі числа");
		int innu1 = Integer.parseInt(br.readLine());
		System.out.println("Ваші числа: " + innu1);
		int innu2 = Integer.parseInt(br.readLine());
		System.out.println("Ваші числа: " + innu1 + "; " + innu2);
		int innu3 = Integer.parseInt(br.readLine());
		System.out.println("Ваші числа: " + innu1 + "; " + innu2 + "; " + innu3);
		
		// Обрахунок, і вивід інформації про найбільше і найменше число.
		if (innu2 < innu1 && innu3 < innu1) {
			System.out.println("Найбільше число= " + innu1);
		} else if (innu1 < innu2 && innu3 < innu2) {
			System.out.println("Найбільше число= " + innu2);
		} else if (innu1 < innu3 && innu2 < innu3) {
			System.out.println("Найбільше число=" + innu3);
		} else if (innu1 == innu2 && innu1 > innu3) {
			System.out.println("Найбільші числа : " + innu1 + " і " + innu2);		
		} else if (innu2 == innu3 && innu2 > innu1) {
			System.out.println("Найбільші числа : " + innu2 + " і " + innu3);
		} else if (innu3 == innu1 && innu3 > innu2) {
			System.out.println("Найбільші числа : " + innu3 + " і " + innu1);
		}
		
		if (innu2 > innu1 && innu3 > innu1) {
			System.out.println("Найменше число= " + innu1);
		} else if (innu1 > innu2 && innu3 > innu2) {
			System.out.println("Найменше число= " + innu2);
		} else if (innu1 > innu3 && innu2 > innu3) {
			System.out.println("Найменше число= " + innu3);
		} else if (innu1 == innu2 && innu1 < innu3) {
			System.out.println("Найменші числа : " + innu1 + " і " + innu2);		
		} else if (innu2 == innu3 && innu2 < innu1) {
			System.out.println("Найменші числа : " + innu2 + " і " + innu3);
		} else if (innu3 == innu1 && innu3 < innu2) {
			System.out.println("Найменші числа : " + innu3 + " і " + innu1);
		} else {
			System.out.println("Усі ваші числа-- рівні");
		}
		
		// Завдання №3
		// Ввід даних
		System.out.println();
		System.out.println("Введіть номер вашої HTTP- помилки, з наведених нижче");
		System.out.println("400, 401, 402, 403, 404");
		short hter = Short.parseShort(br.readLine());
		
		// Вивід даних
		Methods_4_1.errorName(hter);
			
	}
		
}
