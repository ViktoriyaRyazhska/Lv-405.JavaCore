package Lesson_10;

public class MyThread extends Thread {

	private String text;

	public MyThread(String text) {
		this.text = text;
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);;
			} catch (InterruptedException e) {
			}
			System.out.println("Thread " +i+": "+ text);
		}

	}

}
