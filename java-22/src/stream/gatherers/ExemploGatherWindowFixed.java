package stream.gatherers;

import java.util.List;
import java.util.stream.Gatherers;

public class ExemploGatherWindowFixed {
    void main() {
        final var produtos = List.of(
                "TV 50",
                "Geladeira 470L",
                "Geladeira 500L",
                "TV 65",
                "Notebook Dell",
                "Mouse Logitech"
        );

        // Separa de 2 em 2
        produtos.stream()
                .gather(Gatherers.windowFixed(2))
                .forEach(System.out::println);
    }
}
