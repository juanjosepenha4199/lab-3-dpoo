package uniandes.dpoo.aerolinea.modelo;

public class Avion {
    private int capacidad;
    private String nombre;

    public Avion(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }
}