package com.alcebiades.model;

import com.alcebiades.decorator.Sanduiche;

/**
 *
 * @author Alcebiades
 */
public class SanduicheConcreto extends Sanduiche{

    @Override
    public double getPreco() {
        return this.preco;
    }

    @Override
    public String getDescricao() {
       return this.descricao;
    }

    @Override
    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
