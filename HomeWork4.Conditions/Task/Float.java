package Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Float {

	public static void main(String[] args) throws Exception, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("a= ");
		float a = Integer.parseInt(br.readLine());
		
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("b= ");
		float b = Integer.parseInt(br1.readLine());
		
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("c= ");
		float c = Integer.parseInt(br2.readLine());
		
		if ((-5<=a && a<=5) && (-5<=b && b<=5) && (-5<=c && c<=5)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		

	}

}