package com.alcebiades.builder;

import com.alcebiades.composite.Computador;

/**
 *
 * @author Alcebiades
 */
public abstract class Builder {

    private Computador computador;

    public Builder() {
        this.computador = new Computador();
    }
 
      public abstract void buildDescricao();
    
    public abstract void buildListaComponentes();

    public abstract void addComponentes();

    public Computador getComputador() {
        return this.computador;
    }

}
