package softserve.thread;

public class Task1 {

	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new Runner("Thread1"));
		Thread thread2 = new Thread(new Runner("Thread2"));
		Thread thread3 = new Thread(new Runner("Thread3"));
		
		try {
			thread1.start();
			thread2.start();
			
			thread1.join();
			thread2.join();
			
			thread3.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}

}

class Runner implements Runnable {
	private String message;

	public Runner(String message) {
		this.message = message;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(message);
		}

	}

}
