package softserve.thread;

public class Task2 {

	public static Object obj1 = new Object();
	public static Object obj2 = new Object();

	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				synchronized (obj1) {
					System.out.println(Thread.currentThread().getName() + " 1");
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (obj2) {
						System.out.println(Thread.currentThread().getName() + " 2");
					}
					
				}
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				synchronized (obj2) {
					System.out.println(Thread.currentThread().getName() + " 3");
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (obj1) {
						System.out.println(Thread.currentThread().getName() + " 4");
					}
				}
			}
		};

		t1.start();
		t2.start();

	}

}
