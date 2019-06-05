/*
* Copyright (c) Petjalviff
* Ця програма є розроблена на основі дослідів
*/

package MyProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
 * Class опис тут.
 *
 * @version 1.5 05.06.2019
 * @author Андрій Петришин
 */

public class TrainKineticEnergy {
	/**
	 * Головний клас який виконує функцію меню та запускає основні функції
	 * обчислення
	 */
	/** fTjaga - сила тяги локомотива 2М62 */
	public static int[] fTjaga = { 40000, 32800, 27800, 21400, 17400, 14600, 12400, 10600 };
	/**
	 * fTjagaVaverage - силя тяги локомотива в залежності від середньої швидкості
	 * руху поїзда
	 */
	public static double fTjagaVaverage = 0;
	/** fTjagaVmax - сила тяги локомотива при максимальній швидкості діапазону */
	public static double fTjagaVmax;
	/** fTjagaVmin - сила тяги локомотива при мінімальній швидкості діапазону */
	public static double fTjagaVmin;
	/** Опір руху локомотива */
	public static double wo1;
	/** Опір руху поїзда */
	public static double wo2;
	/** питома сила тяги */
	public static double fk;
	/** Питомий опір поїзда та локомотива разом */
	public static double wo;
	/** Загальний шлях, що пройде поїзд */
	public static double S = 0;
	/** Шлях, який пройде поїзд на одному відрізку розрахунку */
	public static double St;

	/**
	 * Основний метод який запускає програму
	 * 
	 * @param args
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("<<<<   Додаток для теорії тяги   >>>>");
		System.out.println();
		System.out.println("    1 завдання: Визначення шляху який пройде поїзд з використанням кінетичної енергії");
		System.out.println("    2 завдання: Визначення критичної ваги поїзда");
		System.out.println("    3 exit");

		for (int m = 0; m < 3 || m > 3;) {
			System.out.println();
			System.out.println("Menu");
			System.out.println("Виберіть завдання: 1-3");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			m = Integer.parseInt(br.readLine());
			switch (m) {
			case 1:
				task1();
				break;
			case 2:
				task2();
				break;
			case 4:
				System.out.println("Завершення роботи, так - 1 або ні - 2");
				int b = Integer.parseInt(br.readLine());
				switch (b) {
				case 1:
					System.out.println("Godbye");
					break;
				case 2:
					m = 0;
					break;
				}
				break;
			default:
				System.out.println("Wrong");
				System.out.println("----------------------------------");
				break;
			}
		}

	}

	/**
	 * функція, яка визначає силу тяги при певній середній швидкості
	 * 
	 * @param Vaverage
	 * @return fTjagaVaverage
	 */
	public static double meth(double Vaverage) {
		int Vmax = (((int) Vaverage + 10) / 10) * 10;
		double fTjagaVaverage;
		int nm = ((int) Vaverage) / 10 - 1;
		fTjagaVmin = fTjaga[nm];
		fTjagaVmax = fTjaga[nm + 1];

		fTjagaVaverage = (fTjagaVmax - ((fTjagaVmin - fTjagaVmax) / (-10)) * Vmax)
				+ +((fTjagaVmin - fTjagaVmax) / (-10)) * Vaverage;

		return fTjagaVaverage;
	}

	/**
	 * Метод визначення шляху який пройде поїзд з використанням кінетичної енергії
	 * та сили тяги
	 * 
	 * @return S
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public static double task1() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("#.#");
		System.out.println();
		System.out.println("+++<<< Визначення шляху який пройде поїзд з використанням кінетичної енергії >>>+++");
		System.out.println();
		System.out.println("Введіть масу поїзда яку хочете перевірити");
		int Q = Integer.parseInt(br.readLine());
		System.out.println("Введіть кількість вагонів");
		int n = Integer.parseInt(br.readLine());
		System.out.println("Введіть величину підйому, що перевіряєте ‰");
		double ik = Integer.parseInt(br.readLine());
		System.out.println("Введіть довжину підйому, який перевіряєте, м");
		int Sk = Integer.parseInt(br.readLine());
		System.out.println("Введіть величину швидкості при вході на підйом, км/год");
		double Vk = Integer.parseInt(br.readLine());
		System.out.println("Задайте крок розрахунку по швидкості від 1 до 10");
		int y = Integer.parseInt(br.readLine());
		/** P - вага локомотива, т */
		int P = 240;
		/** q0 - навантаження на вісь колісної пари вагону, т */
		int q0 = (Q / n) / 4;
		/** Vaverage - середня швидкість рух поїзда км/год */
		double Vaverage;

