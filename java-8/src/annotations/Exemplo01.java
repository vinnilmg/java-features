package annotations;

import model.Produto;

import java.util.Arrays;

public class Exemplo01 {
    public static void main(String[] args) {
        Voltagem[] voltagens = Produto.class.getAnnotationsByType(Voltagem.class);

        Arrays.stream(voltagens)
                .forEach(v -> System.out.println("Tensão: " + v.tensao()));
    }
}
