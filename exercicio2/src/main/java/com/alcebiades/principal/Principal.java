package com.alcebiades.principal;

import com.alcebiades.builder.BuilderHambuguer;
import com.alcebiades.builder.Diretor;
import com.alcebiades.decorator.Sanduiche;

/**
 *
 * @author Alcebiades
 */
public class Principal {
    public static void main(String[] args) {
        Diretor diretor = new Diretor(new BuilderHambuguer());
        
        Sanduiche sanduiche = diretor.build();
        System.out.println(sanduiche.getDescricao()+"\n"+sanduiche.getPreco());
        
    }
}
