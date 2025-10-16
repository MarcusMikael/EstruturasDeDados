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
		
		if(inicio == null) {
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
        public void remover(int valor) {
            // Verificar se a lista está vazia
            if (inicio == null) return;
            // Caso o valor seja o primeiro da lista
            if (inicio.valor == valor){
                inicio = inicio.prox;
            }
            // Percorrer a lista até o nó anterior do removido
            No atual = inicio;
            while(atual.prox != null && atual.prox.valor != valor) {
                atual = atual.prox;
            }
            if (atual.prox != null) {
                atual.prox = atual.prox.prox;
            } else {
                System.out.println("Este valor não foi encontrado");
            }
        }
        
        // Buscar valores na lista(true or false)
        public boolean buscar(int valor){
            No atual = inicio;
            while(atual != null) {
                if(atual.valor == valor){
                    return true;
                }
                atual = atual.prox;
            }
            return false;
        }
        

// Listar esses valores
	public void listar () {
		if(inicio == null) {
			System.out.print("Lista Vazia");
		} else {
			No noAtual = inicio;
			while(noAtual.prox != null) {
				System.out.println("No: " + noAtual.valor);
				noAtual = noAtual.prox;
			}
			System.out.println("No: " + noAtual.valor);
		}
	}

}
