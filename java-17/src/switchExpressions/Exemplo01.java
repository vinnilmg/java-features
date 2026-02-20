package switchExpressions;

public class Exemplo01 {
    public static void main(String[] args) {
        final Object obj = Double.valueOf(10);

        final String s = switch (obj) {
            case Integer i ->  "É um integer";
            case Double d -> "É um Double";
            case null -> "É um valor nulo";
            default -> {
                System.out.println("Tipo não identificado.");
                yield "Este é um Object";
            }
        };

        System.out.println(s);
    }
}
