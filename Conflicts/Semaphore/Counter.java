package Conflicts.Semaphore;

import java.util.concurrent.Semaphore;

public class Counter {
    private int count = 0;
    private Semaphore semaphore = new Semaphore(1);

    public void increment() throws InterruptedException {
        semaphore.acquire();
        count++;
        semaphore.release();
    }

    public int getCount() {
        return count;
    }
}