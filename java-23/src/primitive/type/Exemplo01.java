package primitive.type;

public class Exemplo01 {
    public static void main(String[] args) {
        Object obj = 100;

        if (obj instanceof int i && i > 100) {
            System.out.println("É um número maior que 100. Valor: " + obj);
        } else if (obj instanceof int i && i <= 100) {
            System.out.println("É um número menor ou igual a 100. Valor: " + obj);
        }

        switch (obj) {
            case int i -> System.out.println("Este é um inteiro. Valor: " + i);
            case double d -> System.out.println("Este é um double");
            default -> System.out.println("Não identificado");
        }
    }
}
