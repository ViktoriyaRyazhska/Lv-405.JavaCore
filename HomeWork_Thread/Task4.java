package softserve.thread;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task4 {

	public static void main(String[] args) throws FileNotFoundException {
		List<String> textLines = new ArrayList<>();
		String str;
		BufferedReader br = null;
		BufferedWriter bw = null;

		try {
			br = new BufferedReader(new FileReader("t1.txt"));

			while ((str = br.readLine()) != null) {
				textLines.add(str);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}

		try {
			bw = new BufferedWriter(new FileWriter("t2.txt"));
			bw.write("Number of lines in t1.txt = " + textLines.size() + "\n");
			bw.write("Longest line: " + Collections.max(textLines, Comparator.comparing(String::length)) + "\n");
			bw.write("RomanFriden 231 before the common era." + "\n");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}

	}
}
