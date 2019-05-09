package homework_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework_1_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Введіть, будь ласка, радіус вашої клумби");
		double rad	=	Integer.parseInt(br.readLine());
		System.out.println("Площа клумби= " + Math.pow(3.14159 * rad, 2));
		System.out.println("Периметр клумби= " + 2 * 3.14159 * rad);
		
	}
}
