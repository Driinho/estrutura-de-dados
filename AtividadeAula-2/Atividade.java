import java.util.Arrays;
import java.util.Random;

public class Atividade {

    public static void main(String[] args) {

        Random sort = new Random();
        int chave;
        long tempoInicialSequencial, tempoInicialBinario, tempoSequencial, tempoBinario;
        String tabela = "============================================";
        tabela = tabela + "\n============ Tempo de Execucoes ============";
        tabela = tabela + "\n============================================";
        tabela = tabela + "\n=   Vetor   =   Sequencial   =   Binario   =";
        tabela = tabela + "\n============================================";

        limpaTerminal();

        int[] vetor1;
        vetor1 = new int[10];

        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = sort.nextInt(20);
        }

        chave = sort.nextInt(20);

        tempoInicialSequencial = System.currentTimeMillis();
        buscaSequencial(vetor1, chave);
        tempoSequencial = System.currentTimeMillis() - tempoInicialSequencial;

        tempoInicialBinario = System.currentTimeMillis();
        buscaSequencial(vetor1, chave);
        tempoBinario = System.currentTimeMillis() - tempoInicialBinario;

        // GERANDO TABELA
        tabela = tabela + "\n=   10      ";
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

        int[] vetor2;
        vetor2 = new int[100];

        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = sort.nextInt(200);
        }

        chave = sort.nextInt(200);

        tempoInicialSequencial = System.currentTimeMillis();
        buscaSequencial(vetor2, chave);
        tempoSequencial = System.currentTimeMillis() - tempoInicialSequencial;

        tempoInicialBinario = System.currentTimeMillis();
        buscaSequencial(vetor2, chave);
        tempoBinario = System.currentTimeMillis() - tempoInicialBinario;

        // GERANDO TABELA
        tabela = tabela + "\n=   100     ";
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

        int[] vetor3;
        vetor3 = new int[1000];

        for (int i = 0; i < vetor3.length; i++) {
            vetor3[i] = sort.nextInt(2000);
        }

        chave = sort.nextInt(2000);

        tempoInicialSequencial = System.currentTimeMillis();
        buscaSequencial(vetor3, chave);
        tempoSequencial = System.currentTimeMillis() - tempoInicialSequencial;

        tempoInicialBinario = System.currentTimeMillis();
        buscaSequencial(vetor3, chave);
        tempoBinario = System.currentTimeMillis() - tempoInicialBinario;

        // GERANDO TABELA
        tabela = tabela + "\n=   1000    ";
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

        int[] vetor4;
        vetor4 = new int[10000];

        for (int i = 0; i < vetor4.length; i++) {
            vetor4[i] = sort.nextInt(20000);
        }

        chave = sort.nextInt(20000);

        tempoInicialSequencial = System.currentTimeMillis();
        buscaSequencial(vetor4, chave);
        tempoSequencial = System.currentTimeMillis() - tempoInicialSequencial;

        tempoInicialBinario = System.currentTimeMillis();
        buscaSequencial(vetor4, chave);
        tempoBinario = System.currentTimeMillis() - tempoInicialBinario;

        // GERANDO TABELA
        tabela = tabela + "\n=   10000   ";
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

        int[] vetor5;
        vetor5 = new int[100000];

        for (int i = 0; i < vetor5.length; i++) {
            vetor5[i] = sort.nextInt(200000);
        }

        chave = sort.nextInt(200000);

        tempoInicialSequencial = System.currentTimeMillis();
        buscaSequencial(vetor5, chave);
        tempoSequencial = System.currentTimeMillis() - tempoInicialSequencial;

        tempoInicialBinario = System.currentTimeMillis();
        buscaSequencial(vetor5, chave);
        tempoBinario = System.currentTimeMillis() - tempoInicialBinario;

        // GERANDO TABELA
        tabela = tabela + "\n=   100000  ";
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

        tabela = tabela + "\n============================================";

        limpaTerminal();
        System.out.println(tabela);
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

    public static void limpaTerminal() {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }
}