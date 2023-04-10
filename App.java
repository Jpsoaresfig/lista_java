
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class App {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int selecao;
        List<String> lista = new ArrayList<String>();

        do {
            System.out.println("=== Lista nome ===");
            System.out.println("1- adicionar nomes");
            System.out.println("2- remover nomes ");
            System.out.println("3- pesquisar nomes");
            System.out.println("4- finalizar operação");
            selecao = entrada.nextInt();
            entrada.nextLine();

            if (selecao == 1) {// add itens a lista
                System.out.println("Digite qual nome voce deseja adicionar na lista: ");
                String item = entrada.nextLine();
                lista.add(item);
                System.out.println("nome adicionado com sucesso! ");
                try {
                    Thread.sleep(1000); // Pausa de 1 segundo
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                clearScreen();//limpar tela
            } else if (selecao == 2) {//remoção de itens
                System.out.println("Digite o índice do nome a ser removido");
                int indice = entrada.nextInt();
                lista.remove(indice);
                System.out.println("nome removido com sucesso! ");
                try {
                    Thread.sleep(1000); // Pausa de 1 segundos
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                clearScreen();//limpar tela
            } else if (selecao == 3) {//pesquisa de itens
                System.out.println(
                        "Digite o nome que deseja pesquisar (lembre de digitar exatamente o que voce digitou): ");
                String itemPesquisado = entrada.nextLine();
                if (lista.contains(itemPesquisado))
                    System.out.println("O nome pesquisado foi encontrado na posição " + lista.indexOf(itemPesquisado));
                try {
                    Thread.sleep(5000); // Pausa de 1 segundo
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                clearScreen();//limpar tela
            } else if (selecao == 4) {//finalização de programa
                System.out.println("aqui esta a sua lista \n " + lista);
                escreverListaEmArquivo(lista);
                break;
            } else {
                System.out.println("erro, tente novamente ");
            }

        } while (selecao != 4);
        entrada.close();
    }

    public static void clearScreen() { //limpeza do buffer dentro do loop
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
    public static void escreverListaEmArquivo(List<String> lista) {
        try { 
            FileWriter writer = new FileWriter("lista_de_compras.txt");
            for (String item : lista) {
                writer.write(item + "\n");
            }
            writer.close();
            System.out.println("Lista de compras salva em arquivo de texto com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao escrever lista em arquivo de texto.");
            e.printStackTrace(); 
        }
    }
}
