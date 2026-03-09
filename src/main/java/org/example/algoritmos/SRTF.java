package org.example.algoritmos;

import org.example.model.Proceso;
import java.util.List;

public class SRTF {

    public static void ejecutar(List<Proceso> procesos) {

        int tiempo = 0;
        int completados = 0;

        System.out.println("\n===== SJF CON EXPULSIÓN (SRTF) =====\n");

        while (completados < procesos.size()) {

            Proceso actual = null;

            for (Proceso p : procesos) {

                if (p.restante > 0) {

                    if (actual == null || p.restante < actual.restante) {
                        actual = p;
                    }
                }
            }

            System.out.println("Tiempo CPU: " + tiempo +
                    " | Proceso activo: " + actual.id);

            actual.restante--;

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            tiempo++;

            if (actual.restante == 0) {

                completados++;

                actual.espera = tiempo - actual.duracion;

                System.out.println("Proceso " + actual.id + " terminado\n");
            }
        }
    }
}