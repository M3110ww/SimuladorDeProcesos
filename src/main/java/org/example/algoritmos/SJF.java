package org.example.algoritmos;

import org.example.model.Proceso;
import java.util.*;

public class SJF {

    public static void ejecutar(List<Proceso> procesos) {

        procesos.sort(Comparator.comparingInt(p -> p.duracion));

        int tiempo = 0;

        System.out.println("\n===== SJF =====\n");

        for (Proceso p : procesos) {

            p.espera = tiempo;

            System.out.println("Ejecutando proceso " + p.id);

            for (int i = 0; i < p.duracion; i++) {

                System.out.println("Tiempo CPU: " + tiempo +
                        " | Proceso activo: " + p.id);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                tiempo++;
            }

            System.out.println("Proceso " + p.id + " terminado\n");
        }
    }
}