package java12.string.novos.metodos;

public class Exemplo01 {
    public static void main(String[] args) {
        String texto = "Olá mundo!\nEste é o módulo do java 12.";

        // Adiciona espaços em branco
        texto = texto.indent(10);
        System.out.println(texto);

        // Remove espaços em branco
        texto = texto.indent(-5);
        System.out.println(texto);

        // Aplica uma função na string
        String textoInvertido = texto.transform(
                s -> new StringBuilder(s).reverse().toString());

        System.out.println(textoInvertido);
    }
}
