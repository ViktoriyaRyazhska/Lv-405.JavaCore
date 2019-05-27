package softserve.homework.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tasks {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the sentence:");
		String str = br.readLine();

		String[] arr = str.split(" ");
		System.out.println(longestWordInSentence(arr));
		System.out.println(numberOfLettersInSentence(arr));
		System.out.println(reverseWords(arr, 2));

		System.out.println("Enter the sentence:");
		String str2 = br.readLine();
		System.out.println(deleteMoreThanOneSpace(str2));

		System.out.println("Enter the sentence with US:");
		String str3 = br.readLine();
		System.out.println(usCurrency(str3));

	}

	public static String longestWordInSentence(String[] str) {
		String maxLenghtWord = str[0];
		for (int i = 0; i < str.length; i++) {
			if (str[i].length() > maxLenghtWord.length()) {
				maxLenghtWord = str[i];
			}
		}
		return maxLenghtWord;
	}

	public static int numberOfLettersInSentence(String[] str) {
		int numberOfLetters = 0;
		for (int i = 0; i < str.length; i++) {
			numberOfLetters += str[i].length();
		}
		return numberOfLetters;
	}

	public static String reverseWords(String[] str, int wordPosition) {
		return new StringBuilder(str[wordPosition - 1]).reverse().toString();

	}

	public static String deleteMoreThanOneSpace(String str) {
		return str.replaceAll("\\s+", " ");
	}

	public static String usCurrency(String str) {
		Pattern p = Pattern.compile("\\$\\d+\\.\\d{2}");
		Matcher m = p.matcher(str);
		String temp = "";
		while (m.find()) {
			temp += str.substring(m.start(), m.end()) + "\n";
		}
		return temp;
	}

}
