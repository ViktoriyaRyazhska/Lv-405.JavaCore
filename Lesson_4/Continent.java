package Lesson_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public enum Continent {
	Asia("Asia"), Africa("Africa"), NorthAmerica("NorthAmerica"), SouthAmerica("South America"), Europe("Europe");

	private String continent;

	Continent(String continent) {
		this.continent = continent;
	}

	@Override
	public String toString() {
		return "Continent {" + "continent = '" + continent + '\'' + '}';

	}

	public static void main(String[] args) throws IOException {
		System.out.println("Please input country name:");
		BufferedReader c = new BufferedReader(new InputStreamReader(System.in));
		String coun = c.readLine();
		switch (coun) {
		case "Ukraine":
		case "Bulgaria":
		case "France":
		case "Spain":
			System.out.println(Continent.Europe);
			break;
		case "China":
		case "Iran":
		case "India":
			System.out.println(Continent.Asia);
			break;
		case "USA":
		case "Canada":
		case "Greenland":
		case "Mexico":
			System.out.println(Continent.NorthAmerica);
			break;
		case "Brazil":
		case "Venezuela":
		case "Ecuador":
		case "Peru":
			System.out.println(Continent.SouthAmerica);
			break;
		case "Egypt":
		case "Algeria":
		case "Nigeria":
		case "Libya":
			System.out.println(Continent.Africa);
			break;
		default:
			System.out.println("Wrong!");
			break;
		}
	}
}