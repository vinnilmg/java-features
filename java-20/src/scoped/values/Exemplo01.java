package scoped.values;

import jdk.incubator.concurrent.ScopedValue;

public class Exemplo01 {
    public static final ScopedValue<String> NOME = ScopedValue.newInstance();

    public static void main(String[] args) {
        // Define o valor e executa o método limitado a execução da thread
        ScopedValue.where(NOME, "Ronaldo")
                .run(Exemplo01::imprimeSaudacao);
    }

    private static void imprimeSaudacao() {
        imprimeOla();
    }

    private static void imprimeOla() {
        System.out.print("Olá, ");
        // Obtém o valor anteriormente definido no escopo da thread
        imprimeNome(NOME.get());
    }

    private static void imprimeNome(final String nome) {
        System.out.print(nome);
    }
}
