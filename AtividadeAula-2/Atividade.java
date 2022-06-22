import java.util.Arrays;
import java.util.Random;
import java.util.Vector;

public class Atividade {

    public static void main(String[] args) {

        Random sort = new Random();
        long tempoBinario, tempoSequencial;
        int chave;
        String tabela = "============================================";
        tabela = tabela + "\n============ Tempo de Execucoes ============";
        tabela = tabela + "\n============================================";
        tabela = tabela + "\n=   Vetor   =   Sequencial   =   Binario   =";
        tabela = tabela + "\n============================================";

        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sort.nextInt(20);
        }
        chave = sort.nextInt(20);

        tempoSequencial = testeTempoSeq(vetor, chave);
        tempoBinario = testeTempoBin(vetor, chave);

        // GERANDO TABELA
        tabela = tabela + "\n=   10      ";
        tabela = gerarTabela(tabela, tempoBinario, tempoSequencial);

        vetor = new int[100];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sort.nextInt(200);
        }
        chave = sort.nextInt(200);

        tempoSequencial = testeTempoSeq(vetor, chave);
        tempoBinario = testeTempoBin(vetor, chave);

        // GERANDO TABELA
        tabela = tabela + "\n=   100     ";
        tabela = gerarTabela(tabela, tempoBinario, tempoSequencial);

        vetor = new int[1000];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sort.nextInt(2000);
        }
        chave = sort.nextInt(2000);

        tempoSequencial = testeTempoSeq(vetor, chave);
        tempoBinario = testeTempoBin(vetor, chave);

        // GERANDO TABELA
        tabela = tabela + "\n=   1000    ";
        tabela = gerarTabela(tabela, tempoBinario, tempoSequencial);

        vetor = new int[10000];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sort.nextInt(20000);
        }
        chave = sort.nextInt(20000);

        tempoSequencial = testeTempoSeq(vetor, chave);
        tempoBinario = testeTempoBin(vetor, chave);

        // GERANDO TABELA
        tabela = tabela + "\n=   10000   ";
        tabela = gerarTabela(tabela, tempoBinario, tempoSequencial);

        vetor = new int[100000];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sort.nextInt(200000);
        }
        chave = sort.nextInt(200000);

        tempoSequencial = testeTempoSeq(vetor, chave);
        tempoBinario = testeTempoBin(vetor, chave);

        // GERANDO TABELA
        tabela = tabela + "\n=   100000  ";
        tabela = gerarTabela(tabela, tempoBinario, tempoSequencial);
        tabela = tabela + "\n============================================";

        limpaTerminal();
        System.out.println(tabela);
    }

    public static long testeTempoSeq(int[] vetor, int chave) {

        long tempoInicial, tempo;

        tempoInicial = System.currentTimeMillis();
        buscaSequencial(vetor, chave);
        tempo = System.currentTimeMillis() - tempoInicial;

        return tempo;
    }

    public static long testeTempoBin(int[] vetor, int chave) {

        long tempoInicial, tempo;

        tempoInicial = System.currentTimeMillis();
        buscaSequencial(vetor, chave);
        tempo = System.currentTimeMillis() - tempoInicial;

        return tempo;
    }

    public static void buscaSequencial(int[] vetor, int chave) {

        Arrays.sort(vetor);

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == chave) {
                break;
            }
        }
    }

    public static void buscaBinaria(int[] vetor, int chave) {

        int inicio = 0;
        int fim = vetor.length - 1;
        int meio;

        Arrays.sort(vetor);

        while (fim >= inicio) {

            meio = (inicio + fim) / 2;

            if (vetor[meio] < chave) {
                inicio = meio + 1;
            } else if (vetor[meio] > chave) {
                fim = meio - 1;
            } else {
                break;
            }
        }
    }

    public static String gerarTabela(String tabela, long tempoBinario, long tempoSequencial) {

        if(tempoSequencial >= 10) {
            tabela = tabela + "=      " + tempoSequencial + "       ";
        } else {
            tabela = tabela + "=       " + tempoSequencial + "       ";
        }
        if(tempoBinario >= 10) {
            tabela = tabela + "=      " + tempoBinario + "      =";
        } else {
            tabela = tabela + "=       " + tempoBinario + "      =";
        }

        return tabela;
    }

    public static void limpaTerminal() {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }
}