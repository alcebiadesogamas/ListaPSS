package com.alcebiades.builder;


import com.alcebiades.decorator.Sanduiche;
import com.alcebiades.model.SanduicheConcreto;


/**
 *
 * @author Alcebiades
 */
public abstract class Builder {
    
    protected Sanduiche sanduiche;
    
    public Builder()
    {
        sanduiche = new SanduicheConcreto();
    }
    
    public Sanduiche getSanduiche()
    {
        
        return this.sanduiche;
    }
             
    public abstract void addIngredientes();
    
    public abstract void addPao();
    
 
}
