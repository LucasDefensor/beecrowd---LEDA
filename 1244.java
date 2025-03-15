import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static int compararPorTamanho(String primeiraString, String segundaString) {
        return segundaString.length() - primeiraString.length();
    }

    public static void ordenarPorInsercao(List<String> listaDePalavras) {
        for (int indiceAtual = 1; indiceAtual < listaDePalavras.size(); ++indiceAtual) {
            int posicaoAtual = indiceAtual;
            int posicaoAnterior = posicaoAtual - 1;

            while (posicaoAnterior > -1 && compararPorTamanho(listaDePalavras.get(posicaoAtual), listaDePalavras.get(posicaoAnterior)) < 0) {
                Collections.swap(listaDePalavras, posicaoAtual, posicaoAnterior);
                --posicaoAtual;
                --posicaoAnterior;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader leitorDeFluxo = new InputStreamReader(System.in);
        BufferedReader bufferDeLeitura = new BufferedReader(leitorDeFluxo);

        int numeroDeCasos = Integer.parseInt(bufferDeLeitura.readLine());

        for (int caso = 0; caso < numeroDeCasos; ++caso) {
            List<String> palavras = Arrays.asList(bufferDeLeitura.readLine().trim().split(" "));

            ordenarPorInsercao(palavras);

            System.out.println(String.join(" ", palavras));
        }
    }
}
