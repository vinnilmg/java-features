package method.references;

// Interface funcional
@FunctionalInterface
interface Figura2D {
    void desenha(Double largura, Double altura);
}

class Retangulo {
    public void desenhaRetangulo(Double largura, Double altura) {
        System.out.println("Retangulo:: Altura: " + altura + " Largura: " + largura);
    }
}

public class Exemplo01 {
    public static void main(String[] args) {
        // Com lambda
        Figura2D fig01 = (l, a) -> System.out.println("Altura: " + a + " Largura: " + l);
        fig01.desenha(12.5, 25.3);

        //Com method references
        Retangulo retangulo = new Retangulo();
        Figura2D fig02 = retangulo::desenhaRetangulo;
        fig02.desenha(5.3, 10.2);
    }
}
