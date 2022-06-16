import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        int valor;
        int fat;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        valor = scan.nextInt();

        System.out.print("Fatorial(" + valor + "): ");
        fat = fatorial(valor);
        System.out.print(" = " + fat);
    }

    public static int fatorial(int valor) {

        if(valor == 0) {
            return 1;
        }

        System.out.print(valor);
        if(valor > 1) {
            System.out.print(" * ");
        }
        
        return valor * fatorial(valor - 1);
    }
}
