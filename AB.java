import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AB {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.println("Hello dear, input please a");
		int a = Integer.parseInt(br.readLine());
		System.out.println("and input b");
		int b = Integer.parseInt(br.readLine());
		int c = a+b;
		System.out.println("a+b=" + c);
		int d = a-b;
		System.out.println("a-b=" + d);
		double f = a*b;
		System.out.println("a*b=" + f);
		double h = a/b;
		System.out.println("a/b=" + h);
		System.out.println("How are you?");
		String name = br.readLine();
		System.out.println("You are " + name);

	}

}

