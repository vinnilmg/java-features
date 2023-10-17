package java12.teeing.collector;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exemplo01 {
    public static void main(String[] args) {
        // Collectors.teeing(): Obtém 2 coleções e as une em um resultado

        // Collectors.teeing(soma dos numeros, qtd dos numeros, media);
        double resultado = Stream.of(1, 2, 3, 4, 5)
                .collect(
                        Collectors.teeing(
                                Collectors.summingDouble(i -> i), // Soma os números
                                Collectors.counting(), // Conta a qtd de números
                                (soma, qtd) -> soma / qtd) // Recebe os parâmetros e faz a média
                        );

        System.out.println("Resultado: " + resultado);
    }
}
