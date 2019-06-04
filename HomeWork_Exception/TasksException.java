import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TasksException {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = 0;
		int b = 0;

		try {
			a = Integer.parseInt(br.readLine());
			b = Integer.parseInt(br.readLine());
			System.out.println(div(a, b));
			System.out.println(readNumber(1, 100));
		} catch (IOException | NumberFormatException e) {
			System.out.println("Enter only numbers");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}

	
	}

	public static double div(double a, double b) throws IllegalArgumentException {
		if (b == 0) {
			throw new IllegalArgumentException("Division by zero");
		}
		return a / b;
	}

	public static List<Integer> readNumber(int start, int end) throws IOException, NumberFormatException {
		int number;
		List<Integer> arrList = new ArrayList();
		boolean isFirstElementExist = false;

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			for (int i = 0; i < 10; i++) {
				number = Integer.parseInt(br.readLine());

				if (number >= start && number <= end) {
					if ((isFirstElementExist == true && (number > arrList.get(i - 1))) || i == 0) {
						arrList.add(number);
						isFirstElementExist = true;
					} else {
						System.out.println("Next number should be greater than previous");
					}
				}

			}

		} catch (IOException | NumberFormatException e) {
			System.out.println("Not a number");
		}

		return arrList;

	}

}
