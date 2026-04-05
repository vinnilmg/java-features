package string.template;

public class Exemplo01 {
    public static void main(String[] args) {
        final var curso = "Java class";
        final var saudacao = STR."Welcome to \{curso}";
        System.out.println(saudacao);
    }
}
