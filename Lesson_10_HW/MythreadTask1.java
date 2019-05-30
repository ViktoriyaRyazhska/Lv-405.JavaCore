package Lesson_10_HW;

public class MythreadTask1 extends Thread {
	private String text;

	public MythreadTask1(String text) {
		this.text = text;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread " + i + ": " + text);
		}
	}

}
