package program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Home {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the radius");
		double radius = Double.parseDouble(br.readLine());

		double Area = (double) 3.14 * radius * radius;
		double Perimeter = (double) 2 * 3.14 * radius;

		System.out.println(Area);
		System.out.println(Perimeter);

		System.out.println("What is your name?");
		String name = br.readLine();
		System.out.println("Where do you live, " + name + "?");
		String location = br.readLine();
		System.out.println(name + " lives in " + location);
		
		
		
	
		
		
		System.out.println("яка варт≥сть першого дзв≥нка?");
		double value1 = Double.parseDouble(br.readLine());
		System.out.println("яка тривал≥сть першого дзв≥нка?");
		double time1 = Double.parseDouble(br.readLine());
		double cost1 =  value1 * time1;
		System.out.println("¬арт≥сть €ка ст€гнетьс€ за перший зв≥нок " + cost1);
		System.out.println("яка варт≥сть другого дзв≥нка?");
		double value2 = Double.parseDouble(br.readLine());
		System.out.println("яка тривал≥сть другого дзв≥нка?");
		double time2 = Double.parseDouble(br.readLine());
		double cost2 =  value2 * time2;
		System.out.println("¬арт≥сть €ка ст€гнетьс€ за другий зв≥нок " + value2 * time2);
		System.out.println("яка варт≥сть третього дзв≥нка?");
		double value3 = Double.parseDouble(br.readLine());
		System.out.println("яка тривал≥сть третього дзв≥нка?");
		double time3 = Double.parseDouble(br.readLine());
		double cost3 =  value3 * time3;
		System.out.println("¬арт≥сть €ка ст€гнетьс€ за трет≥й зв≥нок " + value3 * time3);
		
		
		System.out.println("«агальна варт≥сть ус≥х дзв≥нк≥в " + (cost1+cost2+cost3));

	}
}
