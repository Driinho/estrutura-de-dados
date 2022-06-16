import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {
        int valor, fibo;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        valor = scan.nextInt();

        fibo = fibonacci(valor);
        System.out.println("O (" + valor + ") valor da sequencia fibonacci e: " + fibo);
    }

    public static int fibonacci(int valor) {

        if (valor == 1) {

            return 0;
        } else if (valor == 2) {

            return 1;
        } else {

            return fibonacci(valor - 1) + fibonacci(valor - 2);
        }
    }
}
