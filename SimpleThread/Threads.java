package SimpleThread;
import java.util.Date;

public class Threads implements Runnable {

    public Threads() {
    }

    @Override
    public void run() {
        // System.out.println(msg + Thread.currentThread().getId() + " -> " + new Date().getTime());
        while(!Thread.interrupted()) {
            System.out.println("Running thread: " + Thread.currentThread().getId());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Long timeSleep = 100L;
        Thread t1 = new Thread(() -> {
            System.out.println("Thread interrupted: " + Thread.interrupted());
            while(Thread.interrupted()) {
            }
            System.out.println("dsakndjksakjdlsak " + Thread.interrupted());
        });
        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(timeSleep);
                System.out.println("Executing Thread 2 - ID: " + Thread.currentThread().getId() + " - Time -> " + new Date().getTime());
                t1.stop();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println("Count of threads: " + Thread.activeCount());
        System.out.println("Starting thread 1...");
        t1.start();
        System.out.println("Count of threads: " + Thread.activeCount());
        System.out.println("Starting thread 2...");
        t2.start();
        System.out.println("Count of threads: " + Thread.activeCount());
    }
}
