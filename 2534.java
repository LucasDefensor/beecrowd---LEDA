import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[100];
        int N, Q;

        while (scanner.hasNextInt()) {
            N = scanner.nextInt();
            Q = scanner.nextInt();

            for (int i = 0; i < N; i++) {
                numeros[i] = scanner.nextInt();
            }

            bubbleSortDesc(numeros, N);

            for (int i = 0; i < Q; i++) {
                int posicao = scanner.nextInt();
                System.out.println(numeros[posicao - 1]);
            }
        }
    }

    private static void bubbleSortDesc(int[] array, int tamanho) {
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
