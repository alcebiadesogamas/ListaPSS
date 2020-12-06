package com.alcebiades.principal;

import com.alcebiades.builder.ComputadorDomesticoBuilder;
import com.alcebiades.builder.Diretor;
import com.alcebiades.composite.Componente;


/**
 *
 * @author Alcebiades
 */
public class Principal {
    public static void main(String[] args) {
        Diretor diretor = new Diretor(new ComputadorDomesticoBuilder());
    
        Componente computador = diretor.build();
        System.out.println(computador.getDescricao());
        System.out.println(computador.toString());
        System.out.println(computador.getPreco());
    }
    
}
