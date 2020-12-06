package com.alcebiades.builder;

import com.alcebiades.decorator.IngredienteDecorator;

/**
 *
 * @author Alcebiades
 */
public class BuilderAmericano extends Builder
{
   @Override
    public void addIngredientes() 
    {
        sanduiche = new IngredienteDecorator(sanduiche, "presunto", 0.30);
        sanduiche = new IngredienteDecorator(sanduiche, "queijo", 0.30);
        sanduiche = new IngredienteDecorator(sanduiche, "ovo", 0.30);
        sanduiche = new IngredienteDecorator(sanduiche, "alface", 0.30);
        sanduiche = new IngredienteDecorator(sanduiche, "tomate", 0.30);
        sanduiche = new IngredienteDecorator(sanduiche, "maionese", 0.30);     
    }

    @Override
    public void addPao() 
    {
       sanduiche = new IngredienteDecorator(sanduiche, "pão comum", 0.40);
    }

}
