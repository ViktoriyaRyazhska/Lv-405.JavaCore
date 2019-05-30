package Lesson_10_HW;

public class ThreadTask1 {
	public static String t = "I like Java";

	public static void main(String[] args) throws InterruptedException {
		Thread s1 = new MythreadTask1("I very like Java");
		Thread s2 = new MythreadTask1("I study Java");
		s1.start();
		s2.start();
		s1.join();
		s2.join();
		System.out.println(t);

	}

}
