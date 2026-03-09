package org.example.model;

public class Proceso {

    public String id;
    public int duracion;
    public int prioridad;
    public int restante;
    public int espera;

    public Proceso(String id, int duracion, int prioridad) {

        this.id = id;
        this.duracion = duracion;
        this.prioridad = prioridad;
        this.restante = duracion;
        this.espera = 0;
    }
}