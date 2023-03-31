package Conflicts.Semaphore;

public class FourThreads {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread thread1 = new Thread(new MyThread(counter));
        Thread thread2 = new Thread(new MyThread(counter));
        Thread thread3 = new Thread(new MyThread(counter));
        Thread thread4 = new Thread(new MyThread(counter));
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Result: " + counter.getCount());
    }
}
