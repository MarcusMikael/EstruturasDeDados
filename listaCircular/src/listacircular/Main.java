/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listacircular;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaCircular lista = new ListaCircular();
        int opcao;

        do {
            System.out.println("\n--- MENU LISTA CIRCULAR ---");
            System.out.println("1 - Inserir");
            System.out.println("2 - Buscar");
            System.out.println("3 - Listar");
            System.out.println("4 - Remover");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Valor a inserir: ");
                    int valor = sc.nextInt();
                    lista.inserir(valor);
                    System.out.println("✅ Valor inserido: " + valor);
                }
                case 2 -> {
                    System.out.print("Valor a buscar: ");
                    int valor = sc.nextInt();
                    if (lista.buscar(valor)) {
                        System.out.println("🔎 Valor encontrado!");
                    } else {
                        System.out.println("❌ Valor não encontrado!");
                    }
                }
                case 3 ->
                    lista.listar();
                case 4 -> {
                    System.out.print("Valor a remover: ");
                    int valor = sc.nextInt();
                    if (lista.remover(valor)) {
                        System.out.println("🗑️ Valor removido!");
                    } else {
                        System.out.println("⚠️ Valor não encontrado!");
                    }
                }
                case 0 ->
                    System.out.println("👋 Saindo...");
                default ->
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}
