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
public class Juridico extends Cliente{
    private String nomeFantasia;
    private String cnpj;

    public Juridico(String nomeFantasia, String cnpj, int codigo) {
        super(codigo, cnpj);
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "Juridico{" + "nomeFantasia=" + nomeFantasia + ", cnpj=" + cnpj + '}';
    }
    
}
