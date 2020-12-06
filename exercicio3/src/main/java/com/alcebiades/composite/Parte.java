package com.alcebiades.composite;

/**
 *
 * @author Alcebiades
 */
public class Parte extends Componente {

    public Parte(double preco, String descricao) {
        this.preco = preco;
        this.descricao = descricao;
    }

    @Override
    public double getPreco() {
        return this.preco;
    }

    @Override
    public String getDescricao() {
        return this.descricao;
    }

}
