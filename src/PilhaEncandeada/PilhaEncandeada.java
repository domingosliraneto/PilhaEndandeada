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
    public No inicio;
    public No fim;
    public int tamanho;
    
    public PilhaEncandeada(){
        inicio = null;
        fim = null;
        tamanho = 0;
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

}
