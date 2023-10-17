package parallel.array.sorting;

import java.util.Arrays;

public class Exemplo01 {
    public static void main(String[] args) {
        int[] numeros = {0, 2, 5, 3, 1, 4, 6, 52, 32};
        int[] numeros2 = {0, 2, 5, 3, 1, 4, 6, 52, 32};

        for (int n : numeros) System.out.print(n + " ");

        System.out.println("");

        // Ordenando todo o array
        Arrays.parallelSort(numeros);
        for (int n : numeros) System.out.print(n + " ");

        System.out.println("");

        // Ordenando parte de um array
        Arrays.parallelSort(numeros2, 0, 5);
        for (int n : numeros2) System.out.print(n + " ");

    }
}
