package base64;

import java.util.Base64;

public class Exemplo01 {
    public static void main(String[] args) {
        try {
            String texto = "Meu texto de exemplo pra codificar em Base64!";
            String textoCodificado = Base64.getEncoder().encodeToString(texto.getBytes("utf-8"));
            String textoDecodificado = new String(Base64.getDecoder().decode(textoCodificado));

            System.out.println(textoCodificado);
            System.out.println(textoDecodificado);
            System.out.println(texto.equals(textoDecodificado));

        } catch(Exception e) {
            System.out.println("Erro:" + e);
        }
    }
}
