import java.util.Random;

public class AtividadeCasa {

    public static void main(String[] args) {

        int[] vetor = new int[10];
        Random gerador = new Random();

        // QUICK SORT COM O VETOR SENDO NO INICIO DO VETOR
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = gerador.nextInt(50);
        }
        System.out.println("\n\t\t[QUICK SORT INI]\n");
        quickSortMeio(vetor, 0, vetor.length - 1);
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(" [" + vetor[i] + "]");
        }

        // QUICK SORT COM O PIVOT SENDO NO MEIO DO VETOR
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = gerador.nextInt(50);
        }
        System.out.println("\n\n\t\t[QUICK SORT MEIO]\n");
        quickSortMeio(vetor, 0, vetor.length - 1);
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(" [" + vetor[i] + "]");
        }
    }

    private static void quickSort(int[] vetor, int ini, int fim) {
        if (ini < fim) {
            int pivot = separar(vetor, ini, fim);
            quickSort(vetor, ini, pivot - 1);
            quickSort(vetor, pivot + 1, fim);
        }
    }

    private static int separar(int[] vetor, int ini, int fim) {
        int pivot = vetor[ini];
        int i = ini + 1;
        while (i <= fim) {
            if (vetor[i] <= pivot)
                i++;
            else if (pivot < vetor[fim])
                fim--;
            else {
                int swap = vetor[i];
                vetor[i] = vetor[fim];
                vetor[fim] = swap;
                i++;
                fim--;
            }
        }
        vetor[ini] = vetor[fim];
        vetor[fim] = pivot;
        return fim;
    }

    private static void quickSortMeio(int[] vetor, int ini, int fim) {
        if (ini < fim) {
            int pivot = separarMeio(vetor, ini, fim);
            quickSort(vetor, ini, pivot - 1);
            quickSort(vetor, pivot + 1, fim);
        }
    }

    private static int separarMeio(int[] vetor, int ini, int fim) {
        int pivot = vetor[ini + fim / 2];
        int i = ini;
        while (i <= fim) {
            if (vetor[i] <= pivot)
                i++;
            else if (pivot < vetor[fim])
                fim--;
            else {
                int swap = vetor[i];
                vetor[i] = vetor[fim];
                vetor[fim] = swap;
                i++;
                fim--;
            }
        }
        vetor[ini] = vetor[fim];
        vetor[fim] = pivot;
        return fim;
    }
}
