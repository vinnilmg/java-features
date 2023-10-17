package method.references;

@FunctionalInterface
interface Figura3D {
    Quadrado desenha(double altura, double largura);
}

class Quadrado {
    public Quadrado (double altura, double largura) {
        System.out.println("Desenhando um quadrado com altura: " + altura + " e largura: " + largura);
    }
}

public class Exemplo04 {
    public static void main(String[] args) {
        Figura3D fig1 = Quadrado::new; // passando o construtor
        fig1.desenha(15.1 , 25.3);
    }
}
