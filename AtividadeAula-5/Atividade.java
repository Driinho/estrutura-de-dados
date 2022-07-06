import java.util.Random;

public class Atividade {

    public static void main(String[] args) {

        Random sort = new Random();
        int[] vetor = new int[10];
        int[] vetorQuick;
        int[] vetorMerge;

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

        vetorQuick = quickSort(vetor, 0, vetor.length - 1);
        System.out.println("\n\n\t\t[QUICK SORT]\n");
        for(int i = 0; i < vetorQuick.length; i++) {
            System.out.print(" [" + vetorQuick[i] + "]");
        }

        vetorMerge = mergeSorte(vetor, vetor.length);
        System.out.println("\n\n\t\t[MERGE SORT]\n");
        for(int i = 0; i < vetorMerge.length; i++) {
            System.out.print(" [" + vetorMerge[i] + "]");
        }
    }

    public static int[] quickSort(int[] vetor, int ini, int fim) {
        if (ini < fim) {
            int pivot = partition(vetor, ini, fim);
            quickSort(vetor, ini, pivot - 1);
            quickSort(vetor, pivot + 1, fim);	
        }

        return vetor;
    }

    public static int partition(int[] vetor, int ini, int fim) {
        
        int pivot = vetor[fim];
        int i = (ini - 1);

        for (int j = ini; j < fim; j++) {
            if (vetor[j] >= pivot) {
                i+=1;
                int swap = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = swap;
            }
        }

        // troca pivot (values[left]) com i.
        int swap = vetor[i + 1];
        vetor[i + 1] = vetor[fim];
        vetor[fim] = swap;

        return i + 1;
    }

    public static int[] mergeSorte(int vetor[], int tam){
        if(tam < 2){
            return vetor;
        }
        int meio = tam / 2;
        int vl[] = new int [meio];
        int vr[] = new int [tam - meio];

        for(int i = 0; i < meio; i++){
            vl[i] = vetor[i];
        }
        for(int i = meio; i < tam; i++){
            vr[i - meio] = vetor[i];
        }

        mergeSorte(vl, meio);
        mergeSorte(vr,tam - meio);
        merge(vetor, vl, vr, meio, tam - meio);

        return vetor;

    }

    public static void merge(int vetor[], int vl[], int vr[], int ini, int fim){
        int i = 0, j = 0, k = 0;
        while( i < ini && j < fim) {
            if(vl[i] >= vr[j]) {
                vetor[k++] = vl[i++];
            } else {
                vetor[k++] = vr[j++];
            }
        }
        while(i < ini) {
            vetor[k++] = vl[i++];
        }
        while(j < fim) {
            vetor[k++] = vr[j++];
        }
    }
}