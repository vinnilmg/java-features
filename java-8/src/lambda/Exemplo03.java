package lambda;

import java.util.ArrayList;
import java.util.List;

class Carro {
    private String nome;
    private Double preco;

    public Carro(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}

public class Exemplo03 {
    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>();

        carros.add(new Carro("Fiesta", 150000.0));
        carros.add(new Carro("Focus", 40000.0));
        carros.add(new Carro("Territory", 20000.0));
        carros.add(new Carro("Civic", 10000.0));

        carros.forEach(c -> System.out.println(c.getNome() + " = " + c.getPreco()));
        carros.sort((c1, c2) -> c1.getPreco().compareTo(c2.getPreco()));

        carros.forEach(c -> {
            System.out.println(c.getNome());
            System.out.println(c.getPreco());
        });
    }
}
