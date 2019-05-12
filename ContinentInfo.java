package Task;

import java.io.BufferedReader;

import Task.Continent.ContinentName;

import java.io.IOException;
import java.io.InputStreamReader;

public class ContinentInfo {

	public static void main(String[] args) throws Exception, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Choose the country");
		String country = br.readLine();
		ContinentName continent = null;
		switch (country) {
			case "USA" : case "Canada" : case "Mexico" :
				continent = ContinentName.NorthAmerica; break;
			case "Brazil" : case "Chile" : case "Argentina" :
				continent = ContinentName.SouthAmerica; break;
			case "Ukraine" : case "China" : case "Germany" :
				continent = ContinentName.Eurasia; break;
			case "Congo" : case "Egypt" : case "Sudan" :
				continent = ContinentName.Africa; break;
			case "Australia" :
				continent = ContinentName.Australia; break;
			case "Antarctica" :
				continent = ContinentName.Antarctica; break;
			default : 
				System.out.println("Choose another country");
		}
		
		System.out.println(continent);

	}

}
