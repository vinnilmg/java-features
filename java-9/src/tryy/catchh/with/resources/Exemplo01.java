package tryy.catchh.with.resources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exemplo01 {
    public static void main(String[] args) {
        try {
            leArquivoWithTryCatchFinally("file.txt");
            leArquivoWithTryWithResources("file.txt");
            leArquivoWithTryWithResourcesJava9("file.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Antes do java 7 - "Modo tradicional"
    public static void leArquivoWithTryCatchFinally(String path) throws IOException {
        String linha;

        BufferedReader reader = new BufferedReader(new FileReader(path));

        try {
            while((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            throw e;
        } finally {
            if (reader != null) reader.close();
        }
    }

    // A partir do java 7 - "Try with resources"
    public static void leArquivoWithTryWithResources (String path) throws IOException {
        String linha;

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            while((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        }
    }

    // Melhorias a partir do java 9
    public static void leArquivoWithTryWithResourcesJava9 (String path) throws IOException {
        String linha;
        BufferedReader reader = new BufferedReader(new FileReader(path));

        try (reader) {
            while((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        }
    }
}
