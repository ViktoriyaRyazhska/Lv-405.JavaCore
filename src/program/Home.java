package program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Home {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the radius");
		double radius = Double.parseDouble(br.readLine());
//2
		double Area = (double) 3.14 * radius * radius;
		double Perimeter = (double) 2 * 3.14 * radius;

		System.out.println(Area);
		System.out.println(Perimeter);
//2
		System.out.println("What is your name?");
		String name = br.readLine();
		System.out.println("Where do you live, " + name + "?");
		String location = br.readLine();
		System.out.println(name + " lives in " + location);
		
		
		
	
	//3	
		
		System.out.println("Enter the coast fot the Ukranian calls?");
		double value1 = Double.parseDouble(br.readLine());
		System.out.println("Enter the duration the Ukranian call?");
		double time1 = Double.parseDouble(br.readLine());
		double cost1 =  value1 * time1;
		System.out.println("The cost of the first call " + cost1);
		System.out.println("Enter the coast fot the American calls?");
		double value2 = Double.parseDouble(br.readLine());
		System.out.println("Enter the duration the American call?");
		double time2 = Double.parseDouble(br.readLine());
		double cost2 =  value2 * time2;
		System.out.println("The cost of the second call " + value2 * time2);
		System.out.println("Enter the coast fot the Poland calls?");
		double value3 = Double.parseDouble(br.readLine());
		System.out.println("Enter the duration the Poland call?");
		double time3 = Double.parseDouble(br.readLine());
		double cost3 =  value3 * time3;
		System.out.println("The cost of the third call " + value3 * time3);
		
		
		System.out.println("The cost of all calls " + (cost1+cost2+cost3));

	}
}
