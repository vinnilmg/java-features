package syntax.sugar;

import java.util.List;

public class UnnamedVariablesExemplo {
    void main() {
        final var names = List.of("Vini", "Maria", "Freya");
        var qtdNames = 0;

        // Variavel sem nome pois não está sendo usada
        for (var _ : names) {
            qtdNames++;
        }

        System.out.println(qtdNames);
    }
}
