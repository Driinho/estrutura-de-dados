import java.util.Scanner;

public class AtividadePilha {

    public static final int TAM = 5;
    public static Scanner scan = new Scanner(System.in);
    public static int[] pilha = new int[TAM];
    public static int qtdeItens = -1;

    public static void main(String[] args) {

        int op = 0;

        do {

            System.out.print(menu());
            op = scan.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Digite o valor a ser inserido: ");
                    if (push(scan.nextInt())) {
                        System.out.println("[SUCESSO] Valor adicionado na Pilha !!");
                    } else {
                        System.out.println("[ERRO] Pilha cheia !!");
                    }
                    break;

                case 2:
                    if (pop()) {
                        System.out.println("[SUCESSO] Valor retirado da Pilha !!");
                    } else {
                        System.out.println("[ERRO] PIlha Vazia !!");
                    }

                    break;

                case 3:
                    System.out.println(mostrarPilha());
                    break;

                case 4:
                    System.out.print("Digite o valor a ser buscado: ");
                    int result = buscarValor(scan.nextInt());
                    if (result != -1) {
                        System.out.println("O valor esta na posicao [" + result + "]");
                    } else {
                        System.out.println("Valor nao encontrado !!");
                    }
                    break;
            }

        } while (op != 0);

    }

    public static boolean push(int valor) {

        if (qtdeItens < TAM - 1) {
            qtdeItens++;
            pilha[qtdeItens] = valor;
            return true;
        } else {
            return false;
        }
    }

    public static boolean pop() {

        if (qtdeItens >= 0) {
            pilha[qtdeItens] = 0;
            qtdeItens--;
            return true;
        } else {
            return false;
        }
    }

    public static int buscarValor(int valor) {

        for (int i = 0; i <= qtdeItens; i++) {
            if (pilha[i] == valor) {
                return i;
            }
        }

        return -1;
    }

    public static String mostrarPilha() {
        String str = "[Pilha]";
        for (int i = qtdeItens; i >= 0; i--) {
            str += "\n[" + pilha[i] + "]";
        }

        return str;
    }

    public static String menu() {

        String str = "";
        str += "\n====================";
        str += "\n= 1) Empilhar      =";
        str += "\n= 2) Desempilhar   =";
        str += "\n= 3) Mostrar Pilha =";
        str += "\n= 4) Buscar Valor  =";
        str += "\n= 0) Sair          =";
        str += "\n====================";
        str += "\n> ";

        return str;
    }
}
