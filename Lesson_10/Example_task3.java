package Lesson_10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Example_task3 {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		String fileName = "C:\\Users\\Andry\\eclipse-workspace\\Lesson10_Threads.IO_Streams\\src\\Lesson_10\\mytext.txt";
		FileReader fr = null;
		BufferedReader br = null;
		fr = new FileReader(fileName);
		br = new BufferedReader(fr);
		String s = null;
		int count = 0;
		System.out.println("Read data from file: " + fileName);
		ArrayList<String> list1 = new ArrayList();

		while ((s = br.readLine()) != null) {
			list1.add(s);
			System.out.println("row " + ++count + " read:" + s);
		}
		br.close();

		int size = list1.size();
		System.out.println("size list1 is " + size);
//	 catch (Exception e) {
//			e.printStackTrace();
//			}
		int idMax = 0;
		String str = list1.get(0);
		int lengthMax = str.length();
		String TextMax = str;
		for (int i = 0, b; i < list1.size(); i++) {
			str = list1.get(i);
			b = str.length();
			System.out.println("str" + i + " have " + b + " symbols: " + str);
			if (str.length() > lengthMax) {
				lengthMax = str.length();
				TextMax = str;
				idMax = i;

			}
		}
		System.out.println();
		System.out.println("(" + TextMax + ") - have " + lengthMax + " symbols");
		System.out.println();

		
		str = list1.get(0);
		int idMin=0;
		int lengthMin = str.length();
		String TextMin = str;
		for (int i = 0, b; i < list1.size(); i++) {
			str = list1.get(i);
			b = str.length();
//			System.out.println("str" + i + " have " + b + " symbols: " + str);
			if (str.length() < lengthMin) {
				lengthMin = str.length();
				TextMin = str;
				idMin = i;

			}
		}

		System.out.println("(" + TextMin + ") - have " + lengthMin + " symbols");
		System.out.println();
		
		
	}
}
