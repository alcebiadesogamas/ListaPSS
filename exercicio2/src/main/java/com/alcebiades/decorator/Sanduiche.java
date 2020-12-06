package com.alcebiades.decorator;

/**
 *
 * @author Alcebiades
 */
public abstract class Sanduiche {

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
