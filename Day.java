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
			System.out.println("��������");
			System.out.println("�����������");
			break;
		case 2:
			System.out.println("Tuesday");
			System.out.println("³������");
			System.out.println("�������");
			break;
		case 3:
			System.out.println("Wednesday");
			System.out.println("������");
			System.out.println("�����");
			break;
		case 4:
			System.out.println("Thursday");
			System.out.println("������");
			System.out.println("�������");
			break;
		case 5:
			System.out.println("Friday");
			System.out.println("�'������");
			System.out.println("�������");
			break;
		case 6:
			System.out.println("Saturday");
			System.out.println("������");
			System.out.println("�������");
			break;
		case 7:
			System.out.println("Sunday");
			System.out.println("�����");
			System.out.println("�����������");
			break;
		default:
			System.out.println("Wrong number");
		}
		

	}

}
