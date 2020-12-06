package com.alcebiades.builder;

import com.alcebiades.composite.Componente;
import com.alcebiades.composite.Computador;
import com.alcebiades.composite.Parte;
import java.util.ArrayList;

/**
 *
 * @author Alcebiades
 */
public class ComputadorDomesticoBuilder extends Builder {

  
    @Override
    public void buildDescricao() {
        this.getComputador().setDescricao("PC doméstico");
    }

    @Override
    public void addComponentes() {
        
        this.getComputador().add(new Parte(600, "Placa Mãe - B450M"));
        this.getComputador().add(new Parte(600, "Memória Ram - 16GB"));
        this.getComputador().add(new Parte(600, "Processador - AMD Ryzen 5 5600x"));
        this.getComputador().add(new Parte(600, "Monitor - LG UltraWide 29UMG-B"));
        this.getComputador().add(new Parte(600, "Teclado - Hyperx"));
        this.getComputador().add(new Parte(600, "Mouse - Logitec 12000ppi"));
        this.getComputador().add(new Parte(600, "Cooler Master - 600w"));
    }

    @Override
    public void buildListaComponentes() {
        this.getComputador().setComponentes(new ArrayList<Componente>());
    }

}
