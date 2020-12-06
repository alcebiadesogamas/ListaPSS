package com.alcebiades.decorator;

/**
 *
 * @author Alcebiades
 */
public abstract class DecoratorSanduiche extends Sanduiche
{
    
    private Sanduiche sanduiche;

    public DecoratorSanduiche(Sanduiche sanduiche, String descricao, double preco) 
    {
        this.sanduiche = sanduiche;
        super.setPreco(preco);
        super.setDescricao(descricao);
    }

    public Sanduiche getSanduiche() {
        return sanduiche;
    }

}
