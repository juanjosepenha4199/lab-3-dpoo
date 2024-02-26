package uniandes.dpoo.aerolinea.modelo;

public class Avion { String modelo;
int capacidadPasajeros;

public Avion(String modelo, int capacidadPasajeros) {
    this.modelo = modelo;
    this.capacidadPasajeros = capacidadPasajeros;
}
public String toString() {
    return "Avion [modelo=" + modelo + ", capacidadPasajeros=" + capacidadPasajeros + "]";
}

}
