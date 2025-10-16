/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listasimples;

/**
 *
 * @author anail
 */
public class Main {

    public static void main(String[] args) {
        
        ListaEncadeadaSimples l = new ListaEncadeadaSimples();
        l.inserir(8);
        l.inserir(15);
        l.inserir(31);
        System.out.println("\nLista dos elementos:");
        l.listar();
        System.out.println("\nBuscar elemento:");
        // Exemplo 15 existe na lista, e o 16 não existe.
        System.out.println("Buscar 15: " + l.buscar(15));
        System.out.println("Buscar 16: " + l.buscar(16));
        // Remoer elemento
        System.out.println("\nRemovendo");
        l.remover(15);
        // Lista após as alteraçoes
        System.out.println("\n Lista atualizada");
        l.listar();
        
    }
}

