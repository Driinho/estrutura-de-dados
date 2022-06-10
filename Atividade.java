import java.util.Scanner;

public class Atividade {

    public static void main(String[] args) {

        int valor;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um numero Inteiro: ");
        valor = scan.nextInt();

        System.out.print("Numero invertido: ");
        inverter(valor);
    }

    public static int inverter(int valor) {

        int aux = valor;

        if(valor == 0) {
            return 0;
        } else {
            aux = valor % 10;
            System.out.print(aux);
            aux = valor / 10;
            return inverter(aux);
        }
    }
}