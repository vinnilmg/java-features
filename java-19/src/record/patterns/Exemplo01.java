package record.patterns;

record Retangulo(double largura, double altura) {
}

record Circuferencia(double raio) {
}

record Ponto(double x, double y) {
}

record Reta(Ponto a, Ponto b) {
}

public class Exemplo01 {

    public static void main(String[] args) {
        final var r1 = new Retangulo(300.0, 200.0);
        final var c1 = new Circuferencia(100.0);
        final var reta1 = new Reta(
                new Ponto(1, 2),
                new Ponto(5, 10)
        );

        print(r1);
        print(c1);
        print(reta1);
    }

    private static void print(Object obj) {
        String msg = null;

        // Desconstruindo os records
        if (obj instanceof Retangulo(double l, double a)) {
            msg = String.format("Retangulo com %s de largura e %s de altura.", l, a);
        } else if (obj instanceof Circuferencia(double r)) {
            msg = String.format("Circuferencia com %s de raio.", r);
        } else if (obj instanceof Reta(Ponto(double x1, double y1), Ponto(double x2, double y2))) {
            msg = String.format(
                    "Reta com primeiro ponto [%s e %s] e segundo ponto [%s e %s]",
                    x1, y1,
                    x2, y2
            );
        }

        System.out.println(msg);
    }
}
