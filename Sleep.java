public class Sleep {

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable("Thread 1", 2000));
        Thread t2 = new Thread(new MyRunnable("Thread 2", 1000));

        t1.start();
        t2.start();
    }
}

class MyRunnable implements Runnable {
    private String threadName;
    private long sleepTime;

    public MyRunnable(String threadName, long sleepTime) {
        this.threadName = threadName;
        this.sleepTime = sleepTime;
    }

    private void threadsCounter() {
        System.out.println("Threads working (" + Thread.activeCount() + ")");
    }

    @Override
    public void run() {
        System.out.println(threadName + " started.");
        try {
            System.out.println(threadName + " will sleep for " + sleepTime + " milliseconds.");
            Thread.sleep(sleepTime);
            System.out.println(threadName + " woke up after sleeping.");
        } catch (InterruptedException e) {
            System.out.println(threadName + " was interrupted.");
        }
        threadsCounter();
        System.out.println(threadName + " finished.");
        threadsCounter();
    }
}
