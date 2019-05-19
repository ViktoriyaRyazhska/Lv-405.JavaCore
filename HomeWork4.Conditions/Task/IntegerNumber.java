package Task;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntegerNumber {

	public static void main(String[] args) throws Exception, IOException {
			
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("a= ");
		int a = Integer.parseInt(br.readLine());
		
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("b= ");
		int b = Integer.parseInt(br1.readLine());
		
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("c= ");
		int c = Integer.parseInt(br2.readLine());
		
		if (a>b && a>c) {
			System.out.println("max = " + a);
		}
		
		if (b>a && b>c) {
			System.out.println("max = " + b);
		}
		
		if (c>a && c>b) {
			System.out.println("max = " + c);
		}
		
		if (a<b && a<c) {
			System.out.println("min = " + a);
		}
		
		if (b<a && b<c) {
			System.out.println("min = " + b);
		}
		
		if (c<a && c<b) {
			System.out.println("min = " + c);
		}



	}

}
