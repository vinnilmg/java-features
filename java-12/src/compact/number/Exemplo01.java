package java12.compact.number;

import java.text.CompactNumberFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Exemplo01 {
    public static void main(String[] args) {
        NumberFormat nfLong = CompactNumberFormat.getCompactNumberInstance(
                new Locale("pt", "BR"), NumberFormat.Style.LONG
        );

        NumberFormat nfShort = CompactNumberFormat.getCompactNumberInstance(
                new Locale("pt", "BR"), NumberFormat.Style.SHORT
        );

        System.out.println(nfLong.format(50000)); // 50 mil
        System.out.println(nfLong.format(500000)); // 500 mil
        System.out.println(nfLong.format(5000000)); // 5 milhões
        System.out.println(nfLong.format(5000000000L)); // 5 bilhões

        System.out.println(nfShort.format(5000000)); // 5mi
        System.out.println(nfShort.format(5000000000L)); // 5bi
    }
}
