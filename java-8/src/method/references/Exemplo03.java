package method.references;

import java.util.Arrays;
import java.util.List;

class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void toStringPessoa() {
        System.out.println("Pessoa(Nome: " + this.nome + ", Idade: " + this.idade + ")");
    }
}

public class Exemplo03 {
    public static void main(String[] args) {
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Vinicius", 35),
                new Pessoa("Maria", 25),
                new Pessoa("Matheus", 40));

        pessoas.forEach(Pessoa::toStringPessoa);
    }
}
