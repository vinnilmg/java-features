package string.joiner;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Exemplo01 {
    public static void main(String[] args) {
        String nomes = " Vinicius, Maria, João, Matheus, Marcio";

        // Quebra a string
        StringTokenizer st = new StringTokenizer(nomes, ",");

        // Concatena a string
        StringJoiner sj = new StringJoiner(",");

        while (st.hasMoreTokens()) {
            String str = st.nextToken();
            System.out.println(str);
            sj.add(str);
        }

        System.out.println(sj);
    }
}
