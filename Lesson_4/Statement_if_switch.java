package Lesson_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Statement_if_switch {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader numberDay = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Use operator IF");
		System.out.println("Input please the number of the day of the week");
		int nd = Integer.parseInt(numberDay.readLine());
		if (nd==1) {
			System.out.println(nd + " - is Monday/це Понеділок/это Понедельник");
		}
		if (nd==2) {
			System.out.println(nd + " - is Tuesday/це Вівторок/это Вторник");
		}
		if (nd==3) {
			System.out.println(nd + " - is Wednesday/це Середа/это Среда");
		}
		if (nd==4) {
			System.out.println(nd + " - is Thursday/це Четвер/это Четверг");
		}
		if (nd==5) {
			System.out.println(nd + " - is Friday/це П'ятниця/это Пятница");
		}
		if (nd==6) {
			System.out.println(nd + " - is Saturday/це Субота/это Суббота");
		}
		if (nd==7) {
			System.out.println(nd + " - is Sunday/це Неділя/это Воскресенье");
		}
		if (nd==0||nd<0||nd>7) {
			System.out.println(nd + " - day does not exist/день не існує/день не существует");
		}
		System.out.println("-------------------------------------------------------");
		System.out.println();
				
		System.out.println("Use operator SWITCH");
		System.out.println("Input please the number of the day of the week");
		nd = Integer.parseInt(numberDay.readLine());
		switch(nd) {
		case 1:
			System.out.println(nd + " - is Monday/це Понеділок/это Понедельник");
			break;
		case 2:
			System.out.println(nd + " - is Tuesday/це Вівторок/это Вторник");
			break;
		case 3:
			System.out.println(nd + " - is Wednesday/це Середа/это Среда");
			break;
		case 4:
			System.out.println(nd + " - is Thursday/це Четвер/это Четверг");
			break;
		case 5:
			System.out.println(nd + " - is Friday/це П'ятниця/это Пятница");
			break;
		case 6:
			System.out.println(nd + " - is Saturday/це Субота/это Суббота");
			break;
		case 7:
			System.out.println(nd + " - is Sunday/це Неділя/это Воскресенье");
			break;
		default:
			System.out.println("Wrong!");
			
			
		}
	}

}
