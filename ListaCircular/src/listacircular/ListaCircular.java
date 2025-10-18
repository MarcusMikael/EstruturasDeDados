/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listacircular;

/**
 *
 * @author anail
 */
public class ListaCircular {

    No inicio;
    No fim;

    public void inserir(int valor) {
        No novoNo = new No(valor);

        // Verificar lista fazia
        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
            fim.prox = inicio; // Ultimo apontando para o primeiro(inicio).
        } else {
            fim.prox = novoNo;
            fim = novoNo;
            fim.prox = inicio; // manter o circulo.
        }

    }

    // Listar elementos
    public void listar() {
        // Verifica se a lista está vazia
        if (inicio == null) {
            System.out.println("Esta lista está vazia");
            return;
        }

        // Começar pelo primeiro nó
        No atual = inicio;
        System.out.println("Lista Circular:");

        // Percorre até voltar ao início
        do {
            System.out.print(atual.valor + " ");
            atual = atual.prox; // vai pro próximo nó
        } while (atual != inicio);

        System.out.println();
    }

    // Buscar elementos(trur or false)
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

    // Remove um valor
    public boolean remover(int valor) {
        //Vericar se a lista esta vazia.
        if (inicio == null) {
            return false;
        }

        // Duas referências: uma pro nó atual e outra pro nó anterior
        No atual = inicio;
        No anterior = fim; // no início, o anterior do primeiro é o último (circular)

        //Percorrer a lista circular usando do...While.
        do {
            // Se encontrou o valor informado
            if (atual.valor == valor) {

                // Caso a lista possua apenas um nó, ou seja, o inicio vai ser o fim.
                if (atual == inicio && atual == fim) {
                    inicio = null;
                    fim = null;
                } // Se o primeiro nó a ser removido é o inicio.
                else if (atual == inicio) {
                    inicio = inicio.prox; // move o início pro próximo nó
                    fim.prox = inicio;     // o último nó aponta pro novo início
                } // Caso o nó a remover é ultimo(fim)
                else if (atual == fim) {
                    fim = anterior;       // o anterior vira o novo fim
                    fim.prox = inicio;    // e o novo fim aponta pro início
                } // Se o ní está no meio.
                else {
                    anterior.prox = atual.prox; // pula o nó atual, ligando anterior → próximo
                }
                return true;
            }

            // Avança os ponteiros
            anterior = atual;
            atual = atual.prox;

            // While até dar a volta completa
        } while (atual != inicio);

        // Se o valor não for encontrado
        return false;
    }
}
