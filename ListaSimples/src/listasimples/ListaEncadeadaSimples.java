/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasimples;

/**
 *
 * @author anail
 */
public class ListaEncadeadaSimples {

    No inicio;

    // Inserir valores na tabela
    public void inserir(int valor) {
        No novoNo = new No(valor);

        if (inicio == null) {
            inicio = novoNo;
        } else {
            No noAtual = inicio;
            while (noAtual.prox != null) {
                noAtual = noAtual.prox;

            }
            noAtual.prox = novoNo;
        }
    }

    // Remover valores
    public boolean remover(int valor) {
        if (inicio == null) {
            System.out.println("Lista vazia");
            return false;
        }

        // caso o primeiro nó tenha o valor
        if (inicio.valor == valor) {
            inicio = inicio.prox;
            return true;
        }

        No atual = inicio;
        while (atual.prox != null && atual.prox.valor != valor) {
            atual = atual.prox;
        }

        if (atual.prox != null) {
            atual.prox = atual.prox.prox;
            return true;
        } else {
            System.out.println("Este valor não foi encontrado");
            return false;
        }
    }

    // Buscar valores na lista(true or false)
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

// Listar esses valores
    public void listar() {
        if (inicio == null) {
            System.out.print("Lista Vazia");
        } else {
            No noAtual = inicio;
            while (noAtual.prox != null) {
                System.out.println("No: " + noAtual.valor);
                noAtual = noAtual.prox;
            }
            System.out.println("No: " + noAtual.valor);
        }
    }

}
