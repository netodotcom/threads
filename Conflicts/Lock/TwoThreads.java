package Conflicts.Lock;

public class TwoThreads {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread thread1 = new Thread(new MyThread(counter));
        Thread thread2 = new Thread(new MyThread(counter));
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Result: " + counter.getCount());
    }
}
