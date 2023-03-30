public class TwoThreads {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableImplementation("Thread 1"));
        Thread thread2 = new Thread(new RunnableImplementation("Thread 2"));
        thread1.start();
        thread2.start();
    }
}