		/** x - визначення довжини циклу for */
		int x = (80 - 20) / y;
		System.out.println();
		System.out.println("row-   |  Vk  | Vaver| wo1  | wo2  | wo   |fTjagaVaverage|  fk |  St  |   S    |");
		System.out.println("-------|------|------|------|------|------|--------------|-----|------|--------|");

		for (int i = 0, count = 1; i < x; i++) {
//			double fTjagaVaverage;
			Vaverage = (Vk + (Vk - y)) / 2;
			wo1 = 1.9 + 0.01 * Vaverage + 0.0003 * Vaverage * Vaverage;
			wo2 = 0.7 + ((3 + 0.1 * Vaverage + 0.0025 * Vaverage * Vaverage) / q0);
			wo = (P * wo1 + Q * wo2) / (P + Q);
			fTjagaVaverage = meth(Vaverage);
			fk = fTjagaVaverage / (Q + P);
			St = 4.17 * (((Vk - y) * (Vk - y) - Vk * Vk) / (fk - wo - ik));
			S = S + St;
			if (Vaverage >= 20) {
				System.out.printf("row-%2d | %4.1f | %4.1f | %4.1f | %4.1f | %4.1f | %12.1f | %3.1f | %5.1f| %6.1f |%n",
						count, Vk, Vaverage, wo1, wo2, wo, fTjagaVaverage, fk, St, S);
			}
			Vk = Vk - y;
			count++;

		}

		if (S > Sk) {
			System.out.println();
			System.out.println("Поїзд подолає відстань - " + df.format(S) + "м.");
			System.out.println("Поїзд вагою - " + Q + "т подолає підйом довжиною "+ Sk+"м та крутизною - " + ik
					+ "‰ - його можна рахувати швидкісним.");
		} else {
			System.out.println();
			System.out.println(
					"Поїзд подолає відстань лише - " + df.format(S) + "м., що є менше перевяряючої - " + Sk + "м.");
			System.out.println(
					"Вага "+Q + "т, на цьому підйомі з крутизною - " + ik + "‰ - не проходить, оскільки довжина перевяряючого підйому є більшою.");
			System.out.println(
					"Отже даний підйом являється розрахунковим і його неможливо подолати за рахунок кінетичної енергії");
		}
		return S;
	}

	public static double task2() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("#");
		System.out.println("++++<<< Визначення критичної ваги поїзда >>>++++");

		System.out.println();
		System.out.println("Введіть підйом який провіряємо, ‰");
		double ik = Integer.parseInt(br.readLine()); // підйом який провіряємо, ‰
		
		String[] locomotive = { "ВЛ11/ВЛ10", "ВЛ80", "ВЛ40", "2М62", "М62", "2ТЕ10м", "М62м", "ТЕ33АС", "ЧМЕ3" };// назва
																													// локомотиву
		int[] Ftjaga1 = { 62000, 69000, 34000, 72000, 36000, 81300, 40000, 51200, 36000 };// сила тяги локомотива при
																							// рушанні з місця, кгс
		int[] Ftjaga2 = { 46000, 51200, 25600, 40000, 20000, 48000, 32000, 43540, 23000 };// критична сила тяги
																							// локомотива, кгс
		int[] Ploc = { 184, 186, 93, 240, 120, 276, 120, 138, 120 };
		double[] Vloc = { 46.5, 43.5, 43.5, 20, 20, 26.4, 26.4, 24.5, 11.4 };// критична швидкість локомотива, км/год
		double Q = 0, q0, wo1, wo2, wor, Qv, no;
		q0 = 23;// навантаження на вісь вагону, т
		Qv = 92;// вага одного вагону брутто, т з вантажем
		no = 4;//

		for (int i = 0; i < Ftjaga1.length; i++) {
			String loc = locomotive[i];
			int Ft1 = Ftjaga1[i];
			int Ft2 = Ftjaga2[i];
			double V = Vloc[i];
			int P = Ploc[i];

			wo1 = 1.9 + 0.01 * V + 0.0003 * V * V;// опір руху локомотива
			wo2 = 0.7 + ((3 + 0.1 * V + 0.0025 * V * V) / q0);// опір руху вагона
			Q = (Ft2 - (wo1 + ik) * P) / (wo2 + ik);
			System.out.printf("%12s | %6.1f т.|%n",loc,Q);

			wor = 1;

		}

		return Q;

	}

}
