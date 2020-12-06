package com.alcebiades.decorator;

/**
 *
 * @author Alcebiades
 */
public class IngredienteDecorator extends DecoratorSanduiche
{

    public IngredienteDecorator(Sanduiche sanduiche, String descricao, double preco) 
    {
        super(sanduiche, descricao, preco);
    }

    @Override
    public double getPreco() 
    {
       return this.getSanduiche().getPreco() + this.preco;
    }

    @Override
    public String getDescricao() 
    {
       return this.getSanduiche().getDescricao() + " " + this.descricao;
    }

}
//trelo