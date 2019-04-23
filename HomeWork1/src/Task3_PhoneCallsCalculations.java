import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3_PhoneCallsCalculations {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("==========================================");
		
		System.out.println("Enter units per minute.");

		System.out.println("Norway: ");
		double cost_per_minute_norway = Integer.parseInt(br.readLine());

		System.out.println("Sweden: ");
		double cost_per_minute_sweden = Integer.parseInt(br.readLine());

		System.out.println("Denmark: ");
		double cost_per_minute_denmark = Integer.parseInt(br.readLine());
		
		System.out.println("==========================================");

		System.out.println("Enter the minutes by a call.");

		System.out.println("Norway: ");
		double minutes_by_call_norway = Integer.parseInt(br.readLine());

		System.out.println("Sweden: ");
		double minutes_by_call_sweden = Integer.parseInt(br.readLine());

		System.out.println("Denmark: ");
		double minutes_by_call_denmark = Integer.parseInt(br.readLine());
		
		System.out.println("==========================================");

		System.out.println("Calculation for each call separately.");

		double total_cost_call_norway = cost_per_minute_norway * minutes_by_call_norway;
		System.out.println("Norway: " + total_cost_call_norway);

		double total_cost_call_sweden = cost_per_minute_sweden * minutes_by_call_sweden;
		System.out.println("Sweden: " + total_cost_call_sweden);

		double total_cost_call_denmark = cost_per_minute_denmark * minutes_by_call_denmark;
		System.out.println("Denmark: " + total_cost_call_denmark);
		
		System.out.println("==========================================");

		double total_cost_call_all_countries = total_cost_call_norway + total_cost_call_sweden + total_cost_call_denmark;
		System.out.println("Calculation for all conversations." + total_cost_call_all_countries);

	}

}
