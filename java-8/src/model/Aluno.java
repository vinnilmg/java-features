package model;

import java.util.Optional;

public class Aluno {
    private String nome;
    private Optional<Matricula> matricula;

    public Aluno(String nome) {
        this.nome = nome;
        this.matricula = Optional.empty(); // inicializa como vazio
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Optional<Matricula> getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = Optional.of(matricula);
    }
}
