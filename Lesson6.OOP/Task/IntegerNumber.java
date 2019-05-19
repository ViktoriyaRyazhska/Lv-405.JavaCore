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
		

		switch (max ()) {
		case  a>b && a>c :
			System.out.println("max " + a);
			break;
		case  b>a && b>c :
			System.out.println("max " + b);
			break;
		case  c>a && c>b :
			System.out.println("max " + c);
			break;
		}
		
		switch (min) {
		case  a<b && a<c :
			System.out.println("min " + a);
			break;
		case  b<a && b<c :
			System.out.println("min " + b);
			break;
		case  c<a && c<b :
			System.out.println("min " + c);
			break;
		}

	}

}