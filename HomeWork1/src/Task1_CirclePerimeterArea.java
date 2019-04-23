import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1_CirclePerimeterArea {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter radius: ");
		int radius = Integer.parseInt(br.readLine());
		
		double perimeter = 2 * Math.PI * radius;
		double area = Math.PI * Math.pow(radius, 2);
		
		System.out.println("Perimeter of a circle: " + perimeter);
		System.out.println("Area of a circle: " + area);

	}

}
