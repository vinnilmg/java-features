package type.inference.classe;

public class Exemplo01 {
    public static void main(String[] args) {
        // Type inference em classes anônimas
        SomaTudo<String> somaString = new SomaTudo<>() {
            @Override
            public String soma(String a, String b) {
                return a + b;
            }
        };

        System.out.println("Soma Strings: " + somaString.soma("Hello ", "World!"));
    }
}
