/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.entity;

/**
 *
 * @author aluno.saolucas
 */
public class Produto {
    public int idProd;
    public String nomeProd;
    public String dataCadProd;
    public String categoriaProd;
    double valorUnitProd;
    int quantEstoqueProd;

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public String getNomeProd() {
        return nomeProd;
    }

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    public String getDataCadProd() {
        return dataCadProd;
    }

    public void setDataCadProd(String dataCadProd) {
        this.dataCadProd = dataCadProd;
    }

    public double getValorUnitProd() {
        return valorUnitProd;
    }

    public void setValorUnitProd(double valorUnitProd) {
        this.valorUnitProd = valorUnitProd;
    }

    public int getQuantEstoqueProd() {
        return quantEstoqueProd;
    }

    public void setQuantEstoqueProd(int quantEstoqueProd) {
        this.quantEstoqueProd = quantEstoqueProd;
    }

    public String getCategoriaProd() {
        return categoriaProd;
    }

    public void setCategoriaProd(String categoriaProd) {
        this.categoriaProd = categoriaProd;
    }
    
    public double calcularEstoque() {
    return this.valorUnitProd * this.quantEstoqueProd;
}

}
