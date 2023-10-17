package lambda;

public class Exemplo01 {
    public static void main(String[] args) {
        // Sem lambda
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1 em execução");
            }
        });

        t1.start();

        // Com lambda
        Thread t2 = new Thread(() -> System.out.println("Thread 2 em execução"));
        t2.start();
    }
}
