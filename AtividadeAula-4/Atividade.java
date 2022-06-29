import java.util.Random;

public class Atividade {
    
    public static void main(String[] args) {

        Random sort = new Random();
        int[] vetor = new int[10];
        int[] vetorSelection, vetorShell;


        for(int i  = 0; i < 10; i++) {
            vetor[i] = sort.nextInt(20);

            for(int j = 0; j < i; j++) {
                if(vetor[j] == vetor[i]) {
                    do {
                        vetor[j] = sort.nextInt(20);                    
                    }while(vetor[i] == vetor[j]);
                }
            }
        }

        vetorSelection = selectionSort(vetor);

        System.out.println("\n\t\t[SELECTION SORT]\n");
        for(int i = 0; i < 10; i++) {
            System.out.print( " (" + vetorSelection[i] + ")");
        }

        vetorShell = shellSort(vetor);

        System.out.println("\n\n\t\t[SHELL SORT]\n");
        for(int i = 0; i < 10; i++) {
            System.out.print(" (" + vetorShell[i] + ")");
        }

        System.out.println("\n");
    }

    public static int[] selectionSort(int [] vetor) {
        for(int i = 0; i < vetor.length; i++) {

            int menor = i;
            for(int j = i + 1; j < vetor.length; j++) {
                if(vetor[j] > vetor[menor]) {
                    menor = j;
                }
            }

            int aux = vetor[i];
            vetor[i] = vetor[menor];
            vetor[menor] = aux;
        }

        return vetor;
    }

    public static int[] shellSort(int[] vetor) {

        int i, j, valor, tam = vetor.length;
        int gap = 1;

        while (gap < tam) {
            gap = 3 * gap + 1;
        }

        while (gap > 1) {
            gap /= 3;

            for(i = gap; i < tam; i++) {
                valor = vetor[i];
                j = i - gap;
                while(j >= 0 && valor > vetor[j]) {
                    vetor[j + gap] = vetor[j];
                    j -= gap;
                }
                vetor[j + gap] = valor;
            }
        }

        return vetor;
    }
}