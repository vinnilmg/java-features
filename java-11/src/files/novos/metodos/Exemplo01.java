package java11.files.novos.metodos;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Exemplo01 {
    public static void escreveArquivo(Path path, String texto) throws IOException {
        // Novo método para escrever
        Files.writeString(path, texto, StandardCharsets.UTF_8);
    }

    public static void leArquivo(Path path) throws IOException {
        // Novo método para ler
        String conteudo = Files.readString(path, StandardCharsets.UTF_8);
        System.out.println(conteudo);
    }


    public static void main(String[] args) {
        String caminho = "src/java11/files/novos/metodos/myfile.txt";
        String texto = "Geek for Geeks - Tópicos avançados.";
        Path path = new File(caminho).toPath();

        try {
            escreveArquivo(path, texto);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            leArquivo(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
