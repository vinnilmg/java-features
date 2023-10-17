package java12.switchh.expressions;

import java.util.Scanner;

public class Exemplo01 {
    public static String FIM_DE_SEMANA = "Fim de semana!";
    public static String DIA_UTIL = "Dia útil!!";

    public static void main(String[] args) {
        System.out.println("Digite o dia da semana: ");

        Scanner input = new Scanner(System.in); // Teclado

        String dia = input.nextLine();
        System.out.println("Dia digitado: " + dia);

        input.close();

        // Switch case tradicional
        String resultado;
        switch (dia) {
            case "sabado", "domingo":
                resultado = FIM_DE_SEMANA;
                break;

            case "segunda", "terça", "quarta", "quinta", "sexta":
                resultado = DIA_UTIL;
                break;

            default:
                resultado = "Dia inválido.";
        }

        System.out.println("Resultado: " + resultado);

        // Switch Expressions
        String resultado02 = switch (dia) {
            case "segunda", "terça", "quarta", "quinta", "sexta" -> DIA_UTIL;
            case "sabado", "domingo" -> FIM_DE_SEMANA;
            default -> "Dia inválido.";
        };

        System.out.println("Resultado: " + resultado02);
    }
}
