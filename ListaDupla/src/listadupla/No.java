/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listadupla;

/**
 *
 * @author anail
 */
public class No {
    int valor;
    No prox;
    No anterior;
    
    public No(int valor) {
        this.valor = valor;
        this.prox = null;
        this.anterior = null;
    }
}
