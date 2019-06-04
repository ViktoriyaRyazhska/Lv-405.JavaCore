package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class TrainKineticEnergy {

	static int[] Ftjaga = { 40000, 32800, 27800, 21400, 17400, 14600, 12400, 10600 };// силя тяги локомотива 2М62 в
																						// межах
	// 20-90 км/год
	static double Ft = 0, Fn, Fk, wo1, wo2, fk, wo, S = 0, St; // силя тяги при середній швидкості, силя таги при маким.
	// шв. діапазону, силя тяги при мін. шв. діапазону,

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("<<<<   Додаток для теорії тяги   >>>>");
		System.out.println();
		System.out.println("    1 завдання: Визначення шляху який пройде поїзд з використанням кінетичної енергії");
		System.out.println("    2 завдання: Визначення критичної ваги поїзда");
		// System.out.println(" 3 task: checking the user name for validity»");
		System.out.println("    4 exit");

		for (int m = 0; m < 4 || m > 4;) {
			System.out.println();
			System.out.println("Виберіть завдання: 1-4");
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

	public static double task1() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println();
		System.out.println("+++<<< Визначення шляху який пройде поїзд з використанням кінетичної енергії >>>+++");
		System.out.println();
		System.out.println("Введіть масу поїзда яку хочете перевірити");
		int Q = Integer.parseInt(br.readLine()); // маса поїзда, т
		// Integer.parseInt(br.readLine())
		System.out.println("Введіть кількість вагонів");
		int n = Integer.parseInt(br.readLine());// кі-сть вагонів, шт
		System.out.println("Введіть величину підйому, що перевіряєте");
		double ik = Integer.parseInt(br.readLine()); // підйом який провіряємо, ‰
		System.out.println("Введіть довжину підйому, який перевіряєте, м");
		int Sk = Integer.parseInt(br.readLine()); // довжина підйому який провіряємо, м
		System.out.println("Введіть величину швидкості при вході на підйом, км/год");
		double Vk = Integer.parseInt(br.readLine()); // швидкість на початку підйому, км/год
		System.out.println("Задайте крок розрахунку по швидкості від 1 до 10");
		int y = Integer.parseInt(br.readLine());// крок розрахунку швидкості

		int P = 240; // вага тепловоза,т
		int q0 = (Q / n) / 4;// навантаження на вісь,т
		double Vaver;// середня швидкість
		// int[] Ftjaga = { 40000, 32800, 27800, 21400, 17400, 14600, 12400, 10600 };//
		// силя тяги локомотива 2М62 в межах
		// // 20-90 км/год
		// double Ft = 0, Fn, Fk, wo1, wo2, fk, wo, S = 0, St; // силя тяги при середній
		// швидкості, силя таги при маким.
		// // шв. діапазону, силя тяги при мін. шв. діапазону,
		int x = (80 - 20) / y; // визначення довжини циклу for
		DecimalFormat df = new DecimalFormat("#.#");

		System.out.println();
		System.out.println("row-   |  Vk  | Vaver| wo1  | wo2  | wo   |   Ft    |  fk |  St  |  S  | ");// шапочка
																										// таблиці

		for (int i = 0, s = 1; i <= x; i++) {
			Vaver = (Vk + (Vk - y)) / 2;
			wo1 = 1.9 + 0.01 * Vaver + 0.0003 * Vaver * Vaver;
			wo2 = 0.7 + ((3 + 0.1 * Vaver + 0.0025 * Vaver * Vaver) / q0);
			wo = (P * wo1 + Q * wo2) / (P + Q);

			 System.out.println(Vaver + " " + Vk);
//			int min = ((int)Vaver)/10;
		
			
			Ft= meth(Vaver);
			
//			if (Vaver <= 80 && Vaver >= 70) {
//				// Fk = Ftjaga[7];
//				// Fn = Ftjaga[6];
//				// Ft = Fk - ((Fn - Fk) / (70 - 80)) * 80 + ((Fn - Fk) / (70 - 80)) * Vaver;
//				// // System.out.println("80-70 Fn:" + Fn + ", Fk:" + Fk + ", Ft:" + Ft);
//			} else if (Vaver < 70 && Vaver >= 60) {
//				Fk = Ftjaga[6];
//				Fn = Ftjaga[5];
//				Ft = Fk - ((Fn - Fk) / (60 - 70)) * 70 + ((Fn - Fk) / (60 - 70)) * Vaver;
//				// System.out.println("70-60 Fn:" + Fn + ", Fk:" + Fk + ", Ft:" + Ft);
//			} else if (Vaver < 60 && Vaver >= 50) {
//				Fk = Ftjaga[5];
//				Fn = Ftjaga[4];
//				Ft = Fk - ((Fn - Fk) / (50 - 60)) * 60 + ((Fn - Fk) / (50 - 60)) * Vaver;
//				// System.out.println("60-50 Fn:" + Fn + ", Fk:" + Fk + ", Ft:" + Ft);
//			}
//			if (Vaver < 50 && Vaver >= 40) {
//				Fk = Ftjaga[4];
//				Fn = Ftjaga[3];
//				Ft = Fk - ((Fn - Fk) / (40 - 50)) * 50 + ((Fn - Fk) / (40 - 50)) * Vaver;
//				// System.out.println("50-40 Fn:" + Fn + ", Fk:" + Fk + ", Ft:" + Ft);
//			} else if (Vaver < 40 && Vaver >= 30) {
//				Fk = Ftjaga[3];
//				Fn = Ftjaga[2];
//				Ft = Fk - ((Fn - Fk) / (30 - 40)) * 40 + ((Fn - Fk) / (30 - 40)) * Vaver;
//				// System.out.println("40-30 Fn:" + Fn + ", Fk:" + Fk + ", Ft:" + Ft);
//			}
//
//			if (Vaver < 30 && Vaver >= 25) {
//				Fk = Ftjaga[2];
//				Fn = Ftjaga[1];
//				Ft = Fk - ((Fn - Fk) / (25 - 30)) * 30 + ((Fn - Fk) / (25 - 30)) * Vaver;
//				// System.out.println("30-25 Fn:" + Fn + ", Fk:" + Fk + ", Ft:" + Ft);
//			}
//			if (Vaver < 25 && Vaver >= 20) {
//				Fk = Ftjaga[1];
//				Fn = Ftjaga[0];
//				Ft = Fk - ((Fn - Fk) / (20 - 25)) * 25 + ((Fn - Fk) / (20 - 25)) * Vaver;
//				// System.out.println("25-20 Fn:" + Fn + ", Fk:" + Fk + ", Ft:" + Ft);
//			}
//			;
			fk = Ft / (Q + P);
			St = 4.17 * (((Vk - y) * (Vk - y) - Vk * Vk) / (fk - wo - ik));
			S = S + St;
			if (Vaver >= 20) {
				System.out.printf("row-%2d | %4.1f | %4.1f | %4.1f | %4.1f | %4.1f | %7.1f | %3.1f | %5.1f| %5.1f %n",
						s, Vk, Vaver, wo1, wo2, wo, Ft, fk, St, S);
				// System.out.println();
				// System.out.println("row-" + s + " | " + Vk + " | " + Vaver + " | " +
				// df.format(wo1) + " | "
				// + df.format(wo2) + " | " + df.format(wo) + " | " + Ft + " | " + df.format(fk)
				// + " | "
				// + df.format(St) + " | " + df.format(S) + " | ");
			}
			;
			Vk = Vk - y;
			s++;
		}

		if (S > Sk) {
			System.out.println();
			System.out.println("Поїзд подолає відстань - " + df.format(S) + "м.");
			System.out.println("Поїзд вагою - " + Q + "т, на підйомі - " + ik
					+ " ‰ подолає підйом, його можна рахувати швидкісним");
		} else {
			System.out.println();
			System.out.println(
					"Поїзд подолає відстань лише - " + df.format(S) + "м., що є менше перевяряючої - " + Sk + "м.");
			System.out.println(
					+Q + "т, дана вага на підйомі - " + ik + " - не проходить, оскільки довжина підйому є більшою.");
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
		System.out.println("Введіть радіус кривої, м");
		int R = Integer.parseInt(br.readLine());// радіус кривої, м
		System.out.println("Введіть довжину кривої, м");
		int Sr = Integer.parseInt(br.readLine());// довжина кривої, м

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
			System.out.println("|  " + loc + "   |  " + df.format(Q) + "т.");

			wor = 1;

		}

		return Q;

	}

	static double meth(double Vaver) {
		int min = ((int)Vaver)/10;
		double Ft = 0;
		int n = min / 10 - 1;
		Fk = Ftjaga[n];
		Fn = Ftjaga[n+1];
		Ft = Fk - ((Fn - Fk) / (-10)) * (min+10) + ((Fn - Fk) / (-10)) * Vaver;
		// System.out.println("50-40 Fn:" + Fn + ", Fk:" + Fk + ", Ft:" + Ft);
		return Ft;
	}

}
