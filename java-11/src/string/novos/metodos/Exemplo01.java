package java11.string.novos.metodos;

import java.util.stream.Collectors;

public class Exemplo01 {
    public static void main(String[] args) {
        String str01 = "";
        String str02 = "       ";
        String str03 = "Tem\nConteudo\nAqui";
        String str04 = "Geek ";

        // Verifica se tem conteúdo
        System.out.println(str01.isBlank());
        System.out.println(str02.isBlank());
        System.out.println(str03.isBlank());

        // Elimina as quebras de linhas e gera uma stream
        System.out.println(str03);
        System.out.println(str03.lines().collect(Collectors.toList()));

        // Repete a string por n vezes
        System.out.println(str04.repeat(5));
    }
}
