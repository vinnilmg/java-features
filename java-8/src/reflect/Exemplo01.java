package reflect;

import model.Produto;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;

public class Exemplo01 {
    public static void main(String[] args) {
        // Instância da classe Produto
        Produto produto = new Produto("Geladeira", 1500.0);

        // Instância da classe Class
        Class classe = produto.getClass();

        // Todos os métodos declarados na classe
        Method[] methods = classe.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println("\nMétodo: " + m.getName());

            // Paramêtros do método
            Parameter[] params = m.getParameters();
            Arrays.stream(params).forEach(System.out::println);
        }

    }
}
