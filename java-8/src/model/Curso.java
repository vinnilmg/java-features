package model;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private final List<Aluno> alunos;

    public Curso(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

}

