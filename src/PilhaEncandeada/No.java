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
public class No {
    private int numero;
    private No Proximo;
    
    public No (){
    
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public No getProximo() {
        return Proximo;
    }

    public void setProximo(No Proximo) {
        this.Proximo = Proximo;
    }

  
    
}
