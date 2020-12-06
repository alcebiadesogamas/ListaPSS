package com.alcebiades.builder;

import com.alcebiades.decorator.Sanduiche;

/**
 *
 * @author Alcebiades
 */
public class Diretor {
   private Builder builder;

    public Diretor(Builder builder) {
        this.builder = builder;
        this.builder.addPao();
    }
    
    public Sanduiche build()
    {
        this.builder.addIngredientes();   
        return this.builder.getSanduiche();
    }
   
}
