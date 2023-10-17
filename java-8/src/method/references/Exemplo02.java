package method.references;

import model.Produto;

import java.util.Arrays;
import java.util.List;

class Impressora {
    public static void imprimeResultado(Produto p) {
        System.out.println("model.Produto: " + p.getNome() + " | Preço: " + p.getPreco());
    }
}

public class Exemplo02 {
    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
                new Produto("Geladeira", 1500.0),
                new Produto("Fogão", 250.0),
                new Produto("PC", 3000.0));

        produtos.forEach(Impressora::imprimeResultado);
    }
}
