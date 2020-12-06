package com.alcebiades.builder;

import com.alcebiades.composite.Computador;

/**
 *
 * @author Alcebiades
 */
public class Diretor {
    private Builder builder;

    public Diretor(Builder builder) {
        this.builder = builder;
    }
    
    public Computador build()
    {
        builder.buildDescricao();
        
        builder.buildListaComponentes();
        
        builder.addComponentes();
        
        return builder.getComputador();
    }
}
