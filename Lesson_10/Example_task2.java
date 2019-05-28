package Lesson_10;

public class Example_task2 {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new MyThread_task2("Hello, world", 2000);
		Thread t2 = new MyThread_task2("Peace in the peace", 3000);
		t1.start();
		t2.start();
		t1.join();
		t1.join();
		System.out.println("My name is Andry Petryshyn");

	}

}
