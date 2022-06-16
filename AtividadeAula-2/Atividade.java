import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileWriter;

public class Atividade {

    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        // Scanner scan = new Scanner(System.in);
        Random sort = new Random();
        int op;
        boolean achou;
        long tempoInicialSequencial, tempoInicialBinario, tempoSequencial, tempoBinario;
        String tabela = "";

        do {
            limpaTerminal();
            System.out.println("====================================");
            System.out.println("=== Selecione o tamanho do vetor ===");
            System.out.println("=== 1) 10 Posicoes               ===");
            System.out.println("=== 2) 100 Posicoes              ===");
            System.out.println("=== 3) 1000 Posicoes             ===");
            System.out.println("=== 4) 10000 Posicoes            ===");
            System.out.println("=== 5) 100000 Posicoes           ===");
            System.out.println("=== 6) Tabela de Tempos          ===");
            System.out.println("=== 0) Sair                      ===");
            System.out.println("====================================");
            System.out.print("> ");
            op = scan.nextInt();

            switch (op) {
                case 0:

                    System.out.println("Saindo ...");

                    break;

                case 1:

                    int[] vetor1;
                    vetor1 = new int[10];

                    for (int i = 0; i < vetor1.length; i++) {
                        vetor1[i] = sort.nextInt(20);
                    }

                    tempoInicialSequencial = System.currentTimeMillis();
                    achou = buscaSequencial(vetor1, 70);
                    tempoSequencial = System.currentTimeMillis() - tempoInicialSequencial;

                    tempoInicialBinario = System.currentTimeMillis();
                    achou = buscaBinaria(vetor1, 70);
                    tempoBinario = System.currentTimeMillis() - tempoInicialBinario;
                    System.out.println("\nMilisegundos Binario: " + tempoBinario);
                    System.out.println("Milisegundos Sequencial: " + tempoSequencial);
                    System.out.println("Achou: " + achou);

                    tabela = tabela + "\n\n\tTempo de execucao Vetor[10]\nTempo na Busca Binaria: " + tempoBinario
                            + "\nTempo na Busca Sequencial: " + tempoSequencial;

                    scan.next();

                    break;

                case 2:

                    int[] vetor2;
                    vetor2 = new int[100];

                    for (int i = 0; i < vetor2.length; i++) {
                        vetor2[i] = sort.nextInt(200);
                    }

                    tempoInicialSequencial = System.currentTimeMillis();
                    achou = buscaSequencial(vetor2, 70);
                    tempoSequencial = System.currentTimeMillis() - tempoInicialSequencial;

                    tempoInicialBinario = System.currentTimeMillis();
                    achou = buscaBinaria(vetor2, 70);
                    tempoBinario = System.currentTimeMillis() - tempoInicialBinario;
                    System.out.println("\nMilisegundos Binario: " + tempoBinario);
                    System.out.println("Milisegundos Sequencial: " + tempoSequencial);
                    System.out.println("Achou: " + achou);

                    tabela = tabela + "\n\n\tTempo de execucao Vetor[100]\nTempo na Busca Binaria: " + tempoBinario
                            + "\nTempo na Busca Sequencial: " + tempoSequencial;

                    scan.next();

                    break;

                case 3:

                    int[] vetor3;
                    vetor3 = new int[1000];

                    for (int i = 0; i < vetor3.length; i++) {
                        vetor3[i] = sort.nextInt(2000);
                    }

                    tempoInicialSequencial = System.currentTimeMillis();
                    achou = buscaSequencial(vetor3, 70);
                    tempoSequencial = System.currentTimeMillis() - tempoInicialSequencial;

                    tempoInicialBinario = System.currentTimeMillis();
                    achou = buscaBinaria(vetor3, 70);
                    tempoBinario = System.currentTimeMillis() - tempoInicialBinario;
                    System.out.println("\nMilisegundos Binario: " + tempoBinario);
                    System.out.println("Milisegundos Sequencial: " + tempoSequencial);
                    System.out.println("Achou: " + achou);

                    tabela = tabela + "\n\n\tTempo de execucao Vetor[1000]\nTempo na Busca Binaria: " + tempoBinario
                            + "\nTempo na Busca Sequencial: " + tempoSequencial;

                    scan.next();

                    break;

                case 4:

                    int[] vetor4;
                    vetor4 = new int[10000];

                    for (int i = 0; i < vetor4.length; i++) {
                        vetor4[i] = sort.nextInt(20000);
                    }

                    tempoInicialSequencial = System.currentTimeMillis();
                    achou = buscaSequencial(vetor4, 70);
                    tempoSequencial = System.currentTimeMillis() - tempoInicialSequencial;

                    tempoInicialBinario = System.currentTimeMillis();
                    achou = buscaBinaria(vetor4, 70);
                    tempoBinario = System.currentTimeMillis() - tempoInicialBinario;
                    System.out.println("\nMilisegundos Binario: " + tempoBinario);
                    System.out.println("Milisegundos Sequencial: " + tempoSequencial);
                    System.out.println("Achou: " + achou);

                    tabela = tabela + "\n\n\tTempo de execucao Vetor[10000]\nTempo na Busca Binaria: " + tempoBinario
                            + "\nTempo na Busca Sequencial: " + tempoSequencial;

                    scan.next();

                    break;

                case 5:

                    int[] vetor5;
                    vetor5 = new int[100000];

                    for (int i = 0; i < vetor5.length; i++) {
                        vetor5[i] = sort.nextInt(200000);
                    }

                    tempoInicialSequencial = System.currentTimeMillis();
                    achou = buscaSequencial(vetor5, 70);
                    tempoSequencial = System.currentTimeMillis() - tempoInicialSequencial;

                    tempoInicialBinario = System.currentTimeMillis();
                    achou = buscaBinaria(vetor5, 70);
                    tempoBinario = System.currentTimeMillis() - tempoInicialBinario;
                    System.out.println("\nMilisegundos Binario: " + tempoBinario);
                    System.out.println("Milisegundos Sequencial: " + tempoSequencial);
                    System.out.println("Achou: " + achou);

                    tabela = tabela + "\n\n\tTempo de execucao Vetor[100000]\nTempo na Busca Binaria: " + tempoBinario
                            + "\nTempo na Busca Sequencial: " + tempoSequencial;

                    scan.next();

                    break;

                case 6:

                    limpaTerminal();
                    System.out.println(tabela);

                    scan.next();

                    break;

                default:

                    System.out.println("Numero Invalido!!");

                    break;
            }

        } while (op != 0);
    }

    public static boolean buscaSequencial(int[] vetor, int chave) {

        Arrays.sort(vetor);

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == chave) {
                return true;
            }
        }
        return false;
    }

    public static boolean buscaBinaria(int[] vetor, int chave) {

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
                return true;
            }
        }
        return false;
    }

    public static void limpaTerminal() {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }
}