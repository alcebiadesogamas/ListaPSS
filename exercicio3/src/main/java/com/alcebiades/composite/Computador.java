package com.alcebiades.composite;

import java.util.ArrayList;

/**
 *
 * @author Alcebiades
 */
public class Computador extends Componente {

    private ArrayList<Componente> componentes;

    public void add(Componente componente) {
        this.getComponentes().add(componente);
        this.setPreco(this.getPreco()+componente.getPreco());
    }

    public void remove(Componente componente) {
        this.getComponentes().remove(componente);
    }

    @Override
    public double getPreco() {
        return this.preco;
    }

    @Override
    public String getDescricao() {
        return this.descricao;
    }
    
    
    public ArrayList getComponentes() {
        return componentes;
    }

    public void setComponentes(ArrayList componentes) {
        this.componentes = componentes;
    }

    @Override
    public String toString() {
        String str = "";
        
        for(Componente c : componentes)
        {
            str += c.getDescricao() + ", ";
        }
        
        return str;
    }

}
