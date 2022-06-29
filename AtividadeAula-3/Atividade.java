import java.util.Random;

public class Atividade {
    
    public static void main(String[] args) {

        Random sort = new Random();
        int[] vetor;
        int[] vetorBubble;
        int[] vetorInsertionSort;
        vetor = new int[10];

        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = sort.nextInt(20);

            for(int j = 0; j < i; j++) {
                if(vetor[j] == vetor[i]) {
                    do {
                        vetor[j] = sort.nextInt(20);                    
                    }while(vetor[i] == vetor[j]);
                }
            }
        }

        vetorBubble = bubble(vetor);
        vetorInsertionSort = insertionSort(vetor);

        System.out.println("\n\t\t[Bubble Sort]\n");

        
        for(int i = 0; i < vetorBubble.length; i++) {
            System.out.print("[" + vetorBubble[i] + "] ");
        }

        System.out.println("\n\n\t\t[Insertion Sort]\n");

        for(int i = 0; i < vetorInsertionSort.length; i++) {
            System.out.print("[" + vetorInsertionSort[i] + "] ");
        }
     
        System.out.println("\n");
    }

    public static int[] bubble(int[] vetor) {

        int aux;

        for(int i = vetor.length; i >= 1; i--) {
            for(int j = 1; j < i; j++) {
                if(vetor[j - 1] < vetor[j]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j - 1];
                    vetor[j - 1] = aux;
                }
            }
        }

        return vetor;
    }

    public static int[] insertionSort(int[] vetor) {

        for(int i = 1; i < vetor.length; i++) {
            int aux = vetor[i];
            int j = i - 1;
            while((i >= 0) && (vetor[j] < aux)) {
                vetor[j + 1] = vetor[j];
                j++;
            }
            vetor[j + 1] = aux;
        }

        return vetor;
    }
}
