package or;

import org.example.algoritmos.FCFS;
import org.example.algoritmos.RobinRound;
import org.example.algoritmos.SJF;
import org.example.algoritmos.SRTF;
import org.example.model.Proceso;

import java.util.*;

public class Simulador {

    public static void main(String[] args) {

        List<Proceso> procesos = new ArrayList<>();

        procesos.add(new Proceso("P1",5,2));
        procesos.add(new Proceso("P2",3,1));
        procesos.add(new Proceso("P3",8,3));
        procesos.add(new Proceso("P4",4,2));

        FCFS.ejecutar(procesos);

        System.out.println();

        SJF.ejecutar(procesos);

        System.out.println();

        SRTF.ejecutar(procesos);

        System.out.println();

        RobinRound.ejecutar(procesos,2);
    }
}