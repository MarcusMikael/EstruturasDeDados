/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listadupla;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        int opcao;

        do {
            System.out.println("\n--- MENU LISTA DUPLAMENTE ENCADEADA ---");
            System.out.println("1 - Inserir");
            System.out.println("2 - Buscar (Consultar)");
            System.out.println("3 - Listar do Início ao Fim");
            System.out.println("4 - Listar do Fim ao Início");
            System.out.println("5 - Remover");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Valor a inserir: ");
                    int valor = sc.nextInt();
                    lista.inserir(valor);
                    System.out.println("Valor inserido: " + valor);
                }
                case 2 -> {
                    System.out.print("Valor a buscar: ");
                    int valor = sc.nextInt();
                    boolean encontrado = lista.buscar(valor);
                    if (encontrado) {
                        System.out.println("Valor " + valor + " encontrado na lista.");
                    } else {
                        System.out.println("Valor " + valor + " não encontrado.");
                    }
                }
                case 3 ->
                    lista.listarInicio();
                case 4 ->
                    lista.listarFim();
                case 5 -> {
                    System.out.print("Valor a remover: ");
                    int valor = sc.nextInt();
                    boolean removido = lista.remover(valor);
                    if (removido) {
                        System.out.println("Valor " + valor + " removido.");
                    } else {
                        System.out.println("Valor " + valor + " não encontrado.");
                    }
                }
                case 0 ->
                    System.out.println("Saindo...");
                default ->
                    System.out.println("Opção inválida. Tente novamente!");
            }
        } while (opcao != 0);

        sc.close();
    }
}
