package homework_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework_4_1 {
	
	// «авданн€ є1
	public static void main(String[] args) throws IOException {
		
		int monnum;
		int monnum1;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("Ѕудь ласка, введ≥ть номер вашого м≥с€ц€");
		monnum = Integer.parseInt(br.readLine());
		
		while(monnum < 1 || 13 <= monnum) {
			System.out.println("Ќомеру вашого м≥с€ц€ не маЇ в баз≥ даних");
			System.out.println("¬вед≥ть номер м≥с€ц€ в≥д 1 до 12");
			monnum = Integer.parseInt(br.readLine());
		}
		
		monnum1 = monnum - 1; // ’от≥лось би винести, цей р€док в поле, щоб у сам≥й шапц≥, одразу було видно, що означаЇ monnum1. јле тод≥ не виконувалась д≥€ п≥сл€ "while" ≥ програма падала.
		
		System.out.print("” " + Arrays.monthNames[monnum1] + " " + Arrays.monthDays[monnum1]);
		
		if (Arrays.monthDays[monnum1] == 31) {
			System.out.println(" день.");
		} else if (Arrays.monthDays[monnum1] == 28 || Arrays.monthDays[monnum1] == 30) {
			System.out.println(" дн≥в.");
		}
		
	}
	
}