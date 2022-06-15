import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {

        int valor;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um numero Inteiro: ");
        valor = scan.nextInt();

        System.out.print("Numero invertido: ");
        inverter(valor);
        System.out.println();
    }

    public static int inverter(int valor) {

        if(valor == 0) {
            return 0;
        } else {
            System.out.print(valor % 10);
            valor = valor / 10;
            return inverter(valor);
        }
    }
}