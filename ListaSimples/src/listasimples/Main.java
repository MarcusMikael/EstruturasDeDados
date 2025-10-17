/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listasimples;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaEncadeadaSimples lista = new ListaEncadeadaSimples();
        int opcao;

        do {
            System.out.println("\n--- MENU LISTA ENCADEADA ---");
            System.out.println("1 - Inserir");
            System.out.println("2 - Consultar (Buscar)");
            System.out.println("3 - Listar Todos");
            System.out.println("4 - Excluir");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Valor a inserir: ");
                    int vIns = sc.nextInt();
                    lista.inserir(vIns);
                    System.out.println("Inserido: " + vIns);
                }
                case 2 -> {
                    System.out.print("Valor a consultar: ");
                    int valor = sc.nextInt();
                    boolean existe = lista.buscar(valor);
                    if (existe) {
                        System.out.println(" Valor " + valor + " encontrado na lista.");
                    } else {
                        System.out.println(" Valor " + valor + " NÃO encontrado na lista.");
                    }
                }
                case 3 ->
                    lista.listar();
                case 4 -> {
                    System.out.print("Valor a excluir: ");
                    int vExc = sc.nextInt();
                    boolean excluiu = lista.remover(vExc);
                    if (excluiu) {
                        System.out.println("?️ Valor " + vExc + " excluído.");
                    } else {
                        System.out.println("️ Valor " + vExc + " não encontrado.");
                    }
                }
                case 0 ->
                    System.out.println(" Saindo...");
                default ->
                    System.out.println("Opção inválida. Tente novamente!");
            }
        } while (opcao != 0);

        sc.close();
    }
}
