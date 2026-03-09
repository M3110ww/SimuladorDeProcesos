package org.example.algoritmos;

import org.example.model.Proceso;
import java.util.*;

public class RobinRound {

    public static void ejecutar(List<Proceso> procesos, int quantum) {

        Queue<Proceso> cola = new LinkedList<>(procesos);

        int tiempo = 0;

        System.out.println("\n===== ROUND ROBIN =====\n");

        while (!cola.isEmpty()) {

            Proceso p = cola.poll();

            System.out.println("CPU ejecutando: " + p.id);

            int ejecucion = Math.min(quantum, p.restante);

            for (int i = 0; i < ejecucion; i++) {

                System.out.println("Tiempo CPU: " + tiempo +
                        " | Proceso activo: " + p.id);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                tiempo++;
            }

            p.restante -= ejecucion;

            if (p.restante > 0) {

                System.out.println("Cambio de contexto -> " + p.id + " vuelve a la cola\n");

                cola.add(p);

            } else {

                p.espera = tiempo - p.duracion;

                System.out.println("Proceso " + p.id + " terminado\n");
            }
        }
    }
}