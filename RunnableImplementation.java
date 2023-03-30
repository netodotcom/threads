public class RunnableImplementation implements Runnable {
    private String name;

    public RunnableImplementation() {
        this.name = "Basic Thread";
    }

    public RunnableImplementation(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("Iniciando a " + name + " - ID: " + Thread.currentThread().getId() + " - Nome: "
                + Thread.currentThread().getName() + " - Tempo de início: " + System.currentTimeMillis());
        for (int i = 1; i <= 5; i++) {
            System.out.println("Executando a " + name + " - Contador: " + i + " - ID: " + Thread.currentThread().getId()
                    + " - Nome: " + Thread.currentThread().getName() + " - Prioridade: "
                    + Thread.currentThread().getPriority() + " - Estado: " + Thread.currentThread().getState()
                    + " - Tempo: " + System.currentTimeMillis());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Finalizando a " + name + " - ID: " + Thread.currentThread().getId() + " - Nome: "
                + Thread.currentThread().getName() + " - Tempo de término: " + System.currentTimeMillis());
    }

}