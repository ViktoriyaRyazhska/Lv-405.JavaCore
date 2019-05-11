package Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Day {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Choose the number of the day");
		int d = Integer.parseInt(br.readLine());
		
		switch (d) {
		case 1:
			System.out.println("Monday");
			System.out.println("Понеділок");
			System.out.println("Понедельник");
			break;
		case 2:
			System.out.println("Tuesday");
			System.out.println("Вівторок");
			System.out.println("Вторник");
			break;
		case 3:
			System.out.println("Wednesday");
			System.out.println("Середа");
			System.out.println("Среда");
			break;
		case 4:
			System.out.println("Thursday");
			System.out.println("Четвер");
			System.out.println("Четверг");
			break;
		case 5:
			System.out.println("Friday");
			System.out.println("П'ятниця");
			System.out.println("Пятница");
			break;
		case 6:
			System.out.println("Saturday");
			System.out.println("Субота");
			System.out.println("Суббота");
			break;
		case 7:
			System.out.println("Sunday");
			System.out.println("Неділя");
			System.out.println("Воскресенье");
			break;
		default:
			System.out.println("Wrong number");
		}
		

	}

}
