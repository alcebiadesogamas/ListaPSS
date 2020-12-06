package com.alcebiades.composite;

/**
 *
 * @author Alcebiades
 */
public abstract class Componente {

    protected double preco;
    protected String descricao;

    public abstract double getPreco();

    public abstract String getDescricao();

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
