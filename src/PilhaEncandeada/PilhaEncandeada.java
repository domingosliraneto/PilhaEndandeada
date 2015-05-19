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
public class PilhaEncandeada {

    private int capacidade;
    private NoE pilha[];
    private int topo = -1;

   
    public void criarPilha(int tamanho) {
        this.pilha = new NoE[tamanho];
        this.capacidade = tamanho;
    }

    
    public boolean eVazia() {
        return topo > 0;
    }

    
    public boolean eCheia() {
        return (this.topo + 1 == capacidade);
    }

    
    public NoE push(int valor) {
        NoE elemento = new NoE(valor);
        if (!eCheia()) {
            this.pilha[++topo] = elemento;
            System.out.println("Elemento " + valor + " adicionado");
            return elemento;
        }
        return null;
    }
    
    
    public NoE pop() {
        if (eVazia()) {
            System.out.println("Pilha vazia, não posso retirar elemento desejado");
            return null;
        } else {
            NoE elemento = pilha[topo];
            pilha[topo--] = null;
            System.out.println("Elemento " + elemento.getValor() + " removido");
            return elemento;
        }
    }

    
    public int pegarTopo() {
        return topo -1;
    }

    
    public int tamanho() {
        return topo + 1;
    }

}