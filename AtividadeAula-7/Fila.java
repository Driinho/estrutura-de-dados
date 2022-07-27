import java.util.Scanner;

import javafx.scene.media.AudioTrack;

public class Fila {
    
    public static final int TAM = 5;
    public static Scanner scan = new Scanner(System.in);
    public static int[] fila = new int[TAM];
    public static int qtdeItens = -1;

    public static void main(String[] args) {

        int op;

        do {
            System.out.print(menu());
            op = scan.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Digite o valor a ser inserido: ");
                    if (enfileirar(scan.nextInt())) {
                        System.out.println("[SUCESSO] Valor adicionado na fila !!");
                    } else {
                        System.out.println("[ERRO] Fila cheia !!");
                    }
                    break;

                 
                case 2:
                    if (desenfileirar()) {
                        System.out.println("[SUCESSO] Valor retirado da Fila !!");
                    } else {
                        System.out.println("[ERRO] Fila Vazia !!");
                    }

                    break;
                
                case 3:
                if(qtdeItens > -1) {
                    System.out.println(mostrarFila());
                } else {
                    System.out.println("[ERRO] Fila vazia !!");
                }
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
                
                    case 5:

                        System.out.print("Digite o valor a ser retirado: ");
                        int ret = buscarValor(scan.nextInt());
                        if (ret != -1) {
                            qtdeItens--;
                            reOrganizarFila(ret);
                            System.out.println("Valor retirado da posição [" + ret + "]");
                        } else {
                            System.out.println("Valor não encontrado na Fila !!");
                        }
                        break;
            }


        } while(op != 0);
    }

    public static boolean enfileirar(int valor) {

        if(qtdeItens < TAM - 1) {
            qtdeItens++;
            fila[qtdeItens] = valor;
            return true;
        } else {
            return false;
        }
    }

    public static boolean desenfileirar() {
        if(qtdeItens < 0) {
            return false;
        } else {
            qtdeItens--;
            reOrganizarFila(0);
        }

        return true;
    }

    
    public static int buscarValor(int valor) {

        for(int i = 0; i <= qtdeItens; i++) {
            if(fila[i] == valor) {
                return i;
            }
        }
        
        return -1;
    }
    
    public static void reOrganizarFila(int index) {

        for(int i = index; i <= qtdeItens; i++) {
            fila[i] = fila[i + 1];
        }
        
    }

    public static String mostrarFila() {

        String str = "[Fila]\n\n";
        for (int i = 0; i <= qtdeItens; i++) {
            str += "[" + fila[i] + "] ";
        }

        return str;
    }

    public static String menu() {

        String str = "";
        str += "\n====================";
        str += "\n= 1) Enfileirar    =";
        str += "\n= 2) Desenfileirar =";
        str += "\n= 3) Mostrar Fila  =";
        str += "\n= 4) Buscar Valor  =";
        str += "\n= 5) Tirar do meio =";
        str += "\n= 0) Sair          =";
        str += "\n====================";
        str += "\n> ";

        return str;
    }
}
