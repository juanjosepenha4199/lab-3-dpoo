package uniandes.dpoo.aerolinea.modelo;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

import uniandes.dpoo.aerolinea.exceptions.VueloSobrevendidoException;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class Vuelo {
    private Avion avion;
    private String fecha;
    private Ruta ruta;
    private Map<String, Tiquete> tiquetes = new HashMap<>();

    public Vuelo(Ruta ruta, String fecha, Avion avion) {
        this.ruta = ruta;
        this.fecha = fecha;
        this.avion = avion;
    }

    public Avion getAvion() { return avion; }
    public String getFecha() { return fecha; }
    public Ruta getRuta() { return ruta; }
    public Collection<Tiquete> getTiquetes() { return tiquetes.values(); }

    public int venderTiquetes(Cliente cliente, int cantidad) throws VueloSobrevendidoException {
        if (tiquetes.size() + cantidad > avion.getCapacidad()) {
            throw new VueloSobrevendidoException("No hay suficiente espacio en el vuelo para todos los pasajeros");
        }

        int tarifa = ruta.calcularTarifa(cliente, fecha);
        int valorTotal = tarifa * cantidad;

        for (int i = 0; i < cantidad; i++) {
            tiquetes.put(UUID.randomUUID().toString(), new Tiquete("", this, cliente, tarifa));
        }

        return valorTotal;
    }
}