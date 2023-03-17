import java.util.Date;

public class MyThread implements Runnable {
    private String msg;

    public MyThread(String msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        // System.out.println(msg + Thread.currentThread().getId() + " -> " + new Date().getTime());
        while(!Thread.interrupted()) {
            System.out.println("Execucao da thread" + Thread.currentThread().getId());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Long timeSleep = 1000L;
        Thread t1 = new Thread(() -> {
            System.out.println(Thread.interrupted());
            while(!Thread.interrupted()) {
            }
            System.out.println(Thread.interrupted());
        });
        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(timeSleep);
                System.out.println("Executando a Thread 2 de ID: " + Thread.currentThread().getId() + " -> " + new Date().getTime());
                t1.stop();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        // System.out.println("Quantidade de threads:" + Thread.activeCount());
        t1.start();
        // System.out.println("Quantidade de threads:" + Thread.activeCount());
        t2.start();
        // System.out.println("Quantidade de threads:" + Thread.activeCount());
    }
}
