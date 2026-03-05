package org.example;

import java.util.ArrayList;

public class GestorProcesos {

    private ArrayList<Proceso> listaProcesos = new ArrayList<>();

    public void agregarProceso(Proceso p) {
        listaProcesos.add(p);
    }

    public void mostrarProcesos() {
        for (Proceso p : listaProcesos) {
            p.mostrarProceso();
        }
    }

    public void ejecutarProcesos() {
        for (Proceso p : listaProcesos) {
            p.ejecutarProceso();
        }
    }
}