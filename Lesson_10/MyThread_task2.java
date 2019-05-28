package Lesson_10;

public class MyThread_task2 extends Thread{
	private String text;
	   private int pause;

	   public MyThread_task2(String text, int pause) {
	      this.text = text;
	      this.pause = pause;
	   }
	   @Override
	   public void run() {
	      for (int i = 0; i < 5; i++) {
	         try { sleep(pause); 
	         } catch (InterruptedException e) {}
	         System.out.println("Thread " + text);
	      }
	}  }


