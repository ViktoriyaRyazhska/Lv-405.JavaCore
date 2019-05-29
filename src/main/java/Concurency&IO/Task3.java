package SoftServe.Concurency;

public class Task3 {
    public static void main(String[] args) {

        Thread t1 = new Thread(()->{

            Thread t2 = new Thread(()->{
               for(int i=0; i<3; i++){
                   System.out.println(Thread.currentThread().getName());
               }

               Thread t3 = new Thread(()->{
                   for(int i=0; i <5; i++){
                       System.out.println(Thread.currentThread().getName());
                   }
               });
               t3.start();
            });
            t2.start();
        });
        t1.start();

    }
}
