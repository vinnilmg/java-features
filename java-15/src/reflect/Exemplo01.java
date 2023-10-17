package java15.reflect;

import java.lang.reflect.Field;

class Geladeira {
    private final Integer codigo = 12345;

    public Integer getCodigo() {
        return this.codigo;
    }
}


public class Exemplo01 {
    public static void main(String[] args) {
        /* Para records, não podemos acessar os atributos (são declarados como final implicitamente).
           Abaixo está um código simulando (burlando) a alteração de um atributo privado e final com reflexão.
           Esse código não é possível ser realizado em records. */

        var geladeira = new Geladeira();
        System.out.println(geladeira.getCodigo());

        try {
            // Pega o atributo "codigo" via reflexão
            Field atributo = geladeira.getClass().getDeclaredField("codigo");

            // Torna o campo acessível (antes privado)
            atributo.setAccessible(true);

            // Alterando valor do atributo final
            atributo.set(geladeira, 11111);

            // Exibindo novo valor do código
            System.out.println(geladeira.getCodigo());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
