import java.util.Arrays;
import java.util.Random;
import java.util.Vector;

public class Atividade {

    public static void main(String[] args) {

        Random sort = new Random();
        long tempoBinario, tempoSequencial;
        int tam = 1;
        int chave;
        String tabela = "============================================";
        tabela = tabela + "\n============ Tempo de Execucoes ============";
        tabela = tabela + "\n============================================";
        tabela = tabela + "\n=   Vetor   =   Sequencial   =   Binario   =";
        tabela = tabela + "\n============================================";

        int[] vetor;

        do {

            tam = tam * 10;

            vetor = new int[tam];

            for (int i = 0; i < vetor.length; i++) {
                vetor[i] = sort.nextInt(20);
            }

            chave = sort.nextInt(20);

            tempoSequencial = testeTempoSeq(vetor, chave);
            tempoBinario = testeTempoBin(vetor, chave);

            // GERANDO TABELA
            if(tam == 10) {
                tabela = tabela + "\n=   10      ";
            } else if(tam == 100) {
                tabela = tabela + "\n=   100     ";
            } else if(tam == 1000) {
                tabela = tabela + "\n=   1000    ";
            } else if(tam == 10000) {
                tabela = tabela + "\n=   10000   ";
            } else {
                tabela = tabela + "\n=   100000  ";
            }
            tabela = gerarTabela(tabela, tempoBinario, tempoSequencial);

        } while(tam != 100000);

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