package java13.text.blocks;

public class Exemplo01 {
    public static void main(String[] args) {
        String textoGrandeFormaAntiga = "SELECT 1 FROM\n" +
                "OW_TESTE.TESTE\n" +
                "WHERE TESTE = 1;";

        String textoGrandeTextBlock = """
                SELECT 1 FROM
                OW_TESTE.TESTE
                WHERE TESTE = 1;
                """;

        System.out.println(textoGrandeFormaAntiga);
        System.out.println(textoGrandeTextBlock);
    }
}
