package org.example.carrera_solidaria;

import java.util.ArrayList;

public class Organizador {

    private static String NOMBREDEF = "IES MUTXAMEL";
    private static int contadorEdicion = 0;

    private String nombre;
    private String edicion;
    private ArrayList<Corredor> corredores;

    public Organizador(){
        contadorEdicion++;
        this.nombre = NOMBREDEF;
        this.edicion = String.valueOf(contadorEdicion);
        corredores = new ArrayList<Corredor>();
    }

    public Organizador(String edicion){
        contadorEdicion++;
        this.nombre = NOMBREDEF;
        this.edicion = edicion;
        corredores = new ArrayList<Corredor>();
    }

    public void inscribir_corredor(Corredor corredor){
        corredores.add(corredor);
    }

    public ArrayList<Corredor> getCorredores() {
        return corredores;
    }

    @Override
    public String toString(){
        return "Organizador [nombre= "+this.nombre+", edicion= "+this.edicion+", listaCorredores= "+getCorredores();
    }

    public void mostrarCorredores() {
        System.out.println("Corredores inscritos: "+corredores.size());
        for (Corredor corredor : corredores){
            System.out.println("["+corredor.getDorsal()+"]. "+corredor.getNombre());
        }
    }

    public void calcularDonacion(Corredor corredor) {
        System.out.println("El corredor "+corredor.getNombre()+" ha conseguido una donación de "+corredor.getImporte_vuelta()*corredor.getVueltas_completadas()+"€");
    }
}
