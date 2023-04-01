package SimpleThread;

public class SimpleThread {
    public static void main(String args[]) {
        RunnableImplementation runnableImplementation = new RunnableImplementation();
        Thread myThread = new Thread(runnableImplementation);
        myThread.start();
    }
}
