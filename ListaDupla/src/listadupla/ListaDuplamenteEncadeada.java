/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listadupla;

/**
 *
 * @author anail
 */
public class ListaDuplamenteEncadeada {

    No inicio;
    No fim;

    // Inserir valores na Lista
    public void inserir(int valor) {
        No novoNo = new No(valor);

        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.prox = novoNo; // Liga o ultimo nó ao novo nó
            novoNo.anterior = fim; // Liga o novo nó ao ultimo anterior
            fim = novoNo; // atualizar o fim
        }
    }

    // Lista começando pelo início
    public void listarInicio() {
        // Verifica se a lista está vazia
        if (inicio == null) {
            System.out.println("Esta lista está vazia");
            return;
        }

        // Começar pelo primeiro nó
        No atual = inicio;
        System.out.println("Lista início -> fim: ");
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.prox; // vai pro próximo nó
        }
        System.out.println();
    }

    public void listarFim() {
        // Verifica se a lista está vazia
        if (inicio == null) {
            System.out.println("Esta lista está vazia");
            return;
        }

        No atual = fim;
        System.out.println("Lista fim -> início: ");
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.anterior; // volta para o nó anterior
        }
        System.out.println();
    }

    public boolean buscar(int valor) {
        No atual = inicio;
        while (atual != null) {
            if (atual.valor == valor) {
                return true;
            }
            atual = atual.prox;
        }
        return false;
    }

    public boolean remover(int valor) {
        // Verificar se a lista está vazia.
        if (inicio == null) {
            System.out.println("Lista vazia");
            return false;
        }

        // Caso o primeiro nó tenha o valor
        if (inicio.valor == valor) {
            inicio = inicio.prox; // avança o início, ou seja, o inicio será o inicio com campo proximo.
            if (inicio != null) {
                inicio.anterior = null; // novo início não tem anterior
            } else {
                fim = null; // se a lista ficou vazia
            }
            return true;
        }

        // Percorre do início ao fim
        No atual = inicio.prox;
        while (atual != null) {
            if (atual.valor == valor) {
                // Reencaixa os vizinhos
                atual.anterior.prox = atual.prox;
                if (atual.prox != null) {
                    atual.prox.anterior = atual.anterior;
                } else {
                    // Se o nó era o último, atualiza o fim
                    fim = atual.anterior;
                }
                return true;
            }
            atual = atual.prox;
        }

        System.out.println("Valor não encontrado");
        return false;
    }
}
