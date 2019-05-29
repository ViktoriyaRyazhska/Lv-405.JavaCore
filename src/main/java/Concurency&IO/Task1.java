package SoftServe.Concurency;

public class Task1 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(()-> {
            for(int i=0; i<5; i++){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println("messages from " + Thread.currentThread().getName());
            }
        });

        Thread thread2 = new Thread(()-> {
            for(int i=0; i<5; i++){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println("text from " + Thread.currentThread().getName());
            }
        });

        Thread thread3 = new Thread(()-> {
            try {
                thread1.join();
                thread2.join();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            for(int i=0; i<5; i++){
                System.out.println(Thread.currentThread().getName());
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
