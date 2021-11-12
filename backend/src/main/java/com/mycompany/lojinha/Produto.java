/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lojinha;

/**
 *
 * @author rafap
 */
public class Produto {
    private int codigo;
    private String nome;
    private float valor;
    private float quantEstoque;

    public Produto(int codigo, String nome, float valor, float quantEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.quantEstoque = quantEstoque;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getQuantEstoque() {
        return quantEstoque;
    }

    public void setQuantEstoque(float quantEstoque) {
        this.quantEstoque = quantEstoque;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Produto{codigo=").append(codigo);
        sb.append(", nome=").append(nome);
        sb.append(", valor=").append(valor);
        sb.append(", quantEstoque=").append(quantEstoque);
        sb.append('}');
        return sb.toString();
    }
    
    
}
