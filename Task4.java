package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {

	private String text;
	
	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}


	public static int task4() throws IOException {
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input text please:");
		String text = br1.readLine();
		String patern = "[EUIOAYeuioay]";
		Pattern vocal = Pattern.compile(patern);
		Matcher m = vocal.matcher(text);
		int counter = 0;
		while (m.find()) {
			counter++;
		}
		System.out.println("result: - " + counter);
		return 0;
	}
	
	
	
}
