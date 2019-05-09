package homework_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework_1_3 {
	public static void main(String[] args) throws IOException {
		System.out.println("Введіть тариф 1-ї країни у гривнях за 1-у хвилину");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double с1 = Double.parseDouble(br.readLine());
		System.out.println("Тариф 1-ї країни= " + с1 + " грн/хв");
		
		System.out.println("Введіть тариф 2-ї країни у гривнях за 1-у хвилину");
		double c2 = Double.parseDouble(br.readLine());
		System.out.println("Тариф 1-ї країни= " + с1 + " грн/хв");
		System.out.println("Тариф 2-ї країни= " + c2 + " грн/хв");
		
		System.out.println("Введіть тариф 3-ї країни у гривнях за 1-у хвилину");
		double c3 = Double.parseDouble(br.readLine());
		System.out.println("Тариф 1-ї країни= " + с1 + " грн/хв");
		System.out.println("Тариф 2-ї країни= " + c2 + " грн/хв");
		System.out.println("Тариф 3-ї країни= " + c3 + " грн/хв");
		
		System.out.println("Введіть, будь ласка, тривалість розмови у хв. з абонентом 1-ї країни");
		double t1 = Double.parseDouble(br.readLine());
		System.out.println("Тариф 1-ї країни= " + с1 + " грн/хв;" + " Тривалість розмови " + t1 + "хв.");
		System.out.println("Тариф 2-ї країни= " + c2 + " грн/хв");
		System.out.println("Тариф 3-ї країни= " + c3 + " грн/хв");
		
		System.out.println("Введіть, будь ласка, тривалість розмови у хв. з абонентом 2-ї країни");
		double t2 = Double.parseDouble(br.readLine());
		System.out.println("Тариф 1-ї країни= " + с1 + " грн/хв;" + " Тривалість розмови " + t1 + "хв.");
		System.out.println("Тариф 2-ї країни= " + c2 + " грн/хв;" + " Тривалість розмови " + t2 + "хв.");
		System.out.println("Тариф 3-ї країни= " + c3 + " грн/хв");
		
		System.out.println("Введіть, будь ласка, тривалість розмови  у хв. з абонентом 2-ї країни");
		double t3 = Double.parseDouble(br.readLine());
		System.out.println("Тариф 1-ї країни= " + с1 + " грн/хв;" + " Тривалість розмови " + t1 + "хв.");
		System.out.println("Тариф 2-ї країни= " + c2 + " грн/хв;" + " Тривалість розмови " + t2 + "хв.");
		System.out.println("Тариф 3-ї країни= " + c3 + " грн/хв;" + " Тривалість розмови " + t3 + "хв.");
		System.out.println("Загальна вартість розмови з абонентом 1-ї країни= " + с1 * t1 + "грн.");
		Double g1 = с1 * t1;
		System.out.println("Загальна вартість розмови з абонентом 2-ї країни= " + c2 * t2 + "грн.");	
		Double g2 = c2 * t2;
		System.out.println("Загальна вартість розмови з абонентом 3-ї країни= " + c3 * t3 + "грн.");
		Double g3 = c3 * t3;
		System.out.println("Загальна вартість всіх розмов становить= " + (g1 + g2 + g3) + " грн.");
	
		
	}
	
	
}
