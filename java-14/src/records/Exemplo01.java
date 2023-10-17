package java14.records;

interface Figura2D {}

record Retangulo(double largura, double altura) implements Figura2D {

    public static void imprime() {
        System.out.println("Bati aqui");
    }
}

public class Exemplo01 {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(10.5, 5.6);
        Retangulo retangulo2 = new Retangulo(10.5, 5.6);

        // Métodos gerados automaticamente
        System.out.println(retangulo.toString());
        System.out.println(retangulo.altura());
        System.out.println(retangulo.largura());
        System.out.println(retangulo.equals(retangulo2));
        System.out.println(retangulo.hashCode());

        Retangulo.imprime();
    }
}
