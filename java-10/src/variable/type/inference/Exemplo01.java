package variable.type.inference;

import java.util.List;

public class Exemplo01 {
    public static void main(String[] args) {
        // Váriaveis
        int i1 = 0;
        var i2 = 0;

        String str1 = "Programando em ";
        var str2 = "Java";

        System.out.println(str2 instanceof String);
        System.out.println(i1 + i2);
        System.out.println(str1 + str2);

        // Índices em for clássico
        for (var ind = 0; ind < 5; ind ++) {
            System.out.println(ind);
        }

        // Lista de strings
        var frutas = List.of("Abacaxi", "Mamão", "Melancia");

        // For-each Loop
        for (var fruta : frutas) {
            System.out.println(fruta);
        }
    }
}
