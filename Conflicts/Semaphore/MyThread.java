package Conflicts.Semaphore;

public class MyThread implements Runnable {
    private Counter counter;

    public MyThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 10000; i++) {
            try {
                counter.increment();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}