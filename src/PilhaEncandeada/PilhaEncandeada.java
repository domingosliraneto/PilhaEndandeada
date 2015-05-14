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
    public void alocar(int num){
        inicio = new No();
        fim = inicio;
        PilhaEncandeada novaPilhaEncandeada = new PilhaEncandeada();
    }
}
