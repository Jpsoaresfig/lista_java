

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class App {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int selecao;
        List<String> lista = new ArrayList<String>();

        do {
            System.out.println("=== mercadinho são jose ===");
            System.out.println("1- adicionar itens na lista");
            System.out.println("2- remover itens da lista ");
            System.out.println("3- pesquisar itens");
            System.out.println("4- finalizar operação");
            selecao = entrada.nextInt();
            entrada.nextLine();

            if (selecao == 1) {// add itens a lista
                System.out.println("Digite qual item voce deseja adicionar na lista: ");
                String item = entrada.nextLine();
                lista.add(item);
                System.out.println("Item adicionado com sucesso! ");
                try {
                    Thread.sleep(1000); // Pausa de 1 segundo
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                clearScreen();//limpar tela
            } else if (selecao == 2) {//remoção de itens
                System.out.println("Digite o índice do item a ser removido");
                int indice = entrada.nextInt();
                lista.remove(indice);
                System.out.println("Item removido com sucesso! ");
                try {
                    Thread.sleep(1000); // Pausa de 1 segundos
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                clearScreen();//limpar tela
            } else if (selecao == 3) {//pesquisa de itens
                System.out.println(
                        "Digite o item que deseja pesquisar (lembre de digitar exatamente o que voce digitou): ");
                String itemPesquisado = entrada.nextLine();
                if (lista.contains(itemPesquisado))
                    System.out.println("O item pesquisado foi encontrado na posição " + lista.indexOf(itemPesquisado));
                try {
                    Thread.sleep(5000); // Pausa de 1 segundo
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                clearScreen();//limpar tela
            } else if (selecao == 4) {//finalização de programa
                System.out.println("aqui esta a sua lista \n " + lista);
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
       /*  try { caso queira adicionar um arquivo txt em algum local da tela
            FileWriter writer = new FileWriter(*add onde voce quer salvar"lista_de_compras.txt");
            for (String item : lista) {
                writer.write(item + "\n");
            }
            writer.close();
            System.out.println("Lista de compras salva em arquivo de texto com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao escrever lista em arquivo de texto.");
            e.printStackTrace(); */



}}
