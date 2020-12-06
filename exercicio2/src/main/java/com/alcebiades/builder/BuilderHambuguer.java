package com.alcebiades.builder;

import com.alcebiades.decorator.IngredienteDecorator;

/**
 *
 * @author Alcebiades
 */
public class BuilderHambuguer extends Builder
{
    
    @Override
    public void addIngredientes() {
        sanduiche = new IngredienteDecorator(sanduiche, "presunto", 0.30);
        sanduiche = new IngredienteDecorator(sanduiche, "queijo", 0.30);
        sanduiche = new IngredienteDecorator(sanduiche, "ovo", 0.30);
        sanduiche = new IngredienteDecorator(sanduiche, "alface", 0.30);
        sanduiche = new IngredienteDecorator(sanduiche, "tomate", 0.30);
        sanduiche = new IngredienteDecorator(sanduiche, "maionese", 0.30);     
    }

    @Override
    public void addPao() {
        sanduiche.setDescricao("pao de hamburguer");
        sanduiche.setPreco(0.50);
    }

}
