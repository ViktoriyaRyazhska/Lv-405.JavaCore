package Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HttpErrorMain {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Choose an error");
		String error = br.readLine();
		switch (error) {
		case "Error400":
			System.out.println("Bad Request");
			break;
		case "Error401":
			System.out.println("Unauthorized");
			break;
		case "Error402":
			System.out.println("Payment Required");
			break;
		case "Error403":
			System.out.println("Forbidden");
			break;
		case "Error404":
			System.out.println("Not Found ");
			break;
		case "Error405":
			System.out.println("Method Not Allowed");
			break;
		default:
			System.out.println("Choose another error");
		}

	}

}
