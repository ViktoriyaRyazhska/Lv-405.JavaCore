package Lesson_4_HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class myHttpError {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input please number of HTTP Error:");
		int numberError = Integer.parseInt(br.readLine());
		switch (numberError) {
		case 400:
			System.out.println(HttpError.BadRequest);
			break;
		case 401:
			System.out.println(HttpError.Unauthorized);
			break;
		case 402:
			System.out.println(HttpError.PaymentRequired);
			break;
		case 403:
			System.out.println(HttpError.Forbidden);
			break;
		case 404:
			System.out.println(HttpError.NotFound);
			break;
		case 405:
			System.out.println(HttpError.MethodNotAllowed);
			break;
		case 406:
			System.out.println(HttpError.NotAcceptable);
			break;
		case 407:
			System.out.println(HttpError.ProxyAuthenticationRequired);
			break;
		case 408:
			System.out.println(HttpError.RequestTimeout);
			break;
		default:
			System.out.println("Wrong");

		}

	}

}
