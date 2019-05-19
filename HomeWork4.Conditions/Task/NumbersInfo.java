package Task;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class NumbersInfo {

	public static void main(String[] args) throws Exception, IOException {
		Numbers number1 = new Numbers();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Set number 1");
		number1.setA(Integer.parseInt(br.readLine()));

		Numbers number2 = new Numbers();
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Set number 2");
		number2.setA(Integer.parseInt(br1.readLine()));

		Numbers number3 = new Numbers();
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Set number 3");
		number3.setA(Integer.parseInt(br2.readLine()));
		Numbers.getSumm();

	}

}