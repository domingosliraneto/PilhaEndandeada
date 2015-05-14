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
    private No inicio;
    private No fim;
    private int tamanho;
    
    public PilhaEncandeada(){
        inicio = null;
        fim = null;
        tamanho = 0;
    }
    public boolean eVazia(int inicio) {
        return inicio < 0;
    }
    
    public void push(int numero){
        if(fim == null){
            inicio = new No();
            fim = inicio;
            No novoNo = new No();
            novoNo.setNumero(numero);
            novoNo.setProximo(inicio);
            inicio = novoNo;
            tamanho++;
        }
        else{
            No novoNo = new No();
            novoNo.setNumero(numero);
            novoNo.setProximo(inicio);
            inicio = novoNo;
            tamanho++;
        }
    }
    public void pop (int numero){
    
    }
    
    public void listar(){
        No percorrer = inicio;
        while(percorrer.getProximo() != null){
        System.err.println(percorrer.getNumero());
        percorrer = percorrer.getProximo();
        }
    }
}
