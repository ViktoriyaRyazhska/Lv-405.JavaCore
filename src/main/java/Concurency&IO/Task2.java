package SoftServe.Concurency;

public class Task2 {
    private static final Task2 obj = new Task2();

    public static void main(String[] args) throws InterruptedException {
        myThread mythread = new myThread();


        Thread thread = new Thread(mythread);
        thread.start();

        synchronized (obj) {
            obj.wait();
            mythread.workDone();
        }

    }
}

class myThread implements Runnable{
    private volatile boolean isWorkDone;
    private int a,b;
    private int sum;
    @Override
    public void run() {
        synchronized (this) {
            while (!isWorkDone) {
                System.out.println(sum += getSum(++a, ++b));
                if(sum == 6) {
                    break;
                }
            }

            this.notifyAll();
        }
    }

   private int getSum(int a, int b){
        return a + b;
    }

    void workDone(){
        isWorkDone = true;
    }

}
