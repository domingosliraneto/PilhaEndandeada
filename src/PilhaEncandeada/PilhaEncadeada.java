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
public class PilhaEncadeada implements interfaceFilaArranjoSimples {

    private NoE fila[];
    private int capacidade;
    private int inicio = 0;
    private int fim = 0;

    @Override
    public void criarFila(int tamanho) {
        fila = new NoE[tamanho];
        capacidade = tamanho;
    }

    @Override
    public boolean eCheia() {
        return fim == capacidade;
    }

    @Override
    public boolean eVazia() {
        return fim == inicio;
    }

    @Override
    public int tamanho() {
        return fim + 1;
    }

    @Override
    public NoE enfileirar(int valor) {
        if (!eCheia()) {
            NoE elemento = new NoE(valor);
            fila[fim++] = elemento;
            return elemento;
        }
        System.out.println("Fila cheia");
        return null;
    }

    @Override
    public NoE desenfileirar() {
        if (!eVazia()) {
            NoE aux = fila[inicio];
            fila[inicio++] = null;
            return aux;
        }
        System.out.println("Fila não possui elementos");
        return null;
    }

    @Override
    public int pegarInicio() {
        if (inicio != 0 && fim != 0) {
            return fila[inicio].getValor();
        } else {
            return -1;
        }

    }

    @Override
    public void listar() {
        if (!eVazia()) {
            for (int i = inicio; i < fim; i++) {
                System.out.println(fila[i].getValor());
            }
            System.out.println("----------------------------------");
        }
    }

}