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
public class PilhaEncadeada {

    int tamanho = 0;
    NoE topo;

    public void criarPilha(int tamanho) {
        topo = new NoE(-1, null);
    }

    public boolean eVazia() {
        return tamanho == 0;
    }

    public int Tamanho() {
        return tamanho;
    }

    public void Limpar() {
        topo.setProximo(null);
    }

    public NoE push(int valor) {
        NoE elemento = new NoE(valor, null);
        elemento.setProximo(topo.getProximo());
        topo.setProximo(elemento);
        tamanho++;
        return elemento;
    }

    public NoE pop() {
        if (eVazia()) {
            System.out.println("Pilha vazia, não posso retirar elemento desejado");
            return null;
        } else {
            NoE aux = topo.getProximo();
            topo.setProximo(topo.getProximo().getProximo());
            return aux;
        }
    }

    public int pegarTopo() {
        return topo.getProximo().getValor();
    }

    public void listar() {
        if (eVazia()) {
            System.out.println("Pilha vazia, não posso retirar elemento desejado");
        } else {
            NoE aux = topo.getProximo();
            while (aux != null) {
                System.out.println(aux.getValor());
                aux = aux.getProximo();

            }
        }
    }
}
