/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PilhaEncandeada;

/**
 *
 * @author Domingos Neto
 */
public class testarPilhaEncandeada {
    public static void main(String[] args) {
        PilhaEncadeada fila = new PilhaEncadeada();
        fila.criarFila(10);
        fila.enfileirar(10);
        fila.enfileirar(15);
        fila.desenfileirar();
        fila.enfileirar(5);
        fila.enfileirar(8);
        fila.desenfileirar();
        fila.enfileirar(13);
        fila.desenfileirar();
        fila.enfileirar(21);
        fila.enfileirar(50);
        fila.desenfileirar();
        fila.desenfileirar();
        

        fila.listar();
        
    }
    
}