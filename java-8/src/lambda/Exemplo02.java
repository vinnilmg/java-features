package lambda;

// Interface funcional
@FunctionalInterface
interface Figura {
    void desenha();
}

public class Exemplo02 {
    public static void main(String[] args) {
        Figura fig1 = new Figura() {
            @Override
            public void desenha() {
                System.out.println("Figura 01 Desenhando...");
            }
        };

        fig1.desenha();

        Figura fig2 = () -> System.out.println("Figura 02 Desenhando...");
        fig2.desenha();
    }



}
