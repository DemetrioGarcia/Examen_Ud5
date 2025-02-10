package org.example.carrera_solidaria;

import java.util.ArrayList;
import java.util.Arrays;

public class Corredor {

    private static int numdorsal = 0;
    private static double IMP_VUELTADEF = 0.50;

    private String nombre;
    private int dorsal;
    private ArrayList<String> listaPatrocinadores;
    private double importe_vuelta;
    private int vueltas_completadas;

    public Corredor (String nombre, double importe_vuelta){
        numdorsal++;
        this.nombre = nombre;
        this.dorsal = numdorsal;
        listaPatrocinadores = new ArrayList<>();
        this.importe_vuelta = setImporte_vuelta(importe_vuelta);
        this.vueltas_completadas = 0;
    }

    private double setImporte_vuelta(double importe_vuelta) {
        if (importe_vuelta<0.50){
            return IMP_VUELTADEF;
        } else {
            return importe_vuelta;
        }
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public double getImporte_vuelta() {
        return importe_vuelta;
    }

    public int getVueltas_completadas() {
        return vueltas_completadas;
    }

    public void setNumero_vueltas(int vueltas_completadas) {
        this.vueltas_completadas = vueltas_completadas;
    }

//    public void insertarPatrocinador(String patrocinador) {
//        listaPatrocinadores.add(patrocinador);
//    }

    public void insertarPatrocinador(String ... patrocinador) {
        System.out.println("Nuevos patrocinadores añadidos para el corredor "+this.nombre);
        listaPatrocinadores.add(Arrays.toString(patrocinador));
    }

    @Override
    public String toString(){
        return "- Corredor [nombre= "+this.nombre+", dorsal= "+this.dorsal+", listaPatrocinadores= "+listaPatrocinadores+", importe_vuelta= "+this.importe_vuelta+", numero_vueltas= "+this.vueltas_completadas;
    }
}
