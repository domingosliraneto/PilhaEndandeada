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
public class NoE {
    int valor;
    NoE proximo;

    public NoE(int valor, NoE proximo) {
        this.valor = valor;
        this.proximo = proximo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NoE getProximo() {
        return proximo;
    }

    public void setProximo(NoE proximo) {
        this.proximo = proximo;
    }
       
}