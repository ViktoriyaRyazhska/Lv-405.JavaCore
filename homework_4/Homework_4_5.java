package homework_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework_4_5 {

	static int range1000 = 1000;
	static int range10000 = 10000;
	
	static String inpstr;
	
	static Car car1 = new Car("Тойота", "хеджбек", 2005, 2.5);
	static Car car2 = new Car("Тойота", "позашляховик", 2001, 4.2);
	static Car car3 = new Car("Мерседес", "седан", 2013, 2.6);
	static Car car4 = new Car("БМВ", "універсал", 2016, 2.0);
	
	static Car[] park = {car1, car2, car3, car4};
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("Введіть, будь ласка, рік випуску потрібного вам авто.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean bool = false;
		
		while (bool == false) {
			
			inpstr = br.readLine();
			for (int a = 0; a < park.length; a++) {
				if (park[a].getYearofprod() == Integer.parseInt(inpstr)) {
					System.out.println(park[a]);
					bool = true;
				}
			}
			if (bool == false) {
				if (range1000 <= Integer.parseInt(inpstr) && Integer.parseInt(inpstr) < range10000) { 
					System.out.println("Автомобіля з таким роком випуску немає у базі даних.");
					System.out.println("Введіть, будь ласка, ще раз рік випуску потрібного вам авто.");
				} else if (Integer.parseInt(inpstr) < range1000 || range10000 <= Integer.parseInt(inpstr)) {// Повторно описував умови "if", лише, щоб легше було прочитати.
					System.out.println("Введіть потрібний вам рік у форматі <рррр>.");
				}
			}
		}
		
		// Сортування за роком. Від найменшого до найбільшого.
		System.out.println();
		System.out.println("Сортування від найстаршого до наймолодшого:");
		System.out.println();
		
		Car temp;
		for (int a = 0; a < park.length - 1; a++) {
			for (int b = a + 1; b < park.length; b++) {
				if (park[b].getYearofprod() < park[a].getYearofprod()) {
					temp = park[a];
					park[a] = park[b];
					park[b] = temp;
				}
			}
		}
		
		for (int a = 0; a < park.length; a++) {
			System.out.println(park[a]);
		}
	}

}
