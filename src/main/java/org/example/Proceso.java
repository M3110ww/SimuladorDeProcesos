package org.example;

public class Proceso {

    private int id;
    private String nombre;
    private String tipo;
    private int duracion;
    private String estado;

    public Proceso(int id, String nombre, String tipo, int duracion) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.duracion = duracion;
        this.estado = "Listo";
    }

    public void ejecutarProceso() {
        System.out.println("Ejecutando proceso: " + nombre);
        estado = "En ejecución";

        try {
            Thread.sleep(duracion * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        estado = "Finalizado";
        System.out.println("org.example.Proceso finalizado.");
    }

    public void mostrarProceso() {
        System.out.println("ID: " + id +
                " | Nombre: " + nombre +
                " | Tipo: " + tipo +
                " | Duración: " + duracion + " seg" +
                " | Estado: " + estado);
    }
}