package sequenced.collection;

import java.util.LinkedHashSet;
import java.util.SequencedCollection;

public class Exemplo01 {
    public static void main(String[] args) {
        SequencedCollection<String> cestaDeFrutas = new LinkedHashSet<>();
        cestaDeFrutas.add("Banana");
        cestaDeFrutas.add("Laranja");
        cestaDeFrutas.add("Melancia");
        cestaDeFrutas.add("Maça");

        // Novos métodos para adição
        cestaDeFrutas.addFirst("Abacaxi");
        cestaDeFrutas.addLast("Limão");

        // Novos métodos para obter
        System.out.println(cestaDeFrutas.getFirst());
        System.out.println(cestaDeFrutas.getLast());

        // Novos métodos para remover
        cestaDeFrutas.removeFirst();
        cestaDeFrutas.removeLast();
    }
}
