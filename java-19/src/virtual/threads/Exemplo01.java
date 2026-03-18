package virtual.threads;

public class Exemplo01 {
    public static void main(String[] args) throws InterruptedException {
        final var virtualThread = Thread.ofVirtual()
                .start(() -> {
                    System.out.println("Thread virtual executada!");
                });

        virtualThread.join();

        System.out.println("Finalizado!");
    }
}
