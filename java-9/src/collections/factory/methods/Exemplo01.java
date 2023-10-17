package collections.factory.methods;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Exemplo01 {
    public static void main(String[] args) {
        // Factory method "of"

        List<String> frutasList  = List.of("Banana", "Maracujá", "Maça");
        frutasList.forEach(System.out::println);

        // Não permite elemento duplicado
        Set<String> frutasSet = Set.of("Banana", "Maracujá", "Maça");
        frutasSet.forEach(System.out::println);

        Map<Integer, String> frutasMap= Map.of(
                0, "Banana",
                1, "Maracujá",
                2, "Maça");
        frutasMap.forEach((k, v) -> System.out.println(v));
    }
}
