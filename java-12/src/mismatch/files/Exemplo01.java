package java12.mismatch.files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Exemplo01 {
    public static void main(String[] args) {
        File f1 = new File("src/java12/mismatch/files/file01.txt");
        File f2 = new File("src/java12/mismatch/files/file02.txt");

        try {
            Long position = Files.mismatch(f1.toPath(), f2.toPath());
            System.out.println(position);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
