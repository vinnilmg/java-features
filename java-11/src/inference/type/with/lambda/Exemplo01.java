package java11.inference.type.with.lambda;

import java.util.function.Function;

public class Exemplo01 {
    public static void main(String[] args) {
        // var em parametros lambda
        Function<String, String> concat = (var s) -> s + "...";

        System.out.println(concat.apply("Teste"));
    }
}
