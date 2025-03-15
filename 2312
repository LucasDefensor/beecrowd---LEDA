import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    static Leitor in = new Leitor(System.in);
    static Escritor out = new Escritor(System.out);

    public static void main(String[] args) throws IOException {
        int numeroPaises = in.nextInt();
        Pais[] paises = new Pais[numeroPaises];
        for (int i = 0; i < numeroPaises; i++) {
            paises[i] = new Pais(in.next(), in.nextInt(), in.nextInt(), in.nextInt());
        }

        selectionSort(paises);

        for (Pais pais : paises) {
            out.println(pais.nome, pais.ouro, pais.prata, pais.bronze);
        }

        in.close();
        out.flush();
        out.close();
    }

    static void selectionSort(Pais[] paises) {
        int n = paises.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (compare(paises[j], paises[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            Pais temp = paises[minIndex];
            paises[minIndex] = paises[i];
            paises[i] = temp;
        }
    }

    static int compare(Pais p1, Pais p2) {
        if (p1.ouro != p2.ouro) {
            return p2.ouro - p1.ouro;
        } else if (p1.prata != p2.prata) {
            return p2.prata - p1.prata;
        } else if (p1.bronze != p2.bronze) {
            return p2.bronze - p1.bronze;
        } else {
            return p1.nome.compareTo(p2.nome);
        }
    }

    static class Pais {
        public String nome;
        public int ouro;
        public int prata;
        public int bronze;

        public Pais(String nome, int ouro, int prata, int bronze) {
            this.nome = nome;
            this.ouro = ouro;
            this.prata = prata;
            this.bronze = bronze;
        }
    }

    static class Leitor implements Closeable {
        private final BufferedReader leitor;
        private StringTokenizer tokenizer;

        public Leitor(InputStream input) {
            leitor = new BufferedReader(new InputStreamReader(input));
            tokenizer = new StringTokenizer("");
        }

        private StringTokenizer getTokenizer() throws IOException {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                String linha = nextLine();
                if (linha == null) {
                    return null;
                }
                tokenizer = new StringTokenizer(linha);
            }
            return tokenizer;
        }

        public boolean hasNext() throws IOException {
            return getTokenizer() != null;
        }

        public String next() throws IOException {
            return hasNext() ? tokenizer.nextToken() : null;
        }

        public String nextLine() throws IOException {
            tokenizer = null;
            return leitor.readLine();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public float nextFloat() throws IOException {
            return Float.parseFloat(next());
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        public String[] nextStringArray(int tamanho) throws IOException {
            String[] array = new String[tamanho];
            for (int i = 0; i < tamanho; i++) {
                array[i] = next();
            }
            return array;
        }

        public int[] nextIntArray(int tamanho) throws IOException {
            int[] array = new int[tamanho];
            for (int i = 0; i < tamanho; i++) {
                array[i] = nextInt();
            }
            return array;
        }

        public long[] nextLongArray(int tamanho) throws IOException {
            long[] array = new long[tamanho];
            for (int i = 0; i < tamanho; i++) {
                array[i] = nextLong();
            }
            return array;
        }

        public double[] nextDoubleArray(int tamanho) throws IOException {
            double[] array = new double[tamanho];
            for (int i = 0; i < tamanho; i++) {
                array[i] = nextDouble();
            }
            return array;
        }

        @Override
        public void close() throws IOException {
            tokenizer = null;
            leitor.close();
        }
    }

    static class Escritor implements Closeable, Flushable {
        private final PrintWriter escritor;

        public Escritor(OutputStream outputStream) {
            escritor = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public void print(Object... objetos) {
            for (int i = 0; i < objetos.length; i++) {
                if (i != 0) {
                    escritor.print(' ');
                }
                escritor.print(objetos[i]);
            }
        }

        public void println(Object... objetos) {
            print(objetos);
            escritor.println();
        }

        @Override
        public void close() {
            escritor.close();
        }

        @Override
        public void flush() {
            escritor.flush();
        }
    }
