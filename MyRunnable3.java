public class MyRunnable3 implements Runnable {
    private String name;

    public MyRunnable3(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("Iniciando a " + name + " - ID: " + Thread.currentThread().getId() + " - Nome: "
                + Thread.currentThread().getName() + " - Tempo de início: " + System.currentTimeMillis());
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                System.out.println("Executando a " + name + " - Contador: " + i + " - ID: "
                        + Thread.currentThread().getId()
                        + " - Nome: " + Thread.currentThread().getName() + " - Prioridade: "
                        + Thread.currentThread().getPriority() + " - Estado: " + Thread.currentThread().getState()
                        + " - Tempo: " + System.currentTimeMillis() + " - Tarefa: Conflito com as outras threads!");
            } else {
                System.out.println("Executando a " + name + " - Contador: " + i + " - ID: "
                        + Thread.currentThread().getId()
                        + " - Nome: " + Thread.currentThread().getName() + " - Prioridade: "
                        + Thread.currentThread().getPriority() + " - Estado: " + Thread.currentThread().getState()
                        + " - Tempo: " + System.currentTimeMillis() + " - Tarefa: Tarefa da Thread 3");
            }
            try {
                Thread.sleep(1200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Finalizando a " + name + " - ID: " + Thread.currentThread().getId() + " - Nome: "
                + Thread.currentThread().getName() + " - Tempo de término: " + System.currentTimeMillis());
    }
}
