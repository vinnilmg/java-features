package java14.text.blocks;

public class Exemplo01 {
    public static void main(String[] args) {
        // Sem quebrar as linhas \
        String textoWithTextBlock = """
                SELECT 1 FROM \
                OW_TESTE.TESTE \
                WHERE TESTE = 1;\
                """;

        // Com espaços em branco \s
        String textoWithTextBlock2 = """
                Olá\s\s\s\s\smundo!
                Estou aqui pra testar.
                """;

        System.out.println(textoWithTextBlock);
        System.out.println(textoWithTextBlock2);
    }
}
