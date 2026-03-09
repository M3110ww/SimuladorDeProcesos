package org.example;

import org.example.algoritmos.FCFS;
import org.example.algoritmos.RobinRound;
import org.example.algoritmos.SJF;
import org.example.algoritmos.SRTF;
import org.example.model.Proceso;

import java.util.ArrayList;
import java.util.List;

public class Simulador {

    public static void main(String[] args) {

        List<Proceso> procesos = new ArrayList<>();

        procesos.add(new Proceso("P1",5,2));
        procesos.add(new Proceso("P2",3,1));
        procesos.add(new Proceso("P3",8,3));
        procesos.add(new Proceso("P4",4,2));

        FCFS.ejecutar(new ArrayList<>(procesos));

        SJF.ejecutar(new ArrayList<>(procesos));

        SRTF.ejecutar(new ArrayList<>(procesos));

        RobinRound.ejecutar(new ArrayList<>(procesos),2);
    }
}