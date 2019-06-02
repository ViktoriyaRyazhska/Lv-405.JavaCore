package MyProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class TrainKineticEnergy {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Визначення шляху який пройде поїзд з використанням кінетичної енергії");
		System.out.println();
		System.out.println("Введіть масу поїзда яку хочете перевірити");
		int Q = Integer.parseInt(br.readLine()); // маса поїзда, т
//		Integer.parseInt(br.readLine())
		System.out.println("Введіть кількість вагонів");
		int n = Integer.parseInt(br.readLine());// кі-сть вагонів, шт
		System.out.println("Введіть величину підйому, що перевіряєте");
		int ik = Integer.parseInt(br.readLine()); // підйом який провіряємо, ‰
		System.out.println("Введіть довжину підйому, який перевіряєте, м");
		int Sk = Integer.parseInt(br.readLine()); // довжина підйому який провіряємо, м
		System.out.println("Введіть величину швидкості при вході на підйом, км/год");
		double Vk = Integer.parseInt(br.readLine()); // швидкість на початку підйому, км/год
		System.out.println("Задайте крок розрахунку по швидкості від 1 до 10");
		int y = Integer.parseInt(br.readLine());// крок розрахунку швидкості

		int P = 240; // вага тепловоза,т
		int q0 = (Q / n)/4;// навантаження на вісь,т
		double Vaver;//середня швидкість
		int[] Ftjaga = { 40000, 32800, 27800, 21400, 17400, 14600, 12400, 10600 };// силя тяги локомотива 2М62 в межах 20-90 км/год
		double Ft=0, Fn, Fk, wo1,wo2,fk,wo, S=0, St; //силя тяги при середній швидкості, силя таги при маким. шв. діапазону, силя тяги при мін. шв. діапазону,
		int x = (80 - 20) / y; //визначення довжини циклу for
		DecimalFormat df= new DecimalFormat ("#.#");
		
		System.out.println("row-  |  Vk  | Vaver| wo1 | wo2 | wo |   Ft  |  fk |   St  |   S   | ");//шапочка таблиці
		
		for (int i = 0, s = 1; i <= x; i++) {
			Vaver = (Vk + (Vk - y)) / 2;
			wo1 = 1.9+0.01*Vaver+0.0003*Vaver*Vaver;
			wo2 = 0.7+((3+0.1*Vaver+0.0025*Vaver*Vaver)/q0);
			wo = (P*wo1+Q*wo2)/(P+Q);

//			System.out.println(Vaver + " " + Vk);
			if (Vaver <= 80 && Vaver >= 70) {
				Fk = Ftjaga[7];
				Fn = Ftjaga[6];
				Ft = Fk - ((Fn - Fk) / (70 - 80)) * 80 + ((Fn - Fk) / (70 - 80)) * Vaver;
//				System.out.println("80-70 Fn:" + Fn + ", Fk:" + Fk + ", Ft:" + Ft);
			}
			if (Vaver < 70 && Vaver >= 60) {
				Fk = Ftjaga[6];
				Fn = Ftjaga[5];
				Ft = Fk - ((Fn - Fk) / (60 - 70)) * 70 + ((Fn - Fk) / (60 - 70)) * Vaver;
//				System.out.println("70-60 Fn:" + Fn + ", Fk:" + Fk + ", Ft:" + Ft);
			}
			if (Vaver < 60 && Vaver >= 50) {
				Fk = Ftjaga[5];
				Fn = Ftjaga[4];
				Ft = Fk - ((Fn - Fk) / (50 - 60)) * 60 + ((Fn - Fk) / (50 - 60)) * Vaver;
//				System.out.println("60-50 Fn:" + Fn + ", Fk:" + Fk + ", Ft:" + Ft);
			}
			if (Vaver < 50 && Vaver >= 40) {
				Fk = Ftjaga[4];
				Fn = Ftjaga[3];
				Ft = Fk - ((Fn - Fk) / (40 - 50)) * 50 + ((Fn - Fk) / (40 - 50)) * Vaver;
//				System.out.println("50-40 Fn:" + Fn + ", Fk:" + Fk + ", Ft:" + Ft);
			}
			if (Vaver < 40 && Vaver >= 30) {
				Fk = Ftjaga[3];
				Fn = Ftjaga[2];
				Ft = Fk - ((Fn - Fk) / (30 - 40)) * 40 + ((Fn - Fk) / (30 - 40)) * Vaver;
//				System.out.println("40-30 Fn:" + Fn + ", Fk:" + Fk + ", Ft:" + Ft);
			}
			if (Vaver < 30 && Vaver >= 25) {
				Fk = Ftjaga[2];
				Fn = Ftjaga[1];
				Ft = Fk - ((Fn - Fk) / (25 - 30)) * 30 + ((Fn - Fk) / (25 - 30)) * Vaver;
//				System.out.println("30-25 Fn:" + Fn + ", Fk:" + Fk + ", Ft:" + Ft);
			}
			if (Vaver < 25 && Vaver >= 20) {
				Fk = Ftjaga[1];
				Fn = Ftjaga[0];
				Ft = Fk - ((Fn - Fk) / (20 - 25)) * 25 + ((Fn - Fk) / (20 - 25)) * Vaver;
//				System.out.println("25-20 Fn:" + Fn + ", Fk:" + Fk + ", Ft:" + Ft);
			};
			fk = Ft/(Q+P);
			St=4.17*(((Vk-y)*(Vk-y)-Vk*Vk)/(fk-wo-ik));
			S=S+St;
			if (Vaver >= 20) {
				System.out.println("row-" + s + " | " + Vk + " | " + Vaver+ " | "+df.format(wo1)+" | " +df.format(wo2)+" | " +df.format(wo)+" | " + Ft + " | "+ df.format(fk) + " | "+df.format(St)+" | " +df.format(S)+" | ");
			};
			Vk = Vk - y;
			s++;
		}
		
		if (S>Sk) {
			System.out.println("Поїзд подолає відстань - "+df.format(S)+"м.");
			System.out.println("Поїзд вагою - "+Q+"т, на підйомі - "+ik+" ‰ подолає підйом, його можна рахувати швидкісним");	
		} else {
		System.out.println("Поїзд подолає відстань лише - "+df.format(S)+"м., що є менше перевяряючої - "+Sk+"м.");		
		System.out.println(+Q+"т, дана вага на підйомі - "+ik+" - не проходить, оскільки довжина підйому є більшою.");
		System.out.println("Отже даний підйом являється розрахунковим і його неможливо подолати за рахунок кінетичної енергії");
		}

	}

}
