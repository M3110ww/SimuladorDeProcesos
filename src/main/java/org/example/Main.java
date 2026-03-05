package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorProcesos gestor = new GestorProcesos();

        int opcion;

        do {

            System.out.println("\n--- SIMULADOR DE PROCESOS ---");
            System.out.println("1. Crear proceso");
            System.out.println("2. Mostrar procesos");
            System.out.println("3. Ejecutar procesos");
            System.out.println("4. Salir");

            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:

                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Tipo (Sistema/Usuario): ");
                    String tipo = scanner.nextLine();

                    System.out.print("Duración en segundos: ");
                    int duracion = scanner.nextInt();

                    Proceso proceso = new Proceso(id, nombre, tipo, duracion);
                    gestor.agregarProceso(proceso);

                    break;

                case 2:
                    gestor.mostrarProcesos();
                    break;

                case 3:
                    gestor.ejecutarProcesos();
                    break;

            }

        } while (opcion != 4);

        System.out.println("Programa finalizado.");
    }
}