import java.util.Scanner;

public class Atividade4 {

     public static final Scanner scan = new Scanner(System.in);

     public static void main(String[] args) {

          int[] vetor = pedirNumeros();
          int soma = somar(vetor);
     }

     public static int[] pedirNumeros() {

          int[] vetor;
          int[] vet;
          int aux, i = 0;
          vetor = new int[100];

          do {
               System.out.print("Digite um numero inteiro (-1 para sair): ");
               aux = scan.nextInt();
               if (aux < 0) {
                    System.out.println("Numero Invalido, -1 para sair.");
               } else {
                    vetor[i] = aux;
                    i++;
               }
          } while (aux != -1);

          vet = new int[i];

          for (i = 0; vetor[i] != 0; i++) {
               vet[i] = vetor[i];
          }
          return vet;
     }

     public static int somar(int[] vetor) {

          int soma = vetor[vetor.length];
          int[] vetorAux;

          vetorAux = new int[vetor.length - 1];

          for (int i = 0; i < vetorAux.length; i++) {
               vetorAux[i] = vetor[i];
          }

          return soma + somar(vetorAux);
     }
}
