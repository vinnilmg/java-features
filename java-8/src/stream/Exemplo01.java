package stream;

import model.Produto;

import java.util.Arrays;
import java.util.List;

public class Exemplo01 {
    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
                new Produto("Geladeira 300L", 1500.0),
                new Produto("Celular", 800.0),
                new Produto("Fone", 35.0),
                new Produto("Geladeira 600L", 2500.0),
                new Produto("Geladeira 150L", 750.0));

        // Stream pipeline
        produtos.stream() // gera a stream
                .filter(p -> p.getNome().toLowerCase().contains("geladeira")) // filtra por "geladeira"
                .sorted((Produto p1, Produto p2) -> p1.getPreco().compareTo(p2.getPreco())) // ordena por menor preço
                .map(Produto::getNome) // retorna o nome do produto
                .forEach(System.out::println); // printa as geladeiras
    }
}
