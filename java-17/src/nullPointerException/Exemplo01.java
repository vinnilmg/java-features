package nullPointerException;

public class Exemplo01 {
    public static void main(String[] args) {
        final String str = null;

        // Força o NullPointerException
        str.toLowerCase();
        // Novo padrao de mensagem: Cannot invoke "String.toLowerCase()" because "str" is null
    }
}
