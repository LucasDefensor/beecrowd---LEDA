import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static int inversoes;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int N = scanner.nextInt();
            if (N == 0) break;

            List<Integer> P = new ArrayList<>(N);
            for (int i = 0; i < N; i++) {
                P.add(scanner.nextInt());
            }

            inversoes = 0;
            bubbleSort(P);

            System.out.println((inversoes % 2 != 0) ? "Marcelo" : "Carlos");
        }
    }

    private static void bubbleSort(List<Integer> lista) {
        int n = lista.size();
        boolean trocou;
        for (int i = 0; i < n - 1; i++) {
            trocou = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (lista.get(j) > lista.get(j + 1)) {
                    int temp = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temp);
                    inversoes++;
                    trocou = true;
                }
            }
            if (!trocou) break;
        }
    }
}
