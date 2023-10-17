package optional;

import model.Aluno;
import model.Curso;
import model.Matricula;

import java.util.Arrays;

public class Exemplo01 {
    public static void main(String[] args) {
        Curso curso = new Curso("ADM");

        Aluno al01 = new Aluno("Maria");
        al01.setMatricula(new Matricula("12345"));

        Aluno al02 = new Aluno("Vini");
        al02.setMatricula(new Matricula("44444"));

        Aluno al03 = new Aluno("Ronald");

        Arrays.asList(al01, al02, al03)
                .forEach(curso.getAlunos()::add);

        curso.getAlunos().stream()
                .filter(a -> a.getMatricula().isPresent()) // filtra com os alunos que tem matricula
                .forEach(a -> System.out.println(a.getNome() + " - " + a.getMatricula().get().getNumero()));
    }
}
