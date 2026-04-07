package stream.gatherers;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Gatherer;

class ComparaProdutoGather implements Gatherer<String, String, String> {
    private final String produto;

    ComparaProdutoGather(final String produto) {
        this.produto = produto;
    }

    // Função para criar o estado inicial
    @Override
    public Supplier<String> initializer() {
        return () -> "";
    }

    /*
    Função para processar os elementos de entrada (T)
    Atualizar o estado (A)
    E enviar os elementos processados / downstream (R)
     */
    @Override
    public Integrator<String, String, String> integrator() {
        return (estado, elemento, downstream) -> {
            if (estado.isEmpty()) {
                estado = elemento;
            }

            if (elemento.contains(produto)) {
                downstream.push(elemento);
            }

            return true;
        };
    }
}

public class ExemploCustomGather {
    void main() {
        final var produtos = List.of(
                "TV 50",
                "Geladeira 470L",
                "Geladeira 500L",
                "TV 65",
                "Notebook Dell",
                "Mouse Logitech"
        );

        // Filtra TVs
        System.out.println("Filtrando TVs....");
        produtos.stream()
                .gather(new ComparaProdutoGather("TV"))
                .forEach(System.out::println);

        // Filtra Geladeiras
        System.out.println("Filtrando Geladeiras....");
        produtos.stream()
                .gather(new ComparaProdutoGather("Geladeira"))
                .forEach(System.out::println);
    }
}
