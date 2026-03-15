package hashmap;

import java.util.HashMap;
import java.util.HashSet;

public class Exemplo01 {
    public static void main(String[] args) {

        // Antes do Java 19
        final var map1 = new HashMap<>(60);
        final var set1 = new HashSet<>(60);

        // Após o java 19
        final var map2 = HashMap.newHashMap(60);
        final var set2 = HashSet.newHashSet(60);
    }
}
