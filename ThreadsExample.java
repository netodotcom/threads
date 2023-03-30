public class ThreadsExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable1("Thread 1"));
        Thread thread2 = new Thread(new MyRunnable2("Thread 2"));
        Thread thread3 = new Thread(new MyRunnable3("Thread 3"));
        thread1.start();
        thread2.start();
        thread3.start();
    }
}